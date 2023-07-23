enum Dept{
	CS,MATHS,STATS,ENGLISH
}
public class EnumDemo{
	public static void main(String args[]){
		Dept d=Dept.STATS;
		Dept d2=Dept.CS;
		System.out.println(d.ordinal());
		System.out.println(d2.ordinal());	
		System.out.println(Dept.valueOf("MATHS"));
		Dept list[]=Dept.values();//It gives the array of values of Dept enum
		for(Dept x:list)
		System.out.println(x);
			      

	}
}


/*
2
0
MATHS

CS
MATHS
STATS
ENGLISH
*/