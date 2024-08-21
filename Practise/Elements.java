import java.util.*;

public class Elements {
	public static void main (String[] args) 
	{
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
            
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
            }
            Arrays.sort(arr);
            int count=1;
            int max=0;
            for(int j=1;j<a;j++){
                if(arr[j]==arr[j-1])
                    count++;
                    
                else{
                max=Math.max(max,count);
                count=1;
                }
            }    
        
           max=Math.max(max,count);
        
        System.out.println(a-max);
        }
	}
}


