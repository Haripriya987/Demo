import java.util.*;

public class PriorityQueueDemo3 {
    
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Mycom());
        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);
        
        pq.forEach((x)->System.out.print(x+" "));
        System.out.println();
        System.out.println(pq.poll());
    }
}
class Mycom implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
        if(o1<o2) return 1;
        else if(o1>o2) return -1;
        else return 0;   
    }
}
/*30 15 20 5 10 3
 30
 */

 /*Here we are defining priority based on our prefernce.It can be done by using this comparator Interface */