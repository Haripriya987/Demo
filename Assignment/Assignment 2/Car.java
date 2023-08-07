
import java.util.Scanner;
public class Car {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter details of car  name direction position in degrees");
        String n=in.next();
        char a=in.next().charAt(0);
        float po=in.nextFloat();
        CarDemo cd=new CarDemo(n,a,po);

        int i;
        do{
            System.out.println("select any option ");
            System.out.println("1.Change the position :");
            System.out.println("2.Turn Left");
            System.out.println("3.Turn Right");
            System.out.println("4.Turn any Direction");
            System.out.println("5.Show Details of car ");
            System.out.println("6.Exit from the program");
            i=in.nextInt();
            switch(i){
                case 1: float p=in.nextFloat();
                        cd.changePosition(p);
                        break;
                case 2:cd.turnLeft();
                        System.out.println("Direction is changed to left ");
                        break;
                case 3: cd.turnRight();
                        System.out.println("Direction is changed to right ");
                         break;
                case 4:char d=in.next().charAt(0);
                         cd.turn(d);
                            break;
                case 5: cd.showDetails();
                          break;
                default :System.out.println("Exiting from Menu");
                             break;


            }

        }while(i!=6);

    }
}
class CarDemo{
    private String name;
    private char direction;
    private  float position;

    public CarDemo() {
    }

    public CarDemo(String name, char direction, float position) {
        setName(name);
        setDirection(direction);
        setPosition(position);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
           this.direction = direction;

    }

    public float getPosition() {
        return position;
    }

    public void setPosition(float position) {
        this.position = position;
    }
    public void turnLeft(){
        switch(direction){
            case 'E':setDirection('N');
                     break;
            case 'W':setDirection('S');
                break;
            case 'N':setDirection('W');
                break;
            case 'S' :setDirection('E');
                break;
        }
           }
    public void turnRight(){
        switch(direction){
            case 'E':setDirection('S');
                break;
            case 'W':setDirection('N');
                break;
            case 'N':setDirection('E');
                break;
            case 'S' :setDirection('W');
                break;
        }


    }
    public void turn(char td){
      this.direction=td;
        System.out.println("Direction is  changed to "+td);
    }
    public void changePosition(float p){
        this.position+=p;
        System.out.println("Position is changed");
    }
    public void showDetails(){
        System.out.println("Name is : "+getName());
        System.out.println("Direction is : "+direction);
        System.out.println("Position is : " +getPosition());
    }
}
