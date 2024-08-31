import java.util.Scanner;

class MaxDifference
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		   
		   
		   int res=Math.abs(a-b);
		    if(res<=c)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		    
		    
		    
		}
		

	}
}

