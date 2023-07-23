//There is a class available in java called File.
//To handle and access the properties of a file

import java.io.*;
public class FileClass{
	public static void main(String args[]){
	try{
	File f=new File("Destination.txt");
	System.out.println(f.isDirectory());
	System.out.println(f.getPath());
	System.out.println(f.getParent());
	System.out.println(f.length());
	System.out.println(f.isFile());
	
	}
	catch(Exception e){
	System.out.println(e);
	}
}
}


//false
//Destination.txt
//null
//45
//true
//