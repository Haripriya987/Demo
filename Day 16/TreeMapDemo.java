import java.util.*;
public class TreeMapDemo{
	public static void main(String args[]){
	TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",1,"B",2,"C"));
	System.out.println(tm);
	tm.put(3,"D");
	tm.put(4,"E");
	System.out.println(tm);
	System.out.println(tm.ceilingEntry(3).getValue());
	//System.out.println(tm.contain(6));
	}
}

/*
{0=A, 1=B, 2=C}
{0=A, 1=B, 2=C, 3=D, 4=E}
D
*/