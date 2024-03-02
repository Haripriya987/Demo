public class MinimumNumber {
  public static int minimumNumber(int n, String password) {
    int missingTypes = 4; 
    for (char ch : password.toCharArray()) {
        if (Character.isUpperCase(ch)) {
            missingTypes--;
            break;
        }
    }
    for (char ch : password.toCharArray()) {
        if (Character.isLowerCase(ch)) {
            missingTypes--;
            break;
        }
    }
    for (char ch : password.toCharArray()) {
        if (Character.isDigit(ch)) {
            missingTypes--;
            break;
        }
    }
    for (char ch : password.toCharArray()) {
        if (!Character.isLetterOrDigit(ch)) {
            missingTypes--;
            break;
        }
    }

    return Math.max(missingTypes, 6 - n);
}

}
