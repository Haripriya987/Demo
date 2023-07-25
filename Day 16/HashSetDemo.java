import java.util.*;
public class HashSetDemo {
    public static void main(String args[]){
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(23);
        hs.add(24);
        hs.add(10);
        hs.add(56);
        System.out.println(hs);
        

        
    }
    
}
/*
 [23, 24, 56, 10]
 */
/*
 * It does not allow duplicates in this HashSet.Elements are orderd based on their hash function.
 */