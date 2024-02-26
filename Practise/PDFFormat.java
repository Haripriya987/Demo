import java.util.ArrayList;
import java.util.List;

public class PDFFormat {
   public static int designerPdfViewer(List<Integer> h, String word) {
  
    int max=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int j=(ch-'a');
            max=Math.max(max,h.get(j));
        }
        return max*word.length();
    }
public static void main(String args[]){
  int arr[]={1,3,1,3,1,4,1,3,2,5,5,5,5,1,1,5,5,1,5,2,5,5,5,5,5,5};

  List<Integer> ls=new ArrayList<>();
  for(int z:arr){
    ls.add(z);
  }

System.out.println(designerPdfViewer(ls, "torn"));

}
  
}
