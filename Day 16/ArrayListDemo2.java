import java.util.*;
public class ArrayListDemo2{
	public static void main(String args[]){
	ArrayList<Integer> al1=new ArrayList<>(List.of(23,34,56,22,34));
	al1.add(12);
	al1.add(99);
	System.out.println(al1.contains(50));//It will check it present or not
	System.out.println();
	System.out.println(al1.get(4));//get the element of Index 4
	System.out.println();
	System.out.println(al1.indexOf(34));//first index
	System.out.println();
	System.out.println(al1.lastIndexOf(34));//last Index of
	System.out.println();
	System.out.print(al1+ " ");
	System.out.println();
	al1.add(4,5);
	for(var x:al1)
	System.out.print(x+ " ");
	
	}
}
/*
false

34

1

4

[23, 34, 56, 22, 34, 12, 99]

23 34 56 22 5 34 12 99*/