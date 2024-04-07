public class ReverseOnlyStrings{
  public static String reverseOnlyLetters(String s) {
    StringBuilder res = new StringBuilder();
    int j = s.length() - 1;
    for (int i = 0; i < s.length(); i++) {
        if (Character.isLetter(s.charAt(i))) {
            while (!Character.isLetter(s.charAt(j))) {
                j--;
            }
            res.append(s.charAt(j--));
        } else {
            res.append(s.charAt(i));
        }
    }
    return res.toString();
}
public static void main(String args[]){
String str="ab-cd";
System.out.println(reverseOnlyLetters(str));


//   Input: s = "ab-cd"
// Output: "dc-ba"
}
}