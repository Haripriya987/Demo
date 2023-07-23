interface Test{
	int A=32;
     void meth1();
     void meth2();
     static  void meth0(){
	System.out.println("It is a interface method");
	}
}
class My implements Test{
     public void meth1(){
	System.out.println("override Meth1 ");
      }
       public void meth2(){
	System.out.println("override Meth2");
       }
      public void meth3(){
	System.out.println("Meth3 of my class");
       }
}
    public class InterfacePractise{
           public static void main(String args[]){
	Test t=new My();
	t.meth1();
	My t2=new My();
	t2.meth3();
	System.out.println(Test.A);//Accessing the interface variables
	Test.meth0();//An interface static method can be acess in this way

	}
}


//override Meth1
//Meth3 of my class
//32
//It is a interface method