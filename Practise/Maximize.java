import java.util.Scanner;

class Maximize
{
	public static void main (String[] args) throws java.lang.Exception
	{	
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    int d=in.nextInt();
		    System.out.println(Math.max(a,b)+Math.max(c,d));
		}

	}
}
