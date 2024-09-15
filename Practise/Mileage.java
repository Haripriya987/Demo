import java.util.Scanner;
class Mileage
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    double N=in.nextInt();
		    double x=in.nextInt();
		    double y=in.nextInt();
		    double a=in.nextInt();
		    double b=in.nextInt();
		    
		    double res1=(N/a)*x;
		    double res2=(N/b)*y;
		    
		    if(res1==res2)
		    System.out.println("ANY");
		    else if(res1>res2)
		    System.out.println("DIESEL");
		    else
		    System.out.println("PETROL");
		}

	}
}
 
