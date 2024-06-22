import java.util.Scanner;

class EqualizeAB
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		 int a=in.nextInt();
		 int b=in.nextInt();
		 int x=in.nextInt();
		 int diff=Math.abs(a-b);
		 
		 if(a==b){
		     System.out.println("YES");
		 }
         else if(diff%(2*x)==0)
		     System.out.println("YES");
		
		else
		    System.out.println("NO");
		
	}
	}
}
