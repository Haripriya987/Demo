public class MathDemo{
	public static void main(String args[]){
		System.out.println("Absolute: "+Math.abs(-123));
		System.out.println("CubeRoot: "+Math.cbrt(8));
		System.out.println("Exact Decrement: "+Math.decrementExact(7));
		System.out.println("Round division: "+Math.floorDiv(50,9));
		System.out.println("Log base 10: "+Math.log10(100));
		System.out.println("Maximum of 100 and 20 :"+Math.max(100,20));
		System.out.println("Tan :"+Math.tan(45*Math.PI/180)); 
		System.out.println("Convert to radians :"+Math.toRadians(90));
		System.out.println("Random Number :"+Math.random()*1000);
		System.out.println("Power of a Number :"+Math.pow(2,3));
		System.out.println("It gives the value of a float Number :"+Math.nextAfter(12.5,13));
		

	}
}
/*
Absolute: 123
CubeRoot: 2.0
Exact Decrement: 6
Round division: 5
Log base 10: 2.0
Maximum of 100 and 20 :100
Tan :0.9999999999999999
Convert to radians :1.5707963267948966
Random Number :289.39318358811727
Power of a Number :8.0
It gives the value of a float Number :12.500000000000002
*/