public class GenericDemo2{
	static<E> void show(E[] list){
	for(E x:list){
	System.out.println(x);
	}
              }	
              public static void main(String args[]){

	show(new String[]{"Hi","Bye"});	
	show(new Integer[]{10,20,30});	


	}
}

/*Hi
Bye
10
20
30
*/