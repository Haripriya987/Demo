import java.util.*;
public class DequeDemo2 {
public static void main(String args[]){
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.forEach((x)->System.out.print(x+" "));
        System.out.println();
        dq.offerFirst(32);
         dq.forEach((x)->System.out.print(x+" "));
          System.out.println();
        System.out.println(dq.pollLast());
       
    }
}

/*Here we are using at as a Queue inserting from one end and deleteing from another end */
/*
 * 10 20 30
32 10 20 30
30
 */