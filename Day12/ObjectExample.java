class MyObject{
	public String toString(){
		return "My Object";
	}
}
public class ObjectExample{
     public static void main(String args[]){
	MyObject o1=new MyObject();
	System.out.println(o1);
	MyObject o2=o1;
	System.out.println(o1.equals(o2));
	System.out.println(o1.hashCode());


   }
}


//My Object
//True
//746292446
