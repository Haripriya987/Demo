import java.util.Scanner;

class Detective
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i=0;i<n;i++){
		    arr[i]=in.nextInt();
		    hs.add(arr[i]);
		}
		
		for(int i=1;i<=n;i++){
		    if(!hs.contains(i))
		    System.out.print(i+" ");
		}
		System.out.println();

	}
}
