public class ChocolatesCount 
  {
    public static int chocolateCount(int t,int c){
        if(t<c)
        return 0;
    
    return t/c;
    }
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int t=in.nextInt();
		    int c=in.nextInt();
		    System.out.println(chocolateCount(t,c));
		}

	}
}

  

