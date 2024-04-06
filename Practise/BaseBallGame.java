import java.util.Stack;

public class BaseBallGame{
  public static int calPoints(String[] operations) {
    Stack<Integer> s = new Stack<>();
    int sum = 0;

    for (String str : operations) {
        if (str.equals("+")) {
            int top = s.pop();
            int newTop = top + s.peek();
            s.push(top);
            s.push(newTop);
            sum += newTop;
        } else if (str.equals("D")) {
            int points = 2 * s.peek();
            s.push(points);
            sum += points;
        } else if (str.equals("C")) {
            int pointsToRemove = s.pop();
            sum -= pointsToRemove;
        } else {
            int points = Integer.valueOf(str);
            s.push(points);
            sum += points;
        }
    }

    return sum;
}
public static void main(String[] args){

 }
}