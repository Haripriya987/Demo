import java.util.*;
public class LinkedListDemo{
	public static void main(String args[]){
	LinkedList<String> ll1=new LinkedList<>();
	ll1.add("Hi");
	ll1.add("Hello");
	ll1.add("Bye");
	System.out.println(ll1+ " ");
	ll1.set(2,"Fun");
	System.out.println(ll1+ " ");
	String str=ll1.remove(2);
	System.out.println("Removed Element"+ str);
	System.out.println(ll1+ " ");
	String str1=ll1.peek();
	System.out.println("Peek is "+str1);
	System.out.println(ll1+ " ");
	String str2=ll1.poll();
	System.out.println("Removed Element is"+str2);
	System.out.println(ll1+ " ");
	ll1.addFirst("joy");
	ll1.addLast("Hi");
	System.out.println("Accessing all the elements:");
	for(var x:ll1)
	System.out.println(x+" ");
	}
}


/*
[Hi, Hello, Bye]
[Hi, Hello, Fun]
Removed Element Fun
[Hi, Hello]
Peek is Hi
[Hi, Hello]
Removed Element is Hi
[Hello]
Accessing all the elements:
joy
Hello
Hi
*/