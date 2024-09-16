import java.util.Scanner;

class Items
{
	public static void main (String[] args) throws java.lang.Exception
	{
		    Scanner in=new Scanner(System.in);
		    int n=in.nextInt();
		    while(n-->0){
		        int a=in.nextInt();
		        
		        System.out.println(a%10==0? a/10:1+(a/10));
		    }
	}
}
