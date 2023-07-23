import java.lang.annotation.*;
import java.lang.reflect.*;

public class Annotations2{
	public static void main(String args[])throws InvocationTargetException,IllegalAccessException
	{
	Ganguly g=new Ganguly();
	for(Field x:g.getClass().getDeclaredFields()){
		if(x.isAnnotationPresent(VIP.class)){
		VIP vip=x.getAnnotation(VIP.class);
			System.out.println(vip.status());//BCCI member

			}
	   	}
	}
}
class Dhoni{
	@VIP(count=6,status="retired")
	String name="Mahendra Singh Dhoni";
	@VIP(count=6,status="retired")
	void display(){
	   System.out.println("Batting");
	}
	@VIP(count=6,status="retired")
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
	@VIP(count=5,status="retired")
	void Special(){
	System.out.println("All time Favourite");
	}
}
class Ganguly{
	
	@VIP(count=8,status="BCCI member")
	String name="Dada";//DADA
	void About(){
	System.out.println("One of the finest member in cricket"); 
	}
}	
	
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD})
@interface VIP{
	int count();
	String status();
}

/*Object value=x.get(g);
if(value instanceof String s){
System.out.println(s.toUpperCase());
}
*/

/*
int i=0;
while(i++<vip.count()){
System.out.print("*");//********
}
*/
	