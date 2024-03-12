public class Squares {
  public static int squares(int a, int b) {
    
    int count=0;
    int start=(int)Math.ceil(Math.sqrt(a));
    int end=(int)Math.floor(Math.sqrt(b));
    for(int i=start;i<=end;i++){
        int val=i*i;
        if(val>=a && val<=b)
        count++;
    }
    return count;

    }

  public static void main(String args[]) {
    System.out.println(squares(10, 15));
  }
  
}
