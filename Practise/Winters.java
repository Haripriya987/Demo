import java.util.Scanner;

class Winters
{
	public static void main (String[] args) throws java.lang.Exception
	{   
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println(a/(2*b));
        }
	}
}
