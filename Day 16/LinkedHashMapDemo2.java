import java.util.*;
import java.util.Map.*;
public class LinkedHashMapDemo2{
	public static void main(String args[]){
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5){
		protected boolean removeEldestEntry(Map.Entry e){
			return size()>5;
			}
		};
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
2 B
3 C
5 D
7 E
6 F
*/

//when we restrict the size and add elements more than its size then ,
//it will remove the elements based on their its inserting manner. 
