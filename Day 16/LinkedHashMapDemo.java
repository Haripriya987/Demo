import java.util.*;
public class LinkedHashMapDemo{
	public static void main(String args[]){
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5);
		lhm.put(1,"A");
		lhm.put(2,"B");
		lhm.put(3,"C");
		lhm.put(5,"D");
		lhm.put(7,"E");
		lhm.put(6,"F");
		lhm.forEach((k,v)->System.out.println(k+" "+v));
	}
}
/*
1 A
2 B
3 C
5 D
7 E
6 F
*/

//It shows the order in which we inserted.