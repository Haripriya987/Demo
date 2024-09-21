import java.util.Scanner;

class BlackJack
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int res=21-a-b;
		    
		    if(res<=10 )
		    System.out.println(res);
		    else
		    System.out.println(-1);
		}

	}
}
