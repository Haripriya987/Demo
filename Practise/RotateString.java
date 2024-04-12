public class RotateString{
  public static boolean rotateString(String s, String goal) {
    StringBuilder res=new StringBuilder(s);
    for(int i=0;i<s.length();i++){
        char ch=res.charAt(0);
        res.deleteCharAt(0);
        res.append(ch);
        if(res.toString().equals(goal))
            return true;

    }
    return false;
}
public static void main(String[] args) {
  System.out.println(rotateString("abcde","cdeab"));
}
}