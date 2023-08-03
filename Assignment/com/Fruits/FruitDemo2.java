
package com.Fruits;
import java.util.Scanner;
public class FruitDemo2{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter details of Apple type cost");
        String a1=in.next();
        int a2=in.nextInt();
        System.out.println("Enter details of Mango type cost");
        String m1=in.next();
        int m2=in.nextInt(); 
 

        Apple2 a=new Apple2(a1,a2);
        Mango2 m=new Mango2(m1,m2);
        System.out.println(a.getAppleDetails());
        System.out.println(m.getMangoDetails());

        in.close();

    }
}
interface Fruit2{
    void cost(int c);
}
class Apple2 implements Fruit2{
    private String type;
    private int cost;
    public Apple2(){
        System.out.println("Call parameterised constructor");
     }
    public Apple2(String type,int c){
        setType(type);
        cost(c);
    }
    public void cost(int c){
        cost=c;
    }
        public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
     public int getCost(){
        return cost;
    }
   
    
    public String getAppleDetails(){
        return "Details of Apple : "+"\n"+"Type of Apple is : "+type+"\n"+" Cost is :"+ cost+" rupees";
    }
}
class Mango2 implements Fruit2{
    private String type;
    private int cost;
    public Mango2(){
        System.out.println("Call parameterised constructor");
    }
     public Mango2(String type,int c){
        setType(type);
        cost(c);

    }
   
    public void cost(int c){
       cost=c;
       

    }
    public int getCost(){
        return cost;
    }
     public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
    public String getMangoDetails(){
        return "Details of Mango : "+"\n"+"Type of Mango is : "+type+"\n"+" Cost is :"+ cost+" rupees";
    }
}