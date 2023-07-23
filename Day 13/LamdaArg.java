//Method with Two Arguments
/*
interface Lamda{
public int add(int x,int y);
}
public class LamdaArg{
	public static void main(String args[]){
		Lamda l=(a,b) -> (a+b);
		System.out.println(l.add(20,30));
	}
}
		
//50
*/

//Method with single Argument
interface Lamda{
public void display(String str);
}
public class LamdaArg{
	public static void main(String args[]){
		Lamda l=(s) ->{
		System.out.println(s);
		};
		l.display("Hello World");
	}
}

//Hello World

	