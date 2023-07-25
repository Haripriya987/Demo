import java.util.*;
public class PriorityQueueDemo {
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);
        
        pq.forEach((x)->System.out.print(x+" "));
        System.out.println();
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        pq.forEach((x)->System.out.print(x+" "));
        System.out.println();


    }
    
}

/*3 10 5 20 15 30
3
3
5 10 30 20 15 */
/*Here Elements are displayed based on their priority.PriorityQueue class works similar to Heap in data structures. */
