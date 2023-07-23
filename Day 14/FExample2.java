import java.io.*;
public class FExample2{
	public static void main(String args[]){
	try{
	  FileInputStream fis=new FileInputStream("Test.txt");
	  byte b[]=new byte[fis.available()];
	  fis.read(b);
	   String str=new String(b);
	   System.out.println(str);
	   fis.close();
	}
	catch(Exception e){
	System.out.println(e);
	}
        }
}

//Learn Java Programming
/*
int x;
do{
fis.read();
	if(x!=-1)
	System.out.println((char)x);
}while(x!=-1);

*/
