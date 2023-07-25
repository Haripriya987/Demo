import java.util.*;
public class DequeDemo{
    public static void main(String args[]){
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.forEach((x)->System.out.print(x+" "));
        System.out.println();
        System.out.println(dq.pollLast());
       
    }
}
/*Here we are using deque as a stack .We are inserting and deleting at same end.Stack follows LIFO principle.
It means the element which is inserted last it is only deleted first.In contrast which is inserted first it is deleted at last.
It can take constant time for doing this*/
/*
10 20 30
30 */