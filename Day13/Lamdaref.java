interface MyLamdaa{
	public void display(String str);
}
public class Lamdaref{
	public static void main(String args[]){
	MyLamdaa ml=System.out::println;
	ml.display("Here we are taking method reference by using :: this operator");	

	}
}
	

//Here we are taking method reference by using :: this operator