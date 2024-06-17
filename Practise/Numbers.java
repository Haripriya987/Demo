import java.util.Scanner;

class Numbers
{

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int res=a;
		    int ans=0;
		    while(a%10==9){
		        ans++;
		        a/=10;
		    }
                
		  if(ans%2==1)
		  System.out.println(res+2);
		  else
		  System.out.println(res+1);
                
		}
	}
}
