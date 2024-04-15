public class Maximum69Number{
  public static int maximum69Number(int num) {
    int position = -1;
    int temp = num;
    int multiplier = 1;
    while (temp > 0) {
        if (temp % 10 == 6) {
            position = multiplier;
        }
        temp /= 10;
        multiplier *= 10;
    }
    
    if (position != -1) {
        num += 3 * position; 
    }

    return num;
}


  public static void main(String[] args) {
   
    System.out.println(maximum69Number(9696));
  }
}