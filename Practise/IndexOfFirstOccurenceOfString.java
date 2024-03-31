public class IndexOfFirstOccurenceOfString{
  public int strStr(String haystack, String needle) {
    if (haystack.equals(needle)) {
        return 0;
    }
    int len = needle.length();
    for (int i = 0; i <= haystack.length() - len; i++) {
        if (haystack.substring(i, len + i).equals(needle)) {
            return i;
        }
    }
    return -1;
  }
    public static void main(String[] args){

    }

}