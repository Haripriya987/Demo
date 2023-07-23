public class StringBufferBuilder{
	public static void main(String args[]){
	 String s1=new String("Hello");
	StringBuffer s2=new StringBuffer("Hello");
	StringBuilder s3=new StringBuilder("Hello");
	s1.concat("world");
	s2.append("world");
	s3.append("World");
	 System.out.println(s1);//Immutable
	System.out.println(s2);//Mutable
	System.out.println(s3);//Mutable


	}
}

/*
Hello
Helloworld
HelloWorld

*/