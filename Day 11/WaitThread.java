class MyThread2  extends Thread{
	public MyThread2(String name){
		super(name);
	}
	public void run(){
		int count=1;
		while(count<10){
		 System.out.println(count);
		      try{
			Thread.sleep(10);//It will  stop the thread for 10 milliseconds
		         }
		        catch(Exception e){
			System.out.println(e);
		       }
		count++;
	}
       }	
}
public class WaitThread{
	public static void main(String args[]){
	   MyThread2  t=new MyThread2("Thread1");
		t.start();
		t.interrupt();
		
	}
}
//Using sleep method it will wait for specified time.
//After that time it will again come into running state.			
/*
1
java.lang.InterruptedException: sleep interrupted
2
3
4
5
6
7
8
9
*/