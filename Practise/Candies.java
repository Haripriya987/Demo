import java.util.Scanner;

public class Candies {
	public static void main (String[] args) throws java.lang.Exception
	{	
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    
		    int diff=a-b;
		    if(diff>0){
		       int res=diff%4;
		        System.out.println(diff/4+ (res>0?1:0));
		    }
		    else {
		        System.out.println(0);
		    }  		  
		}
	}
}


