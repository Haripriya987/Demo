import java.util.Scanner;
public class Indivisible {
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    int z=2;
		    while(z<=100){
		        
		        if(a%z!=0 && b%z!=0  && c%z!=0){
		            break;
		        }
		        z++;
		    }
		    System.out.println(z);
		}

	}


}
