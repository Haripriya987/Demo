import java.util.*;
public class HashMapDemo{
	public static void main(String args[]){
	HashMap<Integer,String> hs=new HashMap<>(Map.of(0,"A",1,"B",2,"C"));
	System.out.println(hs);
	hs.put(3,"D");
	hs.put(4,"E");
	System.out.println(hs);
	System.out.println(hs.get(3));
	}
}

{0=A, 1=B, 2=C}
{0=A, 1=B, 2=C, 3=D, 4=E}
D