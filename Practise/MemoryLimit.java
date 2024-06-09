import java.util.Scanner;

public class MemoryLimit{
  public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int arr[]=new int[a];
		    for(int i=0;i<a;i++){
		        arr[i]=in.nextInt();
		    }
		   long sum=arr[0];
		    for(int j=1;j<a;j++){
		            if(arr[j]>arr[j-1])
		            sum+=arr[j]-arr[j-1];
		    }
		    System.out.println(sum);

		}

	}
}

