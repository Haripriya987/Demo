class Outer1{
	int x=30;
      void Display(){
         class Inner1{//Inner class defined inside a method
	int y=20;
	void innerDisplay(){
		System.out.println("Hello"+" "+x);
	}
           }
	//new Inner1().innerDisplay();
	Inner1 i=new Inner1();
	i.innerDisplay();//acessing inner class methods
        }
}   
class LocalInner{
	public static void main(String args[]){
		Outer1 in=new Outer1();
		in.Display();
	}
}