import java.util.Scanner;

class CountHolidays
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]={6,7,13,14,20,21,27,28};
		while(n-->0){
		    int z=in.nextInt();
		    int res[]=new int[z];
		    for(int i=0;i<z;i++){
		        res[i]=in.nextInt();
		    }
		    int count=0;
		    for(int j=0;j<z;j++){
		        int v=res[j];
		        boolean flag=false;
		        for(int y=0;y<arr.length;y++){
		            if(v==arr[y]){
		                flag=true;
		              break; 
		            }
		        }
		        
		        if(!flag)
		        count++;
		        
		        
		    }
		    
		    System.out.println(count+8);
		    
		}

	}
}
