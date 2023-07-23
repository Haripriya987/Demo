//Here we are using Interface Runnable to achieve Multithreading.

class My implements Runnable{
	public void run(){
		int i=1;
		while(i<=10){
		   System.out.println(i+"Thread ");
		 i++;
		}
	}
}
public class ThreadInterface{
	public static void main(String args[]){
		My t=new My();
//we have to create a object for thread class and attach this object 't'.
// because we are using an interface to implement multithreading
		Thread th=new Thread(t);
		th.start();
		int j=1;
		while(j<=10){
		 System.out.println(j+"Main");
		 j++;
		}
	}
}

/*
1Thread
1Main
2Main
2Thread
3Main
3Thread
4Main
4Thread
5Main
5Thread
6Main
6Thread
7Main
7Thread
8Main
8Thread
9Thread
9Main
10Thread
10Main

*/