import java.util.*;
public class TreeSetDemo{
public static void main(String args[]){
	TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,40,60,34,50,10));
	System.out.println(ts);
	ts.add(25);
	System.out.println(ts.ceiling(55));
	System.out.println(ts.isEmpty());
	System.out.println(ts.floor(55));

	}
}

/*
[10, 30, 34, 40, 50]
60
false
50
*/
//It also does not allow duplicates.It gives a sorted set.