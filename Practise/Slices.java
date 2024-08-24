import java.util.Scanner;

class Slices
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();


		  while(n-->0){
		      int a=in.nextInt();
		      int b=in.nextInt();
		      
		      int count=0;
		      while(a!=b){
		          
		      if(a>b) {   
		      count+=a/2;
		      
		      if(a%2!=0)
		      count+=1;
		      
		      
		      a/=2;
		      }
		      
		      
		      if(b>a){
		          count+=b/2;
		  		
		  		if(b%2!=0)
		      count+=1;

		          b/=2;
		          
		      }
		  
		          
		      }
		      System.out.println(count);
		      
		  }
		    
		}

	}

