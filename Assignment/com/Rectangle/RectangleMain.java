package com.Rectangle;
import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Length and Breadth of a rectangle");
        int l=in.nextInt();
        int b=in.nextInt();

       
       RectangleDemo rd=new RectangleDemo(l, b);
        System.out.println("Area is: " +rd.area());
        System.out.println("We are using Default constructor now");
        RectangleDemo rd1=new RectangleDemo();
        System.out.println("Perimeter is: " +rd1.perimeter());

      in.close();   
    }
    
}
class RectangleDemo{
private int length;
private int breadth;
    RectangleDemo(){
        System.out.println("Intialized  to default values of l and b.we are using default constructor");
        length=1;
        breadth=1;
    }
    RectangleDemo(int l,int b){
        if(l>0)
        setLength(l);
        if(b>0)
        setBreadth(b);
    }
    public void setLength(int l){
        length=l;

    }
     public void setBreadth(int b){
        breadth=b;
        
    }
     public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
        
    }
    public int area(){
        //return length*breadth;
    
        return getLength() * getBreadth();
    }
    public int perimeter(){
        return 2*(getLength()+getBreadth());
    }


}