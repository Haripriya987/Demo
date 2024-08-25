import java.util.Scanner;

public class Question {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    
		    int res=b*3-(a-b);
		    
		    if(res>=c)
		    System.out.println("PASS");
		    else 
		    System.out.println("FAIL");
		    
		    
		    
		}

	}
}



