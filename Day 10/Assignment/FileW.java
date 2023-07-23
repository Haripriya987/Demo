import java.io.*;
import java.util.Scanner;
public class FileW{
	public static void main(String args[]){
	Scanner in =new Scanner(System.in);
	try{  
	 File file;
	System.out.println("Enter the source file to read"); 
	   String source=in.next();
	   File file1=new File(source);
	   FileReader reader =new FileReader(file1);
	  System.out.println("Enter  the filename to create");
	   String name=in.next();
	    System.out.println("Enter no of copies to create");
	    int n=in.nextInt();
	  int x=reader.read();
	  while(x!=-1){
		System.out.print((char) x);
		 for(int i=1;i<=n;i++){
		file=new File(name+i+".txt");
		file.createNewFile();
                               FileWriter  writer=new FileWriter(file,true);
		writer.write(x);
		writer.close();		
	}
	x=reader.read();
	}
	            reader.close();
	  System.out.println();
	  System.out.println("Completed");
	
	}
	catch(Exception e){
	}

  }
}