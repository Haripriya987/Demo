import java.util.Scanner;

public class Marks {


	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int a=in.nextInt();
            if(a>65)
            System.out.println("Overload");
            else if(a<35)
            System.out.println("Underload");
            else
            System.out.println("Normal");
        }
	}
}


