//Constructors in Inheritance  with parameters
class Parent1{
   public Parent1(){
	System.out.println("Non-Param Constructor  of parent");
     }
   public Parent1(int x){
	System.out.println("Param Constructor of parent");
     } 

}
  class Child1 extends Parent1{
    public Child1(){
	System.out.println("Non-Param Constructor of child");
    }
   public Child1(int y){
	super(y);
	System.out.println("Param Constructor of child");
    }

}
class Inherit3{
    public static void main(String args[]){
            // Parent1 p=new Parent1();//parent class Constructor
             Child1 c=new Child1(3);//child class Constructor
     }
}

//Param Constructor of parent
//Param Constructor of child
