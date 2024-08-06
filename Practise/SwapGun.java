import java.util.*;

class Codechef
{
	public static void main (String[] args) 
  	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    
		    int arr[]=new int[a];
		    for(int i=0;i<a;i++){
		        arr[i]=in.nextInt();
		    }
		    
		    int count=0;
		    boolean high=false;
		    for(int x:arr){
		       if(x>b && !high){
		           count++;
		           high=true;
		       }
		       else if(x<=b && high){
		           count++;
		           high=false;
		       }
		      
		}
		System.out.println(count);
		}

	}
}
