import java.util.Scanner;

class Rent
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            long a=in.nextInt();
            long b=in.nextInt();
           
           if(b%a!=0)
            System.out.println(b/a);
           else
           System.out.println((b/a)-1);
           
           
        }

	}
}
