import java.util.Scanner;

class Presents
{
	public static void main (String[] args) throws java.lang.Exception
	{		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int res=a/5;
		    int rem=a%5;
		    System.out.println(res*4 +rem);
		    
		
		    
		}

	}
}
