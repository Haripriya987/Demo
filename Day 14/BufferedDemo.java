import java.io.*;
public class BufferedDemo{
	public static void main(String args[])throws Exception
	{
	FileInputStream fis=new FileInputStream("Test.txt");
	BufferedInputStream bis=new BufferedInputStream(fis);
	try{
	int x;
	while((x=bis.read())!=-1){
	System.out.print((char) x);
	}
	}
	catch(Exception e){
	System.out.println(e);
	}
	


	}
}
//Learn Java Programming