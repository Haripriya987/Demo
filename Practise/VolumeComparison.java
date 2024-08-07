import java.util.*;
import java.lang.*;
import java.io.*;

class VolumeComparison
{
	public static void main (String[] args) 
	{
            Scanner in=new Scanner(System.in);
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            int z=in.nextInt();
            
            int cuboid=a*b*c;
            int cube=z*z*z;
            
            if(cube>cuboid)
            System.out.println("Cube");
            else if(cuboid>cube)
            System.out.println("Cuboid");
            else 
            System.out.println("Equal");
            
	}
}
