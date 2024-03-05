public class ArmStrong {
  public static boolean isArmstrong(int num) {
    int originalNum = num;
    int numberOfDigits = String.valueOf(num).length();
    int sum = 0;

    while (num != 0) {
        int digit = num % 10;
        sum += Math.pow(digit, numberOfDigits);
        num /= 10;
    }

    return sum == originalNum;
}
public static void main(String args[]){
System.out.println(isArmstrong(123));
}
}
