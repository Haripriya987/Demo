public class ReverseStringVowels{
  public static String reverseVowels(String s) {
    char[] chars=s.toCharArray();
    int start=0;
    int end=s.length()-1;
   String v="aeiouAEIOU";
   while(start<end){
       while(start<end && v.indexOf(chars[start])==-1){
           start++;
       }
        while(start<end && v.indexOf(chars[end])==-1){
           end--;
       }
       char temp=chars[start];
       chars[start]=chars[end];
       chars[end]=temp;

       start++;
       end--;
   }
       return String.valueOf(chars);
   }
   public static void main(String args[]){
    String s = "hello";
    System.out.println(reverseVowels(s));
   }
}