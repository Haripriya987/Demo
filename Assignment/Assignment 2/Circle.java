import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius of Circle");
        int r=in.nextInt();
        CircleDemo cd=new CircleDemo();
        CircleDemo cd2=new CircleDemo(r);
        System.out.println(cd.getArea());
        System.out.println("Now we are using with parameterised constructor");
        System.out.println(cd2.getArea());
        System.out.println(cd2.getPerimeter());
        in.close();
    }
}
class CircleDemo{
    private int radius;

    public CircleDemo() {
        this.radius=1;
        System.out.println("Here it is initialized to default value");
    }

    public CircleDemo(int radius) {
        if(radius>0)
        setRadius(radius);
        else
            System.out.println("Radius cannot be in Negative or Zero");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public  float getArea(){
       float a=(float)3.14*radius*radius;
        System.out.print(" Area is : ");
       return a;
    }
    public float getPerimeter(){
      float p= (float)(2*3.14*radius);
        System.out.print("Perimeter is : ");
      return p;

    }

}