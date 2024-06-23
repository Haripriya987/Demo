import java.util.Scanner;

class Rectangle
{
	public static void main (String[] args)
	{
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    int d=in.nextInt();
		    
		    if(a==b && c==d)
		    System.out.println("YES");
		    else if(a==c && b==d)
		    System.out.println("YES");
		   else if(a==d && c==b)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		    
		}

	}
}
