public class MaximumSubArray{

  
    public static int maxSubArray(int[] nums) {
    if (nums == null || nums.length == 0) {
        return 0;
    }

    int maxSum = nums[0];
    int cS = nums[0];

    for (int i = 1; i < nums.length; i++) {
        cS = Math.max(nums[i], cS+ nums[i]);
        maxSum = Math.max(maxSum, cS);
    }

    return maxSum;
}

  public static void main(String args[]){

  }
}
