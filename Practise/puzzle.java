import java.util.Scanner;
class Puzzle
{
	public static void main (String[] args) throws java.lang.Exception
	{
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       while(n-->0){
         int a=in.nextInt();
        System.out.println((Math.round(Math.pow((0.133*a),a))));

       }
	}
}
