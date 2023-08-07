import java.util.Scanner;

public class Employee {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Employee Details eno and compensation ");
        int n=in.nextInt();
        float c=in.nextFloat();
        EmployeeDemo ed=new EmployeeDemo();
        ed.setData(n,c);
        ed.display();

    }
}
class EmployeeDemo{
    private int number;
    private float compensation;
    public void setData(int a,float n){

        setNumber(a);
        setCompensation(n);

    }public void display(){
        System.out.println("Employee Id : "+getNumber());
        System.out.println("Compensation in rupess : "+getCompensation());
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getCompensation() {
        return compensation;
    }

    public void setCompensation(float compensation) {
        this.compensation = compensation;
    }


}