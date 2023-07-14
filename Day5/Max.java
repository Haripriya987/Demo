//Max of an array
import java.util.Scanner;
public class  Max{
       static int maxArray(int a[]){
            int max=a[0];
         for(int i=0;i<a.length;i++){
	if(a[i]>max)
	max=a[i];
	}
	return max;
      }
      public static void main(String args[]){
	int a[]={3,4,67,78,6,8};
	System.out.println(maxArray(a));
      }
}

//78