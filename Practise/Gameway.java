import java.util.Scanner;


public class Gameway {

	public static void main (String[] args) 
	{
        Scanner in=new Scanner(System.in);
        int z=in.nextInt();
        
        while(z-->0){
           int n=in.nextInt();
           int m=in.nextInt();
           
           if(n>m){
               System.out.println(2*m+1);
           }
           else{
               System.out.println(-1);
           }
           
            
        }
	}
}


