public class XORPalindrome{
  public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		  int t=in.nextInt();
		  String a=in.next();
		  int count=0;
		  for(int i=0;i<t/2;i++){
		      if(a.charAt(i)!=a.charAt(t-i-1))
		      count++;
		  }
		  
		  System.out.println((count+1)/2);
		}

	}
}