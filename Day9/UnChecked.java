public class UnChecked{
        static void fun1(){
	try{
	System.out.println(10/0);
	}
	catch(Exception e){
	//System.out.println(e.getMessage());
	e.printStackTrace();
	}
	}
        static void fun2(){
	fun1();
	}
        static void fun3(){
	fun2();
	}
        
public static void main(String args[]){
	fun3();
	}
}

/*If we cannot handle the error then the runtime errors are occured
 at UnChecked.fun1(UnChecked.java:3)
        at UnChecked.fun2(UnChecked.java:6)
        at UnChecked.fun3(UnChecked.java:9)
        at UnChecked.main(UnChecked.java:13)
*/

/// by zero

/* if we use printstacktrace the it will show this entire methods stack
java.lang.ArithmeticException: / by zero
        at UnChecked.fun1(UnChecked.java:4)
        at UnChecked.fun2(UnChecked.java:12)
        at UnChecked.fun3(UnChecked.java:15)
        at UnChecked.main(UnChecked.java:19)
*/