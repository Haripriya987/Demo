import java.util.Scanner;
import java.lang.*;
 class Circle{
    public double area(int r){
    return Math.PI*r*r;
   }
   public double perimeter( int r){
   return  2*Math.PI*r;
   }
}
public class Circle1{
   public static void main(String args[]){
    Circle c=new Circle();
    Scanner in=new Scanner(System.in);
     System.out.println("Enter the radius");
     int a=in.nextInt();
     System.out.println(c.area(a));
     System.out.println(c.perimeter(a)); 
   }
}

/*
//Enter the radius
7
153.93804002589985
43.982297150257104
*/