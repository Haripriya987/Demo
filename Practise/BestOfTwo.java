import java.util.Scanner;

public class BestOfTwo {
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int b=in.nextInt();

     if(n>b){
      System.out.println(n);
     }  
     else
     System.out.println(b);
  }
}
