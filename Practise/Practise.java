import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            
            int res=2*(180+a);
            int res2=b+c;
            System.out.println(res-res2);
        }
	}
}
