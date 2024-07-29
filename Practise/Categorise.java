import java.util.Scanner;

class Categorise
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int M=in.nextInt();
		    int H=in.nextInt();
		    
		    int res=M/(H*H);
		    
		    if(res<=18)
		        System.out.println(1);
		    else if(res>18 && res<=24)
		    System.out.println(2);
		    
		    else if(res>24 && res<=29)
		    System.out.println(3);
		    else
		    System.out.println(4);
		}

	}
}
