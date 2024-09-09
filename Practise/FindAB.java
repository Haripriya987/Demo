import java.util.Scanner;

class FindAB
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int x=in.nextInt();
		    int y=in.nextInt();
		    int z=in.nextInt();
		    if((x*y)%z==0 ){
              System.out.println((x*y)+" "+z);
		    }
		    else if((x*z)%y==0){
		    System.out.println((x*z)+" "+y);
		    }
		    else if((y*z)%x==0){
		    System.out.println((y*z)+" "+x);
		    }
		    else{
		    System.out.println("-1");
		    }
		        
		}
	}
}
