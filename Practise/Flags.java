import java.util.Scanner;

class Flags
{
	public static void main (String[] args) 
	{
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){

		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    
		    int max=Math.max(a,Math.max(b,c));
		    
		    int sum=a+b+c-max;
		    
		    if(max<=sum+1){
		        System.out.println("YES");
		    }
		    
		    else{
		        System.out.println("NO");
		    }

		}

	}
}
