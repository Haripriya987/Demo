@SuppressWarnings("unchecked")
class MyArray<T>
{
	T A[]=(T[]) new Object[10];
	int length=0;
	public void append(T v){
	A[length++]=v;
	}
	public void display(){
		for(int i=0;i<length;i++){
			System.out.println(A[i]);
		}
	}
}
class MyArray2<T> extends MyArray<T>{
}
public class GenericDemo3{
	public static void main(String args[]){
	MyArray2<Integer> ma=new MyArray2<>();
	ma.append(40);
	ma.append(50);
	ma.append(60);
	
	ma.display();

	}
}



//40
//50
//60