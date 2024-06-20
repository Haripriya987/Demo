import java.util.Scanner;
class Channel
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n%2==0)
        System.out.println(n/2);
        else
        System.out.println((n/2)+1);
	}
}
