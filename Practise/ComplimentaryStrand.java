import java.util.Scanner;


public class ComplimentaryStrand {
  
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int z=in.nextInt();
		    String s=in.next();
            String res="";		   
		   int i=0;
		   while(i<s.length()){
		    if(s.charAt(i)=='A')
		       res+="T";
		    else if(s.charAt(i)=='T')
		    res+="A";
		    else if(s.charAt(i)=='C')
		    res+="G";
		    else if(s.charAt(i)=='G')
		    res+="C";
		    
		    i++;
		    }
		 
		 System.out.println(res);
		 
		}
		

	
}

}
