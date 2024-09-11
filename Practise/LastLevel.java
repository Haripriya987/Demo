import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) t
	{
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		while(x-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    int res1=a*b;
		    int res2=0;
		    while(a>3){
		        if(a%3==0){
		           res2=a/3;
		           res1+=(res2-1)*c;
		           a=a%3;
		        }
		        else{
		           res2=a/3;
		           res1+=(res2*c);
		           a=a%3;
		        }
		      
		    }
		    
		    System.out.println(res1);
		    
		}

	}
}
