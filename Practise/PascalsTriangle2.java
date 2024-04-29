import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
  public static List<List<Integer>> generate(int numRows) {

    List<List<Integer>> ls=new ArrayList<>();
    for(int i=0;i<numRows;i++){
        List<Integer> val=new ArrayList<>();
            for(int j=0;j<=i;j++){
                int value=ncr(i,j);
                val.add(value);
            }
            ls.add(val);
        }

        return ls;
    }
    private static int ncr(int n,int r){
        if(r==0 || r==n){
            return 1;
        }
        int res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i)/(i+1);
            }
        return res;

        }

public static void main(String args[]){
  
}  
}
