import java.util.*;
public class ArrayRemoveDuplicates {
    public static ArrayList<Integer> remove(int a[]){
        ArrayList<Integer> rev=new ArrayList<>();
        rev.add(a[0]);
        for(int i=1;i<a.length;i++){
            int no=a[i];
            int index=0;
            for(int j=0;j<i;j++){
                if(a[j]==no) {
                    index++;
                    break;
                }
            }
            if(index==0)
                rev.add(no);
        }

        return rev;
    }
    public static void main(String[] args){
      int arr[]={3,4,5,2,3,1,3,1};
      ArrayList<Integer> result=remove(arr);

      for(int z=0;z<result.size();z++)
          System.out.print(result.get(z)+ " ");
    }
}
