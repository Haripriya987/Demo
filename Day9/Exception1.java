public class Exception1{
	public static void main(String args[]){
	int a,b,c;
	    try{
		a=10;
		b=0;
		c=a/b;
		System.out.println("Result is "+c);
	}
	catch(ArithmeticException e){
	System.out.println("Division by zero");
	}
	System.out.println("End of program");
       }
}

//Division by zero
//End of program
