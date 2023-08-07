import java.util.Scanner;
import java.lang.*;
public class LCM{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int n=Math.max(Math.max(a,b),c);
        while(true){
            if(n%a==0 && n%b==0 && n%c==0){
                System.out.println(n);
                break;
            }
            n++;

        }
        in.close();
    }
}