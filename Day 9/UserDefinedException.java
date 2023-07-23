public class UserDefinedException{
	static int area(int l,int b)throws Exception
	{
		if(l<0||b<0){
		throw new Exception();}
		return l*b;
	}
	static void meth1()throws Exception
	{
		System.out.println(area(10,-5));
	}
public static void main(String args[])throws Exception
{
	meth1();
	}
}		

/*
Exception in thread "main" java.lang.Exception
        at UserDefinedException.area(UserDefinedException.java:10)
        at UserDefinedException.meth1(UserDefinedException.java:15)
        at UserDefinedException.main(UserDefinedException.java:19)
*/
 