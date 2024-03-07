import java.util.HashMap;
import java.util.Map;

class FindPairs{
    public static void findPairs(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
        int complement = target - num;
        if (map.containsKey(complement)) {
            System.out.println("(" + complement + ", " + num + ")");
        }
        map.put(num, 1);
    }
    
}
public static void main(String args[]){
  int arr[]={2,3,5,1,4,8,9};
  findPairs(arr, 5);
}
}