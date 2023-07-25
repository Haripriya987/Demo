import java.util.*;

public class HashSet2 {
    public static void main(String args[]){
        HashSet<Integer> hs=new HashSet<>(20,0.75f);
        hs.add(10);
        hs.add(23);
        hs.add(24);
        hs.add(10);
        hs.add(56);
        System.out.println(hs);
        

        
    }
    
}
/*Here we are adding the capacity as well as loading factor .The more the loading factor that much space is wasted.
So idle for it is 0.75f .we can give vlaues between 0 to 1.
*/