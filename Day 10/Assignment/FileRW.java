import java.io.*;
public class FileRW{
      public static void main(String args[]){
	try{
	    File file=new File("Reader.txt");
	   FileReader reader =new FileReader(file);
	   int x=reader.read();
	while(x!=-1){
		System.out.print((char) x);
		x=reader.read();
	}
	            reader.close();

	}
	catch(Exception e){
	System.out.println(e);
	}
}
}