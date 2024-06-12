import java.util.Scanner;
public class MoneyProblem{
  public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int m=in.nextInt();
		    int s=in.nextInt();
		    int res=m%2==1?1:0;
		    m=m-res;
		    res=res+m/s;
		    int reamining=m%s;
		    if(reamining>0)
		    res+=1;
		    
		    System.out.println(res);
		    
		}

	}

}