@FunctionalInterface
interface MyLamda{
public void display();
}
public class Lamda1{
	public static void main(String args[]){
	 MyLamda ml=() ->//It denotes Lamada expression
	{
		System.out.println("Hello world");
	};
	ml.display();
	}
}


//Hello world
