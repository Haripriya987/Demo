public class SortArrayByParity {
  public static int[] changeArrayByParity(int[] nums) {
    int s = 0;
    int e = nums.length - 1;
    while (s < e) {
        if (nums[s] % 2 != 0 && nums[e] % 2 == 0) {
        
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
        }

  
        if (nums[s] % 2 == 0) {
            s++;
        }
        if (nums[e] % 2 != 0) {
            e--;
        }
    }
    return nums;
}
public static void main(String args[]){
  int nums[]={1,2,3,4,5};
  System.out.println(changeArrayByParity(nums).toString());
}

}
