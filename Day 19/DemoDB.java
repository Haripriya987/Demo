import java.util.Scanner;
import java.sql.*;
public class DemoDB{
	public static void main(String args[]){
	try{
	Class.forName("org.sqlite.JDBC");
	Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
	Statement stm=con.createStatement();
	ResultSet rs=stm.executeQuery("select * from Students");
	while(rs.next()){
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" " +rs.getInt(4));
	}
	stm.close();
	con.close();
	}
	catch(Exception e){
	}

	}
}