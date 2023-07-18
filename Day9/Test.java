import mypack1.PackDemo1;
 
public class Test{
	public static void main(String args[]){
		PackDemo1 d=new PackDemo1();
		d.Display();
		System.out.println(d.a+d.b+d.c);

	}
}
//Differnt package with non sub class so it cannot acess the //default,Private and protected members of that class