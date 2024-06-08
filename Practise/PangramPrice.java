
import java.util.Scanner;
public class PangramPrice {
  public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		   int arr[]=new int[26];
		   for(int i=0;i<26;i++){
		       arr[i]=in.nextInt();
		   }  
		 
		 String str=in.next();
		 int sum=0;
		 for(int i='a';i<='z';i++){
		     if(str.indexOf(i)==-1){
		     sum+=arr[i-'a'];
		     }
		     
		 }
    
    
		    System.out.println(sum);
		}
	}
}

