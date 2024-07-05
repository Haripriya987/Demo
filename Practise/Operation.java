import java.util.*;

class Operation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int b=in.nextInt();
		char str=in.next().charAt(0);
		if(str=='+')
		System.out.println(n+b);
		else if(str=='-')
		System.out.println(n-b);
        else if(str=='*')
        System.out.println(n*b);
        else
        System.out.println((double)n/(double)b);
		
	}
}
