import java.util.Scanner;

class Equal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int a=in.nextInt();
		    int b=in.nextInt();
		    String s1=in.next();
		    String s2=in.next();
		    int res=Integer.MAX_VALUE;
		    for(int i=0;i<a-b+1;i++){
		        String z=s1.substring(i,i+b);
		        int count=0;
		        for(int j=0;j<b;j++){
		             if(z.charAt(j)!=s2.charAt(j))
		             count++;
		        }
		        
		        res=Math.min(count,res);
		    }
		    
		    
		    System.out.println(res);
		    
		}

	}
}
