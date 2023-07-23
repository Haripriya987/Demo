@FunctionalInterface
interface My
{
	public void show();
	public int add(int a,int b);
}
public class FunInterface{
	public static void main(String args[]){
	}
}


/*@FunctionalInterface
^
  My is not a functional interface
    multiple non-overriding abstract methods found in interface My
1 error
*/