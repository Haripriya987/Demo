import java.util.Scanner;

class FindSqrt
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int i=1;
		    while(i*i<a){
		    
		     i++;
		    }
		    System.out.println(i*i>a?i-1:i);
		    
		}
		

	}
}
