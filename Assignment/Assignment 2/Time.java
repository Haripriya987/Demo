import java.util.Scanner;

public class Time {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the hours minutes seconds");

        int h=in.nextInt();
        int m=in.nextInt();
        int s=in.nextInt();

        TDemo t=new TDemo(h,m,s);
        t.adjust();
        t.display();
    }
}
class TDemo{
    private int hours;
    private int minutes;
    private int seconds;
    public TDemo(){
        hours=0;
        minutes=0;
        seconds=0;
    }

    public TDemo(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public void display(){

        System.out.printf("%02d:%02d:%02d",hours,minutes,seconds);
    }
    public void adjust(){
        if(seconds>=60){
            minutes+=seconds/60;
            seconds%=60;

        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
        if (hours >= 24) {
            hours %= 24;
        }
    }
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
