import java.io.*;
public class RandomAccessDemo{
	public static void main(String args[]){
	try{
	RandomAccessFile rf=new RandomAccessFile("Test.txt","rw");
	System.out.print((char)rf.read());
	System.out.print((char)rf.read());		
	System.out.print((char)rf.read());		
	System.out.print((char)rf.read());		
	rf.write('d');
	System.out.print((char)rf.read());		
	System.out.println((char)rf.read());		
	rf.seek(2);
	System.out.print((char)rf.read());		
	System.out.print((char)rf.getFilePointer()+2);		
	}
	catch(Exception e){
	System.out.println(e);
	}
	


}
}
//Lear J
//a5