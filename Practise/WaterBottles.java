import java.util.Scanner;

public class WaterBottles {
    public static void main (String[] args) 
    {
          Scanner in=new Scanner(System.in);
          int n=in.nextInt();
          while(n-->0){
              int a=in.nextInt();
              int b=in.nextInt();
              int c=in.nextInt();
              int res=0;
              
              while(c>=b && res<a){
                 
                 res++;
                 c-=b;
                  
              }
              System.out.println(res);
          }
    }
  }
  


