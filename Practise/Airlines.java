import java.util.Scanner;

class Airlines
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    
		    int a=in.nextInt();
		    int b=in.nextInt();
		    
		    int res=( (b>a*100) ? (b-a*100) : 0);
		    
		    if(res%100==0)
		    System.out.println(res/100);
		    else
		    System.out.println(res/100+1);
		    
		    
		}

	}
}
