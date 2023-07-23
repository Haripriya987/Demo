class MyThread extends Thread{
	public MyThread(String name){
		super(name);
		setPriority(Thread.MIN_PRIORITY+2);
	}
}
public class ThreadMethods {
	public static void main(String args[]){
		MyThread t=new MyThread("My Thread1");
		System.out.println(t.getId());//Id of a thread
		System.out.println(t.getName());//Name of a thread
		System.out.println(t.getState());//state of a thread
		System.out.println(t.getPriority());//Priority of a thread

	}
}
/*
13
My Thread1
NEW
3

*/	