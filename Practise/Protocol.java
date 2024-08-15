import java.util.*;

class Protocol
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        while(n-->0){
            int a=in.nextInt();
            String s=in.next();
            int count=0;
            for(int i=0;i<a;i++){
                if(i!=a-1 && s.charAt(i)==s.charAt(i+1)){
                    i++;
                }
                count++;
            }
            
            System.out.println(count);
        }

	}
}
