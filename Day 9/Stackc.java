import java.lang.*;
class StackOverFlow extends Exception{
	public String toString(){
	        return "Stack is full";
	}
}
class StackUnderFlow extends Exception{
	public String toString(){
	        return "Stack is empty";
	}
}
class Stack{
	 int size;
	 int top=-1;
	 int a[];
	public Stack(int s){
	size=s;
	a=new int[size];
	}
	public void push(int x)throws StackOverFlow
	{
	       if(top==size-1){
		throw new StackOverFlow();}
	         top++;
	         a[top]=x;
	}
	public int pop()throws StackUnderFlow
	{
		int x=-1;
		if(top==-1)
		throw new  StackUnderFlow();
		x=a[top];
		top--;
		return x;
	}
}
public class Stackc{
	public static void main(String args[]){
	 Stack st=new Stack(5);
	try{
	st.push(10);
	st.push(15);
	st.push(11);
	st.push(12);
	st.push(10);
	st.push(15);
	
	}
	catch(StackOverFlow s){
		System.out.println(s);
	}
	try{
	st.pop();
	st.pop();
	st.pop();
	st.pop();
	st.pop();
	st.pop();
	}
	catch(StackUnderFlow s){
		System.out.println(s);
	}
    }
}
 
//Stack is full
//Stack is empty
