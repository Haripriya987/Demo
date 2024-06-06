import java.util.Scanner;
public class MaxSumDifference{
  public static int maxSum(int arr[],int n,int k){
    if(n==1)
    return 0;
    
    int iSum=0;
    for(int i=1;i<n;i++){
        iSum+=Math.abs(arr[i]-arr[i-1]);
    }
    int maxDifference=iSum;
    
    for(int j=0;j<n;j++){
        int original=arr[j];
        int curSum;
        
        for(int x:new int[]{1,k}){
            arr[j]=x;
            curSum=0;
            
            for(int z=1;z<n;z++){
            curSum+=Math.abs(arr[z]-arr[z-1]);
         }
        
        maxDifference= Math.max(maxDifference,curSum);
            
        }
        
        arr[j]=original;
        
    }
    return maxDifference;
}

public static void main (String[] args) throws java.lang.Exception
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
while(n-->0){
   int s=in.nextInt();
   int k=in.nextInt();
    int arr[]=new int[s];
 
 for(int i=0;i<s;i++){
     arr[i]=in.nextInt();
     
 }
 
 int res=maxSum(arr,s,k);
 System.out.println(res);
}

}

}