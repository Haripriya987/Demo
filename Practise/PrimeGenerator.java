import java.util.Scanner;

class PrimeGenerator
{
	public static void main (String[] args) 
	{

		 Scanner in=new Scanner(System.in);
		 int t=in.nextInt();
		 while(t-->0){
		    	int n = in.nextInt();
			int m = in.nextInt();
			
			int i , j , k ;
			
			for(i = n ; i <= m ; i++) {
				k = 1 ;
				for(j = 2 ; j*j <= i ; j++) {
					if(i % j == 0) {
						k = 0;
						break ;
					}
				}
				if(k == 1 && i != 1)
					System.out.println(i);
			}
		     
		 }
		 

	}
}
