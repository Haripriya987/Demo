import java.util.Scanner;

class PartitionSequence
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int arr[]=new int[a];
		    
		    int odd=0;
		    int sum=0;
		    for(int i=0;i<a;i++){
		        arr[i]=in.nextInt();
		        
		        sum+=arr[i];

		        if(arr[i]%2!=0)
		        odd++;
		       
		    }
		    
		    if(odd!=0  && (odd%2==0 && sum%2==0))
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		    
		}

	}
}
