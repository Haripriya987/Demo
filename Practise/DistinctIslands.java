import java.util.Scanner;
public class DistinctIslands {
  public static void main (String[] args) throws java.lang.Exception
	{

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int z=in.nextInt();
            int k=in.nextInt();
            int parts=k-1;
            boolean res=false;
            if(k==1)
            res=true;
            
            if(z>k)
            res=(k*(k+1))/2 <= z-parts;
        
            if(res)
            System.out.println("YES");
            else
            System.out.println("NO");
        
        }
	}

  
}
