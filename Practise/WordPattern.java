import java.util.HashMap;

public class WordPattern {
  public static boolean wordPattern(String pattern, String s) {
    HashMap<Character,String> hs=new HashMap<>();
    String arr[]=s.split(" ");
    if (pattern.length() != arr.length) {
        return false;
    }
    for(int i=0;i<arr.length;i++){
        char c=pattern.charAt(i);
        if(hs.containsKey(c)){
            if(!arr[i].equals(hs.get(c))){
                return false;
            }
        }
        else{
            if(hs.containsValue(arr[i]))
            return false;
            hs.put(c,arr[i]);
        }
    }
    return true;
    }
public static void main(String[] args) {
  String pattern = "abba";
  String s = "dog cat cat dog";
  System.out.println(wordPattern(pattern,s));
}
}
