
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int res=0;
		    while(a>0){
		       int rem=a%10;
		       res=res*10+rem;
		       a/=10;
		    }
		    System.out.println(res);
		}

	}
}

