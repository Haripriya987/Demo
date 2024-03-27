public class IsFibo{
  public static String isFibo(long n) {
    long a=0;
    long b=1;
    while(n>b){
        long temp=a+b;
         a=b;
         b=temp;
    }
    return n==b?"IsFibo":"IsNotFibo";

    }
    public static void main(String[] args) {

        System.out.println(isFibo(5));
    }

}