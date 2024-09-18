import java.util.Scanner;

class MinTime
{
	public static void main (String[] args) 
	{
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int x=in.nextInt();
		    int y=in.nextInt();
		    int z=in.nextInt();
		    
		    System.out.println(Math.min(x*y,x+z));
		    
		    
		}

	}
}
