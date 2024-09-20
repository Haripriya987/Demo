import java.util.*;


public class LessTime {  
    public static void main (String[] args) throws java.lang.Exception
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      while(n-->0){
          int a=in.nextInt();
          int b=in.nextInt();
           
           int res1=(500-a*2)+(1000-(a+b)*4);
           int res2=(1000-(b*4))+(500-(a+b)*2);
           
           System.out.println(Math.max(res1,res2));
          
      }
          
    }
  }
  



