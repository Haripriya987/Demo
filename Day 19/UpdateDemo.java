import java.util.Scanner;
import java.sql.*;
public class UpdateDemo{
	public static void main(String args[]){
	try{
	Class.forName("org.sqlite.JDBC");
	Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
	Statement stm=con.createStatement();
	stm.executeUpdate("Update dept set dname='chem' where deptno=50");
	stm.close();
	con.close();
	}
	catch(Exception e){
	e.printStackTrace();
	}

	}
}
//It will modify the table dep  dname to chem where its deptno is 50
//for DML commands like insert,delete,update  we use executeUpdate Statement.