import java.util.List;

public class InversionCount {

  public static String inversionCount(List<Integer> A) {
    int rev=0;
    for(int i=0;i<A.size()-1;i++){
        for(int j=i+1;j<A.size();j++){
            if(A.get(i)>A.get(j)){
                rev++;
            }
        }
    }
    
    return rev%2==0?"YES":"NO";
  }

  public static void main(String[] args) {  
  }
  
}
