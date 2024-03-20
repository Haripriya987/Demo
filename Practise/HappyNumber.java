import java.util.HashSet;

public class HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while(n!=1){
            if (hs.contains(n) == false){
                hs.add(n);
            } else {
                return false;
            }

            int tot = 0, sum = 0;
            while(n>0){
                tot = n%10;
                n=n/10;
                sum+=tot*tot;
            }
            n= sum;
        }
        return true;
}
  public static void main(String[] args) {
    System.out.println(isHappy(19));

  }
  
}
