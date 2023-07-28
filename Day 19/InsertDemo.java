import java.sql.*;
import java.util.*;
class InsertDemo{
	public static void main(String args[]){
	try{
	Class.forName("org.sqlite.JDBC");
	Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
	Statement stm=con.createStatement();
	stm.executeUpdate("insert into dept values(50,'Economy')");
	stm.close();
	con.close();

	}
	catch(Exception e){
	e.printStackTrace();
	}

	}
}
//It is updated the table Dept and it is inserted a new row.
/*when we execute the same query again then it throws this error

java.sql.SQLException: PRIMARY KEY must be unique
        at org.sqlite.NativeDB.throwex(NativeDB.java:210)
        at org.sqlite.NativeDB._exec(Native Method)
        at org.sqlite.Stmt.executeUpdate(Stmt.java:152)
        at InsertDemo.main(InsertDemo.java:9)
*/