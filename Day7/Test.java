class Rectangle {
    private int length;
    private int breadth;
    
    Rectangle() {
        this.length = 1;
        this.breadth = 1;
    }
    
    Rectangle(int length, int breadth) {
      //  this.length = length;
        //this.breadth = breadth;
	setLength(length);
	setBreadth(breadth);
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    
    public int getLength() {
        return length;
    }
    
    public int getBreadth() {
        return breadth;
    }
	int area(){
	return getLength()*getBreadth();
      }
}

class Cuboid extends Rectangle {
    private int height;
    
    Cuboid() {
        height = 1;
    }
    
    Cuboid(int height) {
        super(1, 1);
        this.height = height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getHeight() {
        return height;
    }
    
    Cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }
    
    int volume() {
        return area() * height;
	//return getLength()*getBreadth()*getHeight();
    }
}

public class Test {
    public static void main(String args[]) {
        Cuboid c = new Cuboid(4);
        System.out.println("Volume of c: " + c.volume());
        Rectangle r=new Rectangle(3,5);
       System.out.println(r.area());
        Cuboid c2 = new Cuboid(10, 3, 6);
        System.out.println("Volume of c2: " + c2.volume());
    }
}


//Volume of c: 4
//15
//Volume of c2: 180
