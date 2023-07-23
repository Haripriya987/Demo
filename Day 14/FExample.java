import java.io.*;
public class FExample{
	public static void main(String args[]){
	try{
	  FileOutputStream fos=new FileOutputStream("Test.txt");
	  String str="Learn Java Programming";
	  fos.write(str.getBytes());
	   fos.close();
	}
	catch(Exception e){
	System.out.println(e);
	}


	}
}