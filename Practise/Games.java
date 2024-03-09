  
public class Games{
  public static int howManyGames(int p, int d, int m, int s) {
    int count = 0;

    while (s >= p) {
        count++;
        s -= p;
        p = Math.max(p - d, m);
    }

    return count;
}
public static void main(String args[]){
  
}
}