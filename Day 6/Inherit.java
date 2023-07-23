import java.lang.*;
class Circlee {
	public double radius;
       public double area(){
   	   return Math.PI*radius*radius;
      }
      public double perimeter(){
   	   return     2*Math.PI*radius;
      }
}
    class Cylinderr extends Circlee{
     public double height;
     public double volume(){
   	   return  area()*height;
      }
}
      public class Inherit{
     public static void main(String args[]){
	Cylinderr   c=new Cylinderr();
	c.radius=10;
	c.height=20;
	System.out.println("Volume:"+c.volume());
	System.out.println("Area:"+c.area());
    }
}

//Volume:6283.185307179587
//Area:314.1592653589793