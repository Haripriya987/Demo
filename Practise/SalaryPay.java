import java.util.*;

class SalaryPay
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    String str=in.next();
		   
		   int ones=0;
		   int count=0;
		   int max=0;
		   int i=0;
		   for(;i<str.length();i++){
		       if(str.charAt(i)=='1'){
		         ones++;
		         count++;
		          max=Math.max(count,max);
		        }   
	
		       else{
		           count=0;
		       }  
		   }
		   
		   
		   System.out.println(ones*a+max*b);
		    
		    
		}

	}
}
