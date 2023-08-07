public class ObjectDemo {
public static void main(String[] args){
    System.out.println("Displaying no of objects created to a particular class ");
    Demo d=new Demo();
    System.out.println(d.getClass());
    Demo d2=new Demo();
    System.out.println(d2.getClass());

 }
}
class Demo{
    private static int count;
    public Demo(){
        count++;
        System.out.print("I am Object Number  "+count+" "+"for the ");

    }
}