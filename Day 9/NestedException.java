public class  NestedException{
	public static void main(String args[]){
	int a,b,c;
	int x[]={10,3,34,9};
	    try{
	              System.out.println(x[5]);
		try{
		a=15;
		b=0;
		c=a/b;
		System.out.println("Result is "+c);
	}
	catch(ArithmeticException e){
	System.out.println("Division by zero");
	}
	}
	catch(Exception e){
	System.out.println("Array Index Out of bound Exception");
	}
	System.out.println("End of program");
       }
}


//Array Index Out of bound Exception
//End of program
