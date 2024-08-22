import java.util.Scanner;

public class GameWL {
	public static void main (String[] args) throws java.lang.Exception
	{            
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            String str=in.next();
            int z=str.length();
            int count1=0;
            int count0=0;
            for(int j=0;j<z;j++){
                if(str.charAt(j)=='1')
                count1++;
                else
                count0++;
            }
            System.out.println((count1>count0)?"WIN":"LOSE");            
        }
	}
}


