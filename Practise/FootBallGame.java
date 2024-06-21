import java.util.Scanner;

class FootBallGame
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int res1=a%3;
            int res2=b%3;
            if(res1==0 && res2==0)
            System.out.println(res1);
            else
            System.out.println(Math.min(res1,res2));
        }

        in.close();
	}
}
