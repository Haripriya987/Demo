import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    int sub=in.nextInt();
		    
		    if(a+b>=sub || b+c>=sub || c+a>=sub)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		    
		}

	}
}
