import java.util.Scanner;

class Savings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    
		    int total=a*b;
		    int count=0;
		    
		    while(total>c){
		        a--;
		        total=a*b;
		        count++;
		    }
		    
		    System.out.println(count);
		}

	}
}
