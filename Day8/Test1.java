class Outer{
     int x=10;
         class Inner{//Inner class
	int y=20;
	void innerDisplay(){
		System.out.println(x+" "+y);
	}
           }
         void OuterDisplay(){
	Inner i=new Inner();
	i.innerDisplay();//acessing inner class methods
        }
}   
class Test1{
      public static void main(String args[]){
	Outer o=new Outer();
	o.OuterDisplay();
      }
}		

//10 20 