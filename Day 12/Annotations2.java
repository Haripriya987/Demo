class Annotations2{
	public void display(){
		System.out.println("Depreceated Annotations");
	}
	@Deprecated
	public void show(){
		System.out.println("This method is Deprecated");
	}
	//@Supresswarning("Deprecation")
	public static void main(String args[]){
		Annotations2 c=new Annotations2();
		c.display();
		c.show();
	}
}