import java.util.Scanner;

class Crayons
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    String str=in.next();
		    int count=0;
		    
		    for(int i=1;i<str.length();i++){
		        char ch=str.charAt(i);
		        if(str.charAt(i)!=str.charAt(i-1)){
		            count++;
		        }
		        
		    }
		    
		   System.out.println((count+1)/2);
		    
		}
		

	}
}
