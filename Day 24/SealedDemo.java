import java.lang.*;

sealed class A   permits B{
    void show(){
        System.out.println("Sealed class is used");
    }
}
 non-sealed  class B extends A{
    void show(){
        System.out.println("Here also we are inheritig sealed class");
    }
}

class D extends  B{
}
public class SealedDemo{
    public static void main(String args[]){
        System.out.println("Hello world");
        B demo=new B();
        demo.show();

    }

    
}

