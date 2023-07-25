import java.util.*;
public class ArrayListDemo{
	public static void main(String args[]){
	ArrayList<Integer> al1=new ArrayList<>(10);
	ArrayList<Integer> al2=new ArrayList<>(List.of(30,24,204));
	al1.add(11);
	al1.add(23);
	System.out.println(al1);
	System.out.println();
	al1.addAll(1,al2);
	for(int i=0;i<al1.size();i++)
	{
	   System.out.println(al1.get(i));
	}

	}
}

/*
[11, 23]

11
30
24
204
23
*/
