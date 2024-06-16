import java.util.Scanner;

public class PlayingWithStrings{
  public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		 int a=in.nextInt();
		 String str=in.next();
		 String str2=in.next();

		 int cnt1=0;
		 int cnt2=0;
		 
		 for(int i=0;i<a;i++){
		     char ch1=str.charAt(i);
		     char ch2=str2.charAt(i);
		     
		        
		     if(ch1=='0'){
		        cnt1++;
		     }
		     
		     if(ch2=='0')
		     cnt2++;
		 }
		 
		 if(cnt1==cnt2)
		 System.out.println("YES");
		 else
		 System.out.println("NO");
		    
		}
	}

}