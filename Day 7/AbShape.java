import java.lang.*;
abstract class Shape{
      Shape(){
          System.out.println("Shape properties is defined");
     }
      abstract double Perimeter();
      abstract  double Area();
}
class  Circle1 extends Shape{
        double radius;
            public double Area(){
	return Math.PI*radius*radius;
           }
           public double Perimeter(){
	return  2*Math.PI*radius;
           }
}

class Rectangle1 extends Shape{
           double length;
           double breadth;
           public double Area(){
	return length*breadth;
           }
           public double Perimeter(){
	return 2*(length+breadth);
           }
	
}
class AbShape{
       public static void main(String args[]){
	Circle1 c=new Circle1();
	c.radius=11;
	System.out.println(c.Perimeter());
	System.out.println(c.Area());
	Rectangle1 r=new Rectangle1()
;
	r.length=10;
	r.breadth=20;
	System.out.println(r.Area());
	System.out.println(r.Perimeter());
      }
}


/*
Shape properties is defined
69.11503837897544
380.1327110843649
Shape properties is defined
200.0
60.0
*/		