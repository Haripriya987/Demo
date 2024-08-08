
import java.util.*;

public class EqualMatch {


	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    int z=in.nextInt();
		    
		   boolean flag=false;
		   if(a==b || b==c || c==a){
		       flag=true;
		   }
		   else{ 
		       
		   for(int d=1;d<=z;d++){      
		   if((a+d==b) || (a+d==c) || (b+d==a) || (b+d==c) || (c+d==a) || (c+d==b))
		       flag=true;
		   
		   }
		   }
		   if(flag)
		   System.out.println("YES");
		   else
		   System.out.println("NO");
		   
		    
		}

	}



}