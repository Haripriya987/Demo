import java.util.ArrayList;
import java.util.List;

public class DivisiblePairs {
  
public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
  
     int count=0; 
      for(int i=0;i<ar.size()-1;i++){
          for(int j=i+1;j<ar.size();j++){
                if(i!=j){
                  int value=ar.get(i)+ar.get(j);
                  if(value%k==0){
                  count++;
                  }
                }
          }
      }
      return count;
  
  }
  public static void main(String args[]){
    List<Integer> ls=new ArrayList<>();
    ls.add(1);
    ls.add(3);
    ls.add(2);
    ls.add(6);
    ls.add(1);
    ls.add(2);



    divisibleSumPairs(ls.size(),3,ls);
  }

  
}
