import java.util.Scanner;

class LastFloor
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    float a=in.nextFloat();
		    float b=in.nextFloat();
		    float x=in.nextFloat();
		    float y=in.nextFloat();
		    float g=a/x;
		    float h=b/y;
		    if(g>h)
		    System.out.println("Chefina");
		    else if(g==h)
		    System.out.println("Both");
		    else 
		    System.out.println("Chef");
		}

	}
}
