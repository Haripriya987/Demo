import java.util.Scanner;

class TestScore
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        
        while(n-->0){
            int arr[]=new int[3];
            
            for(int i=0;i<3;i++){
                arr[i]=in.nextInt();
            }
            
            if(arr[2]==0 || arr[2]%arr[1]==0)
            System.out.println("YES");
            else
            System.out.println("NO");
            
        }
        
	}
}
