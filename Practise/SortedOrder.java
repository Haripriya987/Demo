import java.util.Scanner;

public class SortedOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];
            
            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }
            
            boolean flag=true;
            for(int j=0;j<n-1;j++){
                if(d[j]>d[j+1])
                flag=false;
            }
            
            
            if(flag)
            System.out.println("Yes");
            else
            System.out.println("No");
            
        }
    }
}
