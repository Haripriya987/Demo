public class CaesarCipher {

  public static String caesarCipher(String s, int k) {
    String res="";
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if((ch>='a' && ch<='z')||(ch>='A' && ch <='Z')){
        char base = (ch >= 'a' && ch <= 'z') ? 'a' : 'A';
        res += (char) ((ch - base + k) % 26 + base);
        }
        else{
            res+=ch;
        }
    }
    
    return res;
}
public static void main(String args[]){
  System.out.println(caesarCipher("abc", 2));
}
  
}
