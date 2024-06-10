import java.util.Scanner;

class MinMaxSpread
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
            
            int min=9999;
            int max=1;
            int count=1;
            
            for(int i=0;i<a-1;i++){
                if(arr[i+1]-arr[i]<=2){
                    count++;
                }
                else{
                    min=Math.min(count,min);
                    max=Math.max(count,max);
                    count=1;
                }
                
            }
             min=Math.min(count,min);
             max=Math.max(count,max);
            
            System.out.println(min+" "+max);
            
        }
	}
}
