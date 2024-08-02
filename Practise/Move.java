import java.util.*;

class Move
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=a/10 + (a%10==0? 0:1);
		    int d=b/10 + (b%10==0? 0:1);
		    System.out.println(Math.abs(c-d));
		}
		

	}
}
