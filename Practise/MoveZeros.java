public class MoveZeros {
  public static void moveZeroes(int[] nums) {
    int i=0;
    int n=nums.length;
    for(int j=0;j<n;j++){
       if(nums[j]!=0){
           nums[i++]=nums[j];
       }
    }
    while(i<n){
       nums[i]=0;
       i++;
    }

   }
  public static void main(String[] args) {
    int arr[] = {0,1,0,3,12,0};
    moveZeroes(arr);
  }
}
