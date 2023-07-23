import java.lang.annotation.*;
import java.lang.reflect.*;

public class AnnoDemo{
	public static void main(String args[])throws InvocationTargetException,IllegalAccessException
	{
	//Dhoni d=new Dhoni();
	//Sachin v=new Sachin();
	Player p=new Player();
	for(Method x:p.getClass().getDeclaredMethods()){
		if(x.isAnnotationPresent(VIP.class)){
		x.invoke(p);
			}
	   	}
	}
}
class Dhoni{
	@VIP(count="3",status="retired")
	String name="Mahendra Singh Dhoni";
	@VIP(count="3",status="retired")
	void display(){
	   System.out.println("Batting");
	}
	@VIP(count="3",status="retired")
	void  Speciality(){
	   System.out.println("Great Captain");
	}
}
class Player{
	String name="Player";
	void Speciality(){
	System.out.println("He is a new Batsman");
	}
}
class Sachin{
	String name="MasterBlaster";
	@VIP(count="5",status="retired")
	void Special(){
	System.out.println("All time Favourite");
	}
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface VIP{
	String count();
	String status();
}


/* if(x.isAnnotationPresent(VIP.class)){
		System.out.println("Sachin is a VIP");
	}
	else{
		System.out.println("Sachin is not a VIP");	
	}*/
