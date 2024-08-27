import java.util.Scanner;

class PractiseProblem
{
	public static void main (String[] args) throws java.lang.Exception
	{

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        if(n<8)
        System.out.println("LESS");
        else if(n>8)
        System.out.println("MORE");
        else
        System.out.println("PERFECT");
	}
}
