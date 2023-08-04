import java.util.Scanner;
public class Marks{

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Marks m1 m2 m3");
        int m1=in.nextInt();
        int m2=in.nextInt();
        int m3=in.nextInt();
        MarksDemo md=new MarksDemo();
        MarksDemo md2=new MarksDemo(m1,m2,m3);
        System.out.println("Sum is : "+md.getSum());
        System.out.println("Now we are initializing with parameterized constructors");
       System.out.println(md2.getAvg());

        in.close();
    }
}
class MarksDemo{
    private int marks1;
    private int marks2;
    private int marks3;

    public MarksDemo() {
        setMarks1(0);
        setMarks2(0);
        setMarks3(0);
        System.out.println("Here they are initialized  to default values ");
    }
public MarksDemo(int m1,int m2,int m3){
        setMarks1(m1);
        setMarks2(m2);
        setMarks3(m3);
}
    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }


    public int getSum(){
        int i = marks1 + marks2 + marks3;
        return i;
    }
    public float getAvg(){
        float a= (float) getSum() /3;
        System.out.print("Average is : ");
        return a;
    }
}