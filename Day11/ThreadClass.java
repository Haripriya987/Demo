//Here we are using Thread class to understand the multithreading

class Test extends Thread{
	public void run(){
		int i=1;
		while(i<=10){
		   System.out.println(i+"Thread ");
		 i++;
		}
	}
}
public class ThreadClass{
	public static void main(String args[]){
		Test t=new Test();
		t.start();
		int j=1;
		while(j<=10){
		 System.out.println(j+"Main");
		 j++;
		}
	}
}

/*
1Thread
2Thread
3Thread
4Thread
5Thread
6Thread
7Thread
1Main
2Main
3Main
4Main
5Main
6Main
7Main
8Main
9Main
8Thread
9Thread
10Thread
10Main
*/


