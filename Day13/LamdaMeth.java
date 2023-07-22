interface MyLamda{
public void display(String str);
}
public class LamdaMeth{
	public  void reverse(String str){
	  System.out.println(str.toLowerCase());
	}
	public static void main(String args[]){
	LamdaMeth mm=new LamdaMeth();
	MyLamda m=mm::reverse;
	m.display("HELLOWORLD");
	
	}
}

//helloworld