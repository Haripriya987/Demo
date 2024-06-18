
public class ReverseList {

  public  LinkedList reverseLinkedList(LinkedList start){
    LinkedList prev=null;
    LinkedList next=null;
    LinkedList curr=start;

    while(curr!=null){
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
  
    return prev;

  }
  
}
