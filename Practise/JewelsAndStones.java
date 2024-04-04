public class JewelsAndStones{
  public static int numJewelsInStones(String jewels, String stones) {
    int n=stones.length();
    int count=0;
    for(int i=0;i<n;i++){
        char ch=stones.charAt(i);
        if(jewels.indexOf(ch)!=-1)
        count++;
    }

    return count;
}
public static void main(String[] args) {
  String jewels = "aA", stones = "aAAbbbb";
  int count = numJewelsInStones(jewels, stones);
  System.out.println(count);
}

}