import java.util.HashMap;
public class FirstUniqueCharacter{
  public static int firstUniqChar(String s) {
    HashMap<Character,Integer> hm=new HashMap<>();
    for(int i=0;i<s.length();i++){
     hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
    } 

     int index=-1;
     for(int i=0;i<s.length();i++){
         if(hm.get(s.charAt(i))==1){
             index=i;
             break;
         }
    }

    return index;

 }
 public static int firstUniqChar2(String s) {
  int arr[]=new int[26];
  for(int i=0;i<s.length();i++){
  arr[s.charAt(i)-'a']++;
  }

  int index=-1;
  for(int i=0;i<s.length();i++){
      if(arr[s.charAt(i)-'a']==1){
          index=i;
          break;
      }

  }
  return index;


}
 public static void main(String[] args) {
  String s="leetcode";
  System.out.println(firstUniqChar(s));
  System.out.println(firstUniqChar2(s));

 }
}