import java.util.Scanner;

class ArithmeticProgression
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int x=in.nextInt();
		    int y=in.nextInt();
		    int z=in.nextInt();
		    
		    int res1=y-x;
		    int res2=z-y;
		   
		   if(res1==res2){
		       System.out.println(0);
		   } 
		   else{
		       System.out.println(1);
		   }
		   
		   
		   
		   
		    
		}

	}
}
