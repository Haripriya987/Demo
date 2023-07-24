 @SuppressWarnings("unchecked")
public class GenericExample<T> {
    T data[]= (T[]) new String[3];

  /*  @SuppressWarnings("unchecked")
    public GenericExample() {
        // Create an Object array and then cast it to T[]
        data = (T[]) new Object[3];
    }*/

    public static void main(String args[]) {
        GenericExample<String> gd = new GenericExample<>();
        gd.data[0] = "Hi";
        gd.data[1] = "Bye";

       
        for(int i=0;i<3;i++){
            System.out.println(gd.data[i]);
        }
    }
}

/*
Hi
Bye
null
*/
