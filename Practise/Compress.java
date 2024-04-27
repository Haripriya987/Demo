import java.util.ArrayList;
public class Compress{
  public static int[] decompressList(int[] nums) {
    ArrayList<Integer> al=new ArrayList<>();

    int i=0;
    while(i<nums.length){
        for(int j=0;j<nums[i];j++){
            al.add(nums[i+1]);
        }
        i+=2;
    }
    int[] ans=new int[al.size()];
    for(int k=0;k<ans.length;k++){
        ans[k]=al.get(k);
    }
    return ans;

}
public static void main(String args[]){
int arr[]={1,2,3,4};
System.out.println(decompressList(arr));
}

}