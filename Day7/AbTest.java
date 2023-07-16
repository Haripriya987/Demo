abstract class Super1{
      Super1(){
	System.out.println("Super");
      }
      void Meth1(){
	System.out.println("Super Method");
      }
      abstract void Meth2();	     
}
class Sub1 extends Super1{
        void Meth2(){
	System.out.println("Abstract method is override");
       }
       void Meth3(){
	System.out.println("It is sub method");
     }	
}     
class AbTest{
	public static void main(String args[]){
	Super1 s=new Sub1();
	s.Meth2();
	Sub1 b=new Sub1();
	b.Meth3();
	
	}
}

/*
Super
Abstract method is override
*/
/*
Super
It is sub method
*/