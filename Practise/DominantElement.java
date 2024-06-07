import java.util.Scanner;
public class DominantElement {
  
  public static void main (String[] args) throws java.lang.Exception
	{

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int a=in.nextInt();
            int arr[]=new int[a];
            int demo[]=new int[1001];
            for(int i=0;i<a;i++){
                arr[i]=in.nextInt();
                demo[arr[i]]++;
            }
            Arrays.sort(demo);
            if(demo[1000]!=demo[999])
            System.out.println("YES");
            else
            System.out.println("NO");
        }
	}

}
