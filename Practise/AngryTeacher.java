import java.util.ArrayList;
import java.util.List;


public class AngryTeacher {

  public static String angryProfessor(int k, List<Integer> a) {
    int value=0;
    for(int x:a){
        if(x<=0)
        value++;
    }
    String res="";
    if(value>=k)
      res="NO";
    else
      res="YES";
       
    return res; 
    }

    public static void main(String args[]){
    List<Integer> ls=new ArrayList<>();
    ls.add(-1);
    ls.add(3);
    ls.add(-2);
    ls.add(6);
    ls.add(0);
    ls.add(2);

  angryProfessor(3, ls);

  
  }

}
