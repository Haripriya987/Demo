import java.util.*;

class Absolute
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int z=in.nextInt();
		int res=Math.abs(n-m);
		if(res<=z)
		System.out.println("Yes");
		else
		System.out.println("No");

	}
}
