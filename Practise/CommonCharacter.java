import java.util.HashMap;
import java.util.Scanner;

public class CommonCharacter{

public static int CommonCharactersCounter(String str1,String str2){
  int count = 0;
  HashMap<Character, Integer> charCountMap = new HashMap<>();

  for (char ch : str1.toCharArray()) {
      charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
  }
  for (char ch : str2.toCharArray()) {
      if (charCountMap.containsKey(ch)) {
          count++;
      }
  }
  return count;

}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
            String str1 = in.next();
            String str2 = in.next();

        System.out.println(CommonCharactersCounter(str1, str2));
        in.close();
        }
    }


