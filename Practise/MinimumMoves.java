import java.util.Arrays;

public class MinimumMoves {
  public int minMoves2(int[] nums) {
    Arrays.sort(nums);
    int moves=0;
    int i=0;
    int j=nums.length-1;

    while(i<j){
        moves+=(nums[j]-nums[i]);
        i++;
        j--;

    }


    return moves;
}
  public static void main(String[] args) {
    
  }
  
}
