import java.util.HashMap;
import java.util.Map.Entry;

public class MaxProfit {
  public static int maxProfit(int arr1[],int arr2[]){
    HashMap<Integer,Integer> hs=new HashMap<>();
    for(int i=0;i<arr1.length;i++){
      if(hs.containsKey(arr1[i])){
        hs.put(arr1[i],Math.max(hs.get(arr1[i]),arr2[i]));
      }
      else{
        if(arr2[i]>arr1[i])
        hs.put(arr1[i],arr2[i]);
      }
    }
    int profit=0;

    for(Entry<Integer, Integer> en:hs.entrySet()){
      int value=en.getValue();
      profit+=value;
    }

    return profit;
  }
public static void main(String args[]){
  int res1[]={1,2,1};
  int res2[]={10,30,20};
  System.out.println(maxProfit(res1, res2));

  
}
  
}
