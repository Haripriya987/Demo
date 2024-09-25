import java.util.Scanner;

public class FruitStand {
  
	public static void main (String[] args) throws java.lang.Exception
	{

            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            while(n-->0){
                int apples=in.nextInt();
                int bananas=in.nextInt();
                
                System.out.println(Math.min(apples/2,bananas));
            }
	}


}
