//Here Lamda Expression as a parameter
interface Lamdaa{
	public void display();
}
class UseLamda{
	public void callLamda(Lamdaa l){
		l.display();
	}
}
public class LamdaParam{
		public void method1(){
		UseLamda ul=new UseLamda();
		ul.callLamda(()->{ System.out.println("Here we are passing parameter to lamda Expression");});
}	
	public static void main(String args[]){
		LamdaParam m=new LamdaParam();

		m.method1();
	}
}

//Here we are passing parameter to lamda Expression
