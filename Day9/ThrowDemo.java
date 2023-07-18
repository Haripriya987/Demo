public class ThrowDemo{
	static int meth1(){
		return 10/0;
	}
	static void meth2(){
		meth1();
	}
public static void  main(String args[]){
//	meth2();
	try{
		meth2();
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
}
}