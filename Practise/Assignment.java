 import java.util.*;

class Assignment {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 
        while (t-- > 0) {
            int n = in.nextInt(); 
            int[] arr = new int[n];
            int[] count = new int[n + 1]; 
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                count[arr[i]]++;
            }

            boolean possible = true;

            for (int i = 1; i <= n; i++) {
                if (count[i] % i != 0) {
                    possible = false;
                    break;
                }
            }

            if (possible)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
 