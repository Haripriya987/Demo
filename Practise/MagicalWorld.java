import java.util.Scanner;

class MagicalWorld
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    
		    int res1=a*b;
		    int res2=c*c;
		    
		    int count=0;
		    if(res1<=res2){
		       count=0;
		    }
		    
		    else if(a<=res2 || b<=res2)
		         count=1;
		   
		      else 
		      count=2;
		    
		    
		    System.out.println(count);
		}
		
		

	}
}
