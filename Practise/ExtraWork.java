import java.util.Scanner;


class ExtraWork
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
          Scanner in=new Scanner(System.in);
          int n=in.nextInt();
          while(n-->0){
              int a[]=new int[5];
              int sum=0;
              for(int i=0;i<5;i++){
                  a[i]=in.nextInt();
                  sum+=a[i];
              }
              
              int p=in.nextInt();
              
             if(sum*p<=120){
                 System.out.println("No");
             } 
             else{
                 System.out.println("Yes");
             }
              
              
              
              
        
              
          }
	}
}
