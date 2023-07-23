class  MyThread extends Thread{
	public void run(){
	  int count=1;
	while(count>10){
	System.out.println(count++);
	}
      }
}
public class ThreadStart{
	public static void main(String args[]){
	MyThread t=new MyThread();
	t.setDaemon(true);
	t.start();	
 	}
}
//If we set Daemon Thread as a true then it will make this  current thread as a Daemon 