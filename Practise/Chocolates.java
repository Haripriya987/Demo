import java.util.HashSet;

public class Chocolates {
      public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs=new HashSet<>();
        for(int x:candyType){
            hs.add(x);
        }
        int value=Math.min(hs.size(),candyType.length/2);
        return value;
    }
  public static void main(String args[]) {
    
  }
  
}
