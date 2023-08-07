import java.util.Scanner;
import java.util.*;
public class Run {
    public static void main(String[] args){
        Runner r=new Runner();
        r.getValues();
        r.getValues();
        r.getValues();
        r.getValues();
        r.getValues();
        System.out.println("Showing all the runner Details");
        r.show();
        System.out.println("Showing the runnerDetails with long distance");
        r.maxDistance();

    }

}
class Runner{
    private HashMap<String,Integer> hs=new HashMap<>();
    public void getValues(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter details of runner with name and distance :");
        String name=in.next();
        int dist=in.nextInt();
        hs.put(name,dist);

    }
    public void show(){
        for(Map.Entry<String,Integer> ME:hs.entrySet()){
            String Key=ME.getKey();
            Integer Value=ME.getValue();
            System.out.println("Name : "+Key+" " +"Distance : "+Value);

        }
    }
    public void maxDistance(){
        int md=1;
        String name="";
        for(Map.Entry<String,Integer> max:hs.entrySet()){

            int win=max.getValue();
            if(win>md) {
                md = win;
                name = max.getKey();
            }

        }
        System.out.println("Runner with longest Distance is : " +name+ " "+md);
    }
}
