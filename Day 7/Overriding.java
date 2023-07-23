class Car{
	public void Start(){
		System.out.println("Car started");
	}
	public void Accelerator(){
		System.out.println("Car is Accelerated");
	}
	public void ChangeGear(){
		System.out.println("Gear Changed");
	}
}
class LuxuryCar extends Car{
	public void ChangeGear(){
		System.out.println("Automatic Gear ");
	}
	public void OpenRoof(){
		System.out.println("SunRoof is Opened");
	}
}
public class Overriding{
           public static void main(String args[]){
	Car c=new LuxuryCar();
	c.ChangeGear();
	LuxuryCar l=new LuxuryCar();
	l.ChangeGear();
	l.OpenRoof();
	l.Accelerator();

           }
} 

/*
Automatic Gear
Automatic Gear
SunRoof is Opened
Car is Accelerated
*/