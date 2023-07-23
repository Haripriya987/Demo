import java.lang.*;
//It is a user Defined Exception
class DimensionException extends Exception{
//overriding the toString method
	public String toString(){
		return "Negative Dimensions are not allowed";
	}
}
public class ThrowDemo2{
	static int area(int l,int b)throws DimensionException
	{
		if(l<0 ||b<0){
		throw new DimensionException();
		}
		return l*b;
	}
	static void meth1()throws DimensionException
	{    System.out.println(area(10,5));
	}
public static void main(String args[])
{
	try{
	meth1();
	}
	catch(DimensionException e){
	System.out.println(e);
	}
    }
}


//Negative Dimensions are not allowed

//If the values of length or breadth is not negative then result is 
//50
