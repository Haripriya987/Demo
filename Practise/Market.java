import java.util.Scanner;

class Market
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int t=in.nextInt();
		    int arr[]=new int[3];
		    for(int i=0;i<3;i++){
		        arr[i]=in.nextInt();
		    }
		    
		    Arrays.sort(arr);
		    System.out.println((t-1)*arr[0]+arr[1]);
		    
		    
		    
		     
		    
		}

	}
}
