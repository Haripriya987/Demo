import java.util.Scanner;

class CyclicQuadrilateral
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    int d=in.nextInt();
		    
		    if(a+c==180 && b+d==180)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}

	}
}
