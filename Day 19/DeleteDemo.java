import java.sql.*;
import java.util.*;
class DeleteDemo{
	public static void main(String args[]){
	try{
	Class.forName("org.sqlite.JDBC");
	Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
	Statement stm=con.createStatement();
	stm.executeUpdate("delete from dept where deptno=50");
	stm.close();
	con.close();

	}
	catch(Exception e){
	e.printStackTrace();
	}

	}
}
//It is updated the table Dept and it is deleted a  row having dept no=50.