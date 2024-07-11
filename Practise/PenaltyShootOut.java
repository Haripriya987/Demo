
import java.util.Scanner;
public class PenaltyShootOut {
 	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    
		    int diff=a-b;
		    int diff2=b-a;
		    if(diff==0 || diff==1 || diff2==1 || diff2==2 ){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}

	}


  
}
