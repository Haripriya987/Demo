import java.util.*;

class MarioSize
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
	    while(n-->0){
	        int a=in.nextInt();
	        if(a%3==0)
	        System.out.println("NORMAL");
	        else if(a%3==1)
	        System.out.println("HUGE");
            else 
          System.out.println("SMALL");

	    }

	}
}
