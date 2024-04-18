public class ChangeWord {
  
  public static String wordChange(String sentence) {
    String[] words = sentence.split(" ");
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
        String word = words[i];
        char firstChar = Character.toLowerCase(word.charAt(0));
        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
            result.append(word).append("ma");
        } else {
            result.append(word.substring(1)).append(word.charAt(0)).append("ma");
        }
        for (int j = 0; j <= i; j++) {
            result.append('a');
        }
        result.append(' ');
    }
    return result.toString().trim();
}
public static void main(String args[]){
System.out.println(wordChange("waiting for the chance"));
}
}
