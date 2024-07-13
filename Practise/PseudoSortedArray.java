import java.util.Scanner;

class PseudoSortedArray
{
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
		    		    
		    for(int i=0;i<a-1;i++){
		        if(arr[i]>arr[i+1])
		        {
		            int temp=arr[i];
		            arr[i]=arr[i+1];
		            arr[i+1]=temp;
		            break;
		        }
		    }
		    
		    int count=0;
		    for(int k=0;k<a-1;k++){
		        if(arr[k]>arr[k+1]){
		           count++;
		        } 
          }
		    System.out.println(count==0?"YES":"NO");
		    
		}

	}
}
