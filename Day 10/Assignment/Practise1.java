class Super{
    void show(){
	System.out.println("Hello");
	}
}
class Sub extends Super{
	void show(){
	System.out.println("Hello We are practising inheritance");
	}

}
public class Practise1{
	public static void main(String args[]){
		Sub s1=new Sub();
		  s1.show();

	}
}


If Sub class and super class have same methods if we call using subclass Method object then first it calls that method
//Hello We are practising inheritance

If subclass don't have that methods then it can call super class method
//Hello