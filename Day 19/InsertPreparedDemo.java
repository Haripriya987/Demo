import java.util.Scanner;
import java.sql.*;
public class InsertPreparedDemo{
	public static void main(String args[]){
	try{
	Class.forName("org.sqlite.JDBC");
	Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
	PreparedStatement stm= con.prepareStatement("insert into Dept values(?,?)");
	
	Scanner in=new Scanner(System.in);
	System.out.println("Enter Student Data");
	int r=in.nextInt();
	String name=in.next();
	
	stm.setInt(1,r);
	stm.setString(2,name);
	
	stm.executeUpdate();
	stm.close();
	con.close();
	}
	catch(Exception e){
	e.printStackTrace();	
	}

	}
}	

//Here we are taking input from the user to insert the data into dept table.
//It will add  a new row in that dept table