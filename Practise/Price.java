import java.util.Scanner;

class Price
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int val=in.nextInt();
		    int arr[]=new int[a];
		    int tot=0;
		   for(int i=0;i<a;i++){
		        arr[i]=in.nextInt();
		        tot+=arr[i];
		    }
		    
		    int res=0;
		    for(int j=0;j<a;j++){
		        if(arr[j]>val)
		        res+=val;
		        else
		        res+=arr[j];
		    }
		    
		    System.out.println(tot-res);
		}

	}
}
