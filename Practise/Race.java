import java.util.*;

public class Race {

	public static void main (String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    int d=in.nextInt();
		    
		    int count=0;
		    if(a!=c && a!=d)
		    count++;
		     if(b!=c && b!=d)
		    count++;
		    
		    
		    System.out.println(count);
		    
		    
		}

	}
}

