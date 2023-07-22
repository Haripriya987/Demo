
import java.lang.annotation.*;
import java.lang.reflect.*;

public class Annotation1{
    public static void main(String args[]) {
       // Dhoni d = new Dhoni();
        for (Method x : Dhoni.class.getDeclaredMethods()) {
            if (x.isAnnotationPresent(VIP.class)) {
                System.out.println("Dhoni is a VIP");
            } else {
                System.out.println("Dhoni is not a VIP");
            }
        }
    }
}

class Dhoni {
    String name = "Mahendra Singh Dhoni";

    @VIP(count = "3", status = "retired")
    void display() {
        System.out.println("Batting");
    }

    void Speciality() {
        System.out.println("Great Captain");
    }
}

class Player {
    String name = "Player";

    void Speciality() {
        System.out.println("He is a new Batsman");
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface VIP {
    String count();

    String status();
}
