import java.io.*;
public class ByteDemo2{
	public static void main(String args[]){
	try{
	ByteArrayOutputStream bos=new ByteArrayOutputStream(10);
	bos.write('a');
	bos.write('b');
	bos.write('c');
	bos.write('d');
	bos.write('e');
	bos.write('f');
	bos.write('g');
	byte b[]=bos.toByteArray();
	for(byte x:b)
	System.out.print((char)x);
	bos.close();
	
	}
	catch(Exception e){
	}
          }
}


//abcdefg