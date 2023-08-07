import java.util.Scanner;
import java.util.Arrays;
public class Student {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.println("Enter Name of Student");
        String n=in.next();
        int a[]=new int[5];
        System.out.println("Enter the marks of 5 subjects");
        for(int i=0;i<a.length;i++)
            a[i]=in.nextInt();

        SDemo s=new SDemo(n,a);
        s.show();
        s.max(a);
        s.min(a);
        s.totalMarks(a);
        s.avg(a);

      SDemo s2=new SDemo();
      s2.getTotalCount();
      int[] ab={45,67,78,74,89};
      s2.setA(ab);
      s2.getA();


    }
}
class SDemo{
    private static int total;
    private int number=total;
    private String name;
    private int[] a=new int[5];

    public SDemo() {
        total++;
    }

    public SDemo( String name, int[] a) {
        total++;
        setName(name);
        this.a=a;

    }
    public void getTotalCount(){
        System.out.println(total);
    }

    public int getNumber() {
        return number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  getA() {
         System.out.print(Arrays.toString(a));
    }

    public void setA(int[] a) {
        this.a = a;
    }
    public  void display(int[] a){
        System.out.println(Arrays.toString(a));
    }
    public  void  max(int[] a){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("Max Marks is : "+max);
    }
    public  void min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("Min Marks is : "+min);
    }
    public void totalMarks(int[] a) {
        int tMarks = 0;
        for (int z : a) {
            tMarks += z;
        }
        System.out.println("Total : "+tMarks);
    }
    public void avg(int[] a){
        int tMarks = 0;
        for (int z : a) {
            tMarks += z;
        }
        System.out.println("Average is  : "+tMarks/a.length);


    }
    public void show(){
        System.out.println(getNumber());
        System.out.println(getName());
        System.out.println(Arrays.toString(a));

    }
}
