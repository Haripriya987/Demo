class ConvertToTitle {
  public static String convertToTitle(int columnNumber) {
    StringBuilder sb = new StringBuilder();
    while (columnNumber > 0) {
      columnNumber--;
      sb.insert(0, (char)('A' + columnNumber % 26));
      columnNumber /= 26;
    }
    return sb.toString();
  }

public static void main(String args){
System.out.println(convertToTitle(28));

  }
}
