import java.util.Scanner;

class Biscuits
{
	public static void main (String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int bis=in.nextInt();
		    int mul=bis/a;
		    int rem=bis%a;
		    int res;
		    if(mul==0){
		        res=a-bis;
		    }
		    else if(a*(mul+1)-bis< rem)
		      res=a*(mul+1)-bis;
		    
		    else
		    res=rem;
		    
		    System.out.println(res);
		}

	}
}
