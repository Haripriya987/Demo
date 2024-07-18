import java.util.Scanner;

class MaximumCoins
{
    public static int Fact(int a,int b){
        int val=1;
        for(int k=0;k<b;k++){
            val*=a;
        }
        return val;
    }
	public static void main (String[] args) throws java.lang.Exception
	{

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int value=0;
            for(int i=a;i>(a-b);i--){
                value+=Fact(2,i);
            }
            
            for(int j=(a-b);j>0;j--){
                value-=Fact(2,j);
            }            

            System.out.println(value);
            
            
        }
	}
}
