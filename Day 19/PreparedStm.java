import java.sql.*;
import java.util.Scanner;
class PreparedStm{
	public static void main(String args[]){
	try{
	Class.forName("org.sqlite.JDBC");
	Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
	PreparedStatement stm=con.prepareStatement("select sname from students where city=?");

	Scanner in=new Scanner(System.in);
	System.out.println("Enter city name");
	String city=in.next();
	stm.setString(1,city);

	ResultSet rs=stm.executeQuery();

	while(rs.next()){
	System.out.println(rs.getString("sname"));
	}
	stm.close();
	con.close();
	}
	catch(Exception e){
	e.printStackTrace();
	}

	}
}

/*
Enter city name
Delhi
Ajay
Ramesh
Anitha
Rani
*/
