import java.util.Scanner;

class PlayList
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
		    int k=in.nextInt();

		    int val=arr[k-1];
		    Arrays.sort(arr);
		    
		    int res=0;
		    for(int j=0;j<a;j++){
		        if(arr[j]==val){
		            res=j+1;
		            break;
		        }
		    }
		    System.out.println(res);
		    
		}

	}
}
