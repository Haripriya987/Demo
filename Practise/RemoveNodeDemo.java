
public class RemoveNode{
 public static void main(String[] args) {
 }

}


class LinkedListDemo{
  LinkedList head;

  public LinkedListDemo(){
    this.head=null;
  }

  public void insertAtHead(LinkedList node){
    if(this.head==null){
      this.head=node;
    }
    else{
      node.next=this.head;
      this.head=node;
    }

  }
 
  public void createLinkedList(int[] li){
    for(int i=li.length-1;i>=0;i--){
      LinkedList node=new LinkedList(li[i]);
      insertAtHead(node);
    }
  }

}