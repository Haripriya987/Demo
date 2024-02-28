public class RightRotateString {
   public static String rightRotateString(String s, int k) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        k = k % s.length();
        String rotatedString = s.substring(s.length() - k) + s.substring(0, s.length() - k);

        return rotatedString;
    }
    public static void main(String args[]){
      
    }
}
