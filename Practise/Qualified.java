import java.util.Scanner;

class Qualified
{
	public static void main (String[] args) throws java.lang.Exception
	{

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            
            int res=b*1+c*2;
            
            if(res>=a)
            System.out.println("Qualify");
            else 
            System.out.println("NotQualify");
        }
	}
}
