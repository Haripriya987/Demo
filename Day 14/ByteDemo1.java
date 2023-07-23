import java.io.*;
public class ByteDemo1{
	public static void main(String args[]){
	try{
	byte b[]={'a','b','c','d','e','f','g'};
	ByteArrayInputStream bis=new ByteArrayInputStream(b);
	int x;
	while((x=bis.read())!=-1){
	System.out.print((char)x);
	}
	bis.close();
	}
	catch(Exception e){
	}
          }
}


//abcdefg