import java.io.*;
public class BufferedDemo2{
	public static void main(String args[])throws Exception
	{
	FileInputStream fis=new FileInputStream("Test.txt");
	BufferedInputStream bis=new BufferedInputStream(fis);
	try{
	System.out.print((char)bis.read());
	System.out.print((char)bis.read());
	System.out.print((char)bis.read());
	bis.mark(10);
	System.out.print((char)bis.read());
	System.out.print((char)bis.read());
	bis.reset();
	System.out.print((char)bis.read());


	}
	catch(Exception e){
	System.out.println(e);
	}
	


	}
}
//Learnr