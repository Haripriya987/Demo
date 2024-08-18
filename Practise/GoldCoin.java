import java.util.Scanner;

class GoldCoin
{
    public static void main (String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        String inputLine = in.nextLine();
        String[] inputs = inputLine.split(" ");
        
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int x = Integer.parseInt(inputs[2]);
        int y = Integer.parseInt(inputs[3]);
        
        if (x > y)
            System.out.println(a); 
            else
            System.out.println(b); 
    }
}
