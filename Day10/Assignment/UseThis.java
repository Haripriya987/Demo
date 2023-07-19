class One {
        int x=15;
	One(){
	System.out.println("Hi"+this.x);
	}
        One(int num){
	System.out.println(num);
	System.out.println(this.x);
	}
  }
class Two extends One{
	int y=10;
	Two(){
	System.out.println("Hi"+this.y);
	}
 	Two(float num){
	System.out.println(super.x);
	System.out.println(num);
	
	}

}
public class UseThis{
        public static void main(String args[]){
	Two t=new Two(5);
	
	}
} 

//Super keyword is used for accessing the methods and variables of a parent class.If we don't write then compiler will explicitly call Superclass Constructor.

//this keyword is used to acess the variables inside of a class
