import java.util.Scanner;

class ChocolateDistribution
{
	public static void main (String[] args) throws java.lang.Exception
	{

            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            while(n-->0){
                int a=in.nextInt();
                int b=in.nextInt();
                
                if(a%b==0 && a/b%2==0){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }

	}
}
