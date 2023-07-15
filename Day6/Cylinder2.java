import java.util.Scanner;
import java.lang.*;
 class Cylinder{
	private double radius;
	private double height;
     public Cylinder(){
          radius=1;
          height=1;
     }
      public Cylinder(double radius,double height){
          setRadius(radius);
          setHeight(height);
     }
    public void setRadius(double radius){
                   this.radius=radius;
      }
       public void setHeight(double height){
            this.height=height;
      }

      public double getRadius(){
             return radius;
       }
       public double getHeight(){
              return height;
       }
       public double volume(){
           return   Math.PI*radius*radius*height;         
       }
      public double sArea(){
           return   2*Math.PI*radius*radius+2*Math.PI*height;
     }
}
       public class Cylinder2{
	public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	double x=in.nextDouble();
	double y=in.nextDouble();
	Cylinder c=new Cylinder(x,y);
                    System.out.println("volume:"+c.volume());
	 System.out.println("SurfaceArea:"+c.sArea());
	
      }
}

/*
volume:6361.725123519331
SurfaceArea:1470.2653618800232
*/