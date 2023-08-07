import java.util.Scanner;
import java.util.Arrays;

public class Result{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the details of rollno name");
        int r=in.nextInt();
        String n=in.next();
        System.out.println("Enter the marks of three Subjects");
        int a[]=new int[3];
        for(int x=0;x<a.length;x++)
            a[x]=in.nextInt();

        ResultDemo rd=new ResultDemo();
        rd.input(r,n,a);
        rd.avg();
        rd.show();
    in.close();
    }
}
class ResultDemo{
    private int rollNo;
    private String name;
    private int[] a=new int[3];
    public void input(int r,String n,int[] a){
       setA(a);
       setName(n);
       setRollNo(r);
    }
    public void show(){
        System.out.println("No is : "+getRollNo());
        System.out.println("Name is : "+getName());
        System.out.println("Marks " +Arrays.toString(getA()));
    }
    public int  total(){
        int s=0;
      for(int x=0;x<a.length;x++){
          s+=a[x];
      }

        return s;
    }
    public void avg(){
        float avg=(float)(total()/3);
        System.out.println("Average : "+avg);
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }
}