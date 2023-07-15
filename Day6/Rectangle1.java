import java.util.Scanner;
 class Rect{
   public int l;
   public int b;
   public double area(){
	return l*b;
  }
  public double perimeter(){
     return 2*(l+b);
  }
   public boolean isSquare(){
        if(l==b)
        return true;
           else
         return false;
  } 
  }
  public class Rectangle1{
      public static void main(String args[]){
      Scanner in=new Scanner(System.in);  
       System.out.println("Enter Length and breadth");
      int x=in.nextInt();
      int y=in.nextInt();
      Rect r=new Rect();
      r.l=x;
      r.b=y;
	System.out.println("Area: "+(r.area()));
	System.out.println("Perimeter: "+(r.perimeter()));	
	System.out.println("Is it a square: "+(r.isSquare()));      
      }
}


/*
Enter Length and breadth
45
21
Area: 945.0
Perimeter: 132.0
Is it a square: false
*/