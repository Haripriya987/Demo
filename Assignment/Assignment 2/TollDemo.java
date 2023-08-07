import java.util.Scanner;
public class TollDemo {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Details of cars and money");
        int c=in.nextInt();
        int m=in.nextInt();
        Toll t=new Toll(c,m);
        int i;
        do{
            System.out.println("Choose any Option");
            System.out.println("1.TollPaying car");
            System.out.println("2.No tollPay car");
            System.out.println("3.Display Total Details");
            System.out.println("4.Exit from the program");
            i=in.nextInt();
            switch (i) {
                case 1 -> {
                    t.payingCar();
                    System.out.println("Details are updated");
                }
                case 2 -> {
                    t.noPayingCar();
                    System.out.println("Details are updated");
                }
                case 3 -> t.display();
                default -> System.out.println("Exiting from program");
            }

        }while(i!=4);



    }
}
class Toll{
    private int carNo;
    private int money;

    public Toll() {
        this.carNo='0';
        this.money='0';
    }
    public Toll(int carNo, int money) {
        if(carNo>0) {
            setCarNo(carNo);
        }
        setMoney(money);
    }

    public void payingCar(){
        this.carNo+=1;
        this.money+=50;

    }
    public void noPayingCar(){
        this.carNo+=1;

    }
    public void display(){
        System.out.println("Details about cars :");
        System.out.println("Total cars : "+getCarNo());
        System.out.println("Total Money : "+getMoney());
        System.out.println("Count of cars paid toll : " +(money/50));

    }


    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        if(carNo>0) {
            this.carNo = carNo;
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}