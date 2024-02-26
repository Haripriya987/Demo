import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
    int maxType = 0;
    for (int type : arr) {
        maxType = Math.max(maxType, type);
    }

    int[] frequency = new int[maxType + 1]; 

    for (int type : arr) {
        frequency[type]++;
    }

    int maxCount = 0;
    int mostCommonType = 0;
    for (int i = 1; i <= maxType; i++) {
        if (frequency[i] > maxCount) {
            maxCount =frequency[i];
            mostCommonType = i;
        }
    }

    return mostCommonType;
}

    public static void main(String args[]){
    List<Integer> ls=new ArrayList<>();
    ls.add(1);
    ls.add(2);
    ls.add(2);
    ls.add(3);
    ls.add(3);




    migratoryBirds(ls);
  }

}
