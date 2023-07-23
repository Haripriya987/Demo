import java.util.Scanner;
class Prime{
      static boolean isPrime(int n){
            for(int i=1;i<n/2;i++){
	if(i%n==0)
                      return false;
	} 
	return true;
      }
	public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	 System.out.println("Enter any number");
	int a=in.nextInt();
	 System.out.println(isPrime(a));
         }
}
//Enter any number
37
true
Enter any number
48
true