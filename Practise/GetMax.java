import java.util.*;

class GetMax
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    
		    int arr[]=new int[a];
		    int count=0;
		    for(int i=0;i<a;i++){
		        arr[i]=in.nextInt();
		        
		        if(arr[i]>b)
		            count++;
		    }
		    
		    System.out.println(count);
		    
		}
	}
}
