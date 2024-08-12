import java.util.Scanner;

class Salary
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int b=in.nextInt();
		    double res;
		    if(b<1500){
		        res=b+(0.1*b)+(0.9*b);
		    }
		    else{
		        res=b+500+0.98*b;
		    }
		    System.out.println(res);
		}

	}
}
