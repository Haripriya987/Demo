//Constructors in Inheritance  without parameters
 class Parent{
   public Parent(){
	System.out.println("Parent Constructor");
     }
}
  class Child extends Parent{
    public Child(){
	System.out.println("child Constructor");
    }
}
class Inherit2{
    public static void main(String args[]){
             Parent p=new Parent();//parent class Constructor
             Child c=new Child();//child class Constructor
     }
}

/*
Parent Constructor
Parent Constructor
child Constructor
*/