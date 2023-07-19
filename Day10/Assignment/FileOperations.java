import java.util.Scanner;
import java.io.*;
public class  FileOperations{
	//create a file
	public static void create(String name){
		try{
		File file=new File(name);
		file.createNewFile();
		System.out.println("File is created");
		}
		catch(Exception e){
		}
	   }
	//exists a file
	public static void exist(String name){
		try{
		File file2=new File(name);
		if(file2.exists()){
			System.out.println("Yes , it  exists");
			}
		else{
			System.out.println("No");
			}
		}
		catch(Exception e){
		}
	}
	//read a file
	public static void read(String name){
		try{
		File file3=new File(name);
		FileReader reader=new FileReader(file3);
		int x=reader.read();
		while(x!=-1){
		System.out.print((char) x);
		x=reader.read();
		}
		reader.close();
		System.out.println();
		System.out.println("completed");
		}
		catch(Exception e){
		}
	}
	//write  a file
	public static void write( String name){
		try{
		File file=new File(name);
		if(!file.exists())
			file.createNewFile();
		FileWriter writer=new FileWriter(file,true);
		System.out.println("Enter the text");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		for(int i=0;i<str.length();i++){
			writer.write(str.charAt(i));
		}
		writer.close();
		}
		catch(Exception e){
		}
	}
	//copy a file 
	public static void copy(String name,String format,int number){
		try{
		File filename=new File(name);
		FileReader reader2=new FileReader(filename);
		int z=number;
		int ra=reader2.read();
		while(ra!=-1){
			System.out.print((char) ra);
			for(int i=1;i<=z;i++){
			 File fileformat=new File(format+i+".txt");
			     fileformat.createNewFile();
			     FileWriter writerr=new FileWriter(fileformat,true);
			     writerr.write(ra);
			     writerr.close();
			}
			ra=reader2.read();	
		}
		reader2.close();
		System.out.print(" ");
		System.out.println("Copy the file is completed");
		
		}
		catch(Exception e){
		}
	}
	//delete a file
	public static void delete(String name){
		try{
		File file6=new File(name);
		if(file6.exists()){
			file6.delete();
			System.out.println("File is Deleted");
		}
		else{
		System.out.println("This File does not exist.");
		}
		}
		catch(Exception e){
		}
	}
	//path of a file
	public static void path(String name){
		try{
		File file7=new File(name);
		if(file7.exists()){
		System.out.println(file7.getAbsoluteFile()); 
		}
		else{
		System.out.println("The file does not exists");
		}
		}
		catch(Exception e){
		}
	}
	public static void main(String args[]){
	Scanner in=new Scanner(System.in);	
	System.out.println("Enter the any one if the file operation to perform");
	System.out.println("1.Create a file  2.Check file Exists or not  3.Read a file   4.Write a file "); 
	System.out.println("5.Copy into multiple files        6.Delete a file     7.Path Of a file   8.Exit Program");
	int option=in.nextInt();
	System.out.println("Enter the file name  with extension also");
	String name=in.next();
	switch(option){
	case 1:       create(name);
		 break;
	case 2:  	exist(name);
		break;
	case 3: 	read(name);
		 break;
	case 4:   	write(name);
		break;
	case 5:  
		System.out.println("Enter the formats of file name to copy");
		String format=in.next();
		System.out.println("Enter the no of copies");
		int number=in.nextInt();
		copy(name,format,number);
		break;
	case 6:  	delete(name);
		break;
	case 7:  	path(name);
		break;
	default:System.out.println("Completed");
		break;

	}	
      }
}