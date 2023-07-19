import java.lang.*;
public class ExceptionDemo{
	static int meth1(){
		return 10/0;

	}
	static void meth2()
	{
		meth1();
	}
	static void meth3()

	{
		meth2();
	}
public static void main(String args[])
{
   
   meth3();
  }
}

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at ExceptionDemo.meth1(ExceptionDemo.java:3)
        at ExceptionDemo.meth2(ExceptionDemo.java:6)
        at ExceptionDemo.meth3(ExceptionDemo.java:9)
        at ExceptionDemo.main(ExceptionDemo.java:12)
*/
