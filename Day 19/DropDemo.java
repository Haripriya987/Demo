import java.util.Scanner;
import java.sql.*;
public class DropDemo{
	public static void main(String args[]){
	try{
	Class.forName("org.sqlite.JDBC");
	Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
	Statement stm=con.createStatement();
	
	stm.executeUpdate("Drop table Temp");
	
	stm.close();
	con.close(); 
	
	}
	catch(Exception e){
	}	


	}
}
//By using  this we  can drop a table from a database.