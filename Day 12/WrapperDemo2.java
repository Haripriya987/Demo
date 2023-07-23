public class WrapperDemo2{
	public static void main(String args[]){
		int m1=18;
	    Integer m2=Integer.valueOf("123");
	    Integer m3=Integer.valueOf("1010",2);
	   Integer m4=Integer.parseInt("a40");//It throws an error because it is not a number
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
}
		
		

/*
18
123
10
*/
/*
at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.parseInt(Integer.java:784)
        at WrapperDemo2.main(WrapperDemo2.java:6)
*/
