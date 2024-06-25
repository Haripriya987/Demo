import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    
		    if(a+b<3)
		    System.out.println("1");
		    else if(a+b>=3 && a+b<=10)
		    System.out.println("2");
		    else if(a+b>=11 && a+b<=60)
		    System.out.println("3");
		    else
		    System.out.println("4");
		    
		}

	}
}
