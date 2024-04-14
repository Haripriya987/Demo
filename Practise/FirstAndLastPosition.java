public class FirstAndLastPosition{
  public static int[] searchRange(int[] nums, int target) {
    int n = nums.length;
    int[] res = {-1, -1};
    int start = -1;
    
    for (int i = 0; i < n; i++) {
        if (nums[i] == target) {
            if (start == -1) {
                start = i;
            }
            res[1] = i;
        }
    }
    
    if (start != -1) {
        res[0] = start;
    }
    
    return res;
}
public static void main(String[] args) {
  int arr[]={1,2,3,3,4,5};
  System.out.println(searchRange(arr,3));
}
}