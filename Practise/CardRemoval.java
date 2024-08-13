import java.util.Scanner;

class CardRemoval
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
         Arrays.sort(arr);
         int max=0;
         int count=1;
         for(int j=1;j<a;j++){
             if(arr[j]==arr[j-1]){
                 count++;
             }
             else{
                 max=Math.max(count,max);
                 count=1;
            }   
         }
             max=Math.max(count,max);            
            System.out.println(a-max);
            
        }
        


	}
}

