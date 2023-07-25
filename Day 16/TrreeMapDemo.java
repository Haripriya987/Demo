import java.util.*;
public class TreeMapDemo{
	public static void main(String args[]){
	TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"C"));
	System.out.println(tm);
	tm.put(3,"D");
	tm.put(4,"E");
	System.out.println(tm);
	System.out.println(tm.ceilingEntry(5).getValue());
	System.out.println(tm.contains(6));
	}
}