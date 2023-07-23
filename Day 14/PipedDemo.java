import java.io.*;
class Producer extends Thread{
	OutputStream os;
	public Producer(OutputStream o){
	os=o;
	}
	public void run(){
	try{
	int count=1;
	while(count<20){
	os.write(count);
	os.flush();
	System.out.println("Producer"+count);
	System.out.flush();
	Thread.sleep(10);
	count++;	
		}
	}
	catch(Exception e){
	System.out.println(e);
		}
	}
}
class Consumer extends Thread{
	InputStream iss;
	public Consumer(InputStream s){
	iss=s;
	}
	public void run(){
	try{
	int x;
	while(true){
	x=iss.read();
	System.out.println("Consumer"+x);
	System.out.flush();
	Thread.sleep(10);
			
		}
	}
	catch(Exception e){
	System.out.println(e);
		}
	}
}

public class PipedDemo{
	public static void main(String args[]){
	try{
		PipedInputStream pis=new PipedInputStream();
		PipedOutputStream pos=new PipedOutputStream();
		pis.connect(pos);
		Producer p=new Producer(pos);
		Consumer c=new Consumer(pis);
		p.start();
		c.start();
	}
	catch(Exception e){
	System.out.println(e);
		}
	}
}



/*
Producer1
Consumer1
Producer2
Consumer2
Producer3
Consumer3
Producer4
Consumer4
Producer5
Consumer5
Producer6
Consumer6
Producer7
Consumer7
Producer8
Consumer8
Consumer9
Producer9
Producer10
Consumer10
Producer11
Consumer11
Producer12
Consumer12
Producer13
Consumer13
Producer14
Consumer14
Producer15
Consumer15
Producer16
Consumer16
Producer17
Consumer17
Producer18
Consumer18
Producer19
Consumer19
*/