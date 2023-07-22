interface MyLamdaa{
	public void display(String str);
}
public class ConstructorRef{
	public ConstructorRef(String s){
	System.out.println(s.toUpperCase());
}
	public static void main(String args[]){
	MyLamdaa ml=ConstructorRef::new;
	ml.display("we are using constructor refernce");
	}
}

//WE ARE USING CONSTRUCTOR REFERNCE
