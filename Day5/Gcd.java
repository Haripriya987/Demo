import java.util.Scanner;
public class Gcd{
     static int gcd(int m,int n){
	while(m!=n){
	if(m>n)
	  m=m-n;
	else
	n=n-m;
	}
	return m;
    }
    public static void main(String args[]){
     Scanner in=new Scanner(System.in);
     System.out.println("Enter any two numbers");
     int a=in.nextInt();
     int b=in.nextInt();
      System.out.println(gcd(a,b));
      
    }
}
//Enter any two numbers
13   65
13
//Enter any two numbers
43 67
1