import java.util.Scanner;

class BestScore 
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int alice[]=new int[3];
            int bob[]=new int[3];
            for(int i=0;i<3;i++){
                alice[i]=in.nextInt();
            }
            for(int j=0;j<3;j++){
                bob[j]=in.nextInt();
            }
            Arrays.sort(alice);
            Arrays.sort(bob);
            
            int sum1=alice[2]+alice[1];
            int sum2=bob[2]+bob[1];
            
            if(sum1>sum2)
            System.out.println("Alice");
            else if(sum2>sum1)
            System.out.println("Bob");
            else
            System.out.println("Tie");
            
        }
	}
}

