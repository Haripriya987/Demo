import java.util.ArrayList;
import java.util.List;

public class UniqueElement {
  
    public static int uniqueElement(List<Integer> a) {
      int value=a.get(0);
      for(int i=1;i<a.size();i++){
          value=value^a.get(i);
      }
      return value;
  }

public static void main(String[] args){
  List<Integer> ls=new ArrayList<>();
  ls.add(1);
  ls.add(2);
  ls.add(1);
  ls.add(5);
  ls.add(5);
  System.out.println(uniqueElement(ls));
}
  
}
