class Parent{
	public void display(){}
}
class Child extends Parent{
	@Override
	public void display(){
	System.out.println("We are using Annotations");
	}
}
public class Annotations{
	public static void main(String args[]){
	Child c=new Child();
	c.display();
	}
}

//We are using Annotations
