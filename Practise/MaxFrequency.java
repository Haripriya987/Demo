import java.util.HashMap;

public class MaxFrequency {
  public static int maxFrequencyElements(int[] nums) {
    HashMap<Integer,Integer> hm=new HashMap<>();
    int max=1;
    for(int i=0;i<nums.length;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        max=Math.max(hm.get(nums[i]),max);
    }
        int count = 0;
for (int freq : hm.values()) {
    if (freq == max) {
        count++;
    }
}

return count * max;

    // int count=0;
    // for(Map.Entry<Integer,Integer> a:hm.entrySet()){
    //     if(a.getValue()==max){
    //         count+=max;
    //     }
    // }

    // return count;
}
public static void main(String args[]){
  int arr[]={1,2,5,3,2,1};
  System.out.println(maxFrequencyElements(arr));
  
}
}
