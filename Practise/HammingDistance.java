public class HammingDistance {

  public static int hammingDistance(int x, int y) {
    int hd=x^y,distance=0;

    while(hd!=0){
        if(hd%2==1)
            distance++;
        hd=hd>>1;
    }
    return distance;
}


  public static void main(String[] args) {
      System.out.println(hammingDistance(3, 1));    
  }
  
}
