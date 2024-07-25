import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int m=in.nextInt();
		    int k=in.nextInt();
		    
		    if(m-k >= a){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		    
		}

	}
}
