import java.util.*;

class Candles
{
	public static void main (String[] args) throws java.lang.Exception
	{		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    
		    int k=b*c;
		    System.out.println(a%k==0?a/k:1+(a/k));
		}

	}
}
