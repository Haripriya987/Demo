public class ReverseGame{
  public static int reverseGameindex(int n,int k){
    int len = n / 2 + n % 2;
    int[] arr = new int[n];
    int j = 0;

    for (int i = 0; i < len; i++) {
    arr[j] = n - 1 - i;
    if (i == len - 1 && n % 2 != 0) {
    break;
    } else {
    arr[j + 1] = i;
    }
    j += 2;
  }
 int index=0;
  for (int m = 0; m < n; m++) {
  if (k == arr[m]) {
    index=m;
    break;
  }
}
  return index;
}

  public static void main(String[] args) {
    
  }
}