public class Sort012{

  public static void sort012(int[] nums) {
    int low = 0;
    int high = nums.length - 1;
    int mid = 0;

    while (mid <= high) {
        switch (nums[mid]) {
            case 0:
                swap(nums, low++, mid++);
                break;
            case 1:
                mid++;
                break;
            case 2:
                swap(nums, mid, high--);
                break;
        }
    }
}

private static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

  public static void main(String[] args) {
    int arr[]={1,0,2,1,2,1,2,0,1};
    sort012(arr);
    
  }
}