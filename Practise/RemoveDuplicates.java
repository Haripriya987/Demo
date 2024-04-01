public class RemoveDuplicates{
    public static int removeDuplicates(int[] nums) {
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(c==1|| nums[i]!=nums[c-2] ){
                nums[c++]=nums[i];
            }
        }
        return c;
    }
public static void main(String[] args) {
  int arr[]={0,0,0,1,1,2,3,3,5};
  System.out.println(removeDuplicates(arr));
}
}