public class StringEncoding {
  
  public static String numberEncoding2(String str) {
    StringBuilder res = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (Character.isUpperCase(ch)) {
            int value = Character.getNumericValue(ch) - 10;
            res.append(value);
        } else if (Character.isLowerCase(ch)) {
            int value = Character.getNumericValue(ch) - 36;
            res.append(value);
        } else {
            res.append(ch);
        }
    }

    return res.toString();
}
public static void main(String args[]){

String res= numberEncoding2("Str123QW");
System.out.println(numberEncoding2(res));
}
}
