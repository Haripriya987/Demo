import java.util.Scanner;

public class PractiseQuestion {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);

		int a=in.nextInt();
		int b=in.nextInt();
		
		if(a==1 && b==1){
		    System.out.println("Discuss");
		}
		else if(a==1 && b==0){
		    System.out.println("contest");
		}
		else {
		 System.out.println("practice");  
		}
		
		
		

	}
}


