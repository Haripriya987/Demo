public class OddCounts{
  public static String generateTheString(int n) {
    StringBuilder sb=new StringBuilder();

    if(n%2==0){
        sb.append("a".repeat(n-1));
        sb.append("b");
    }
    else{
        sb.append("z".repeat(n));
    }

    return sb.toString();
}
public static void main(String[] args) {
  System.out.println(generateTheString(4));
}
}