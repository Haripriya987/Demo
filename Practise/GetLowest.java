import java.util.Scanner;

class GetLowest
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            
             int min = ((a<b) && (a<c)) ? a : (b<c ? b : c);
		    
		    if(min == a)
		        System.out.println(b+c);
		    else if(min == b)
		        System.out.println(a+c);
		    else if(min == c)
		        System.out.println(a+b);
        }
		

	}
}
