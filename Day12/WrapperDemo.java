public class WrapperDemo{
	public static void main(String args[]){
	    	int i=10;//It is primitive
		Integer a=Integer.valueOf(20);//Here it is an Object
		System.out.println(i);
		System.out.println(a);
		byte b=23;
		Byte by=Byte.valueOf(b);//It is an primtive for Byte Object
		System.out.println(by);
		Float f=Float.valueOf("12.34f");
		System.out.println(f);
		Double d=Double.valueOf("134.34");
		System.out.println(d);
		int c=i+a;
		System.out.println(c);	
		float z=c+f;
		System.out.println(z);	
	}
}


//10
//20
//23
//12.34
//134.34
//30
//42.34