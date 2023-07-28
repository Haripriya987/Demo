import java.util.Scanner;
import java.sql.*;
public class CreateDemo{
	public static void main(String args[]){
	try{
	Class.forName("org.sqlite.JDBC");
	Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
	Statement stm=con.createStatement();
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the query to create table along with its columns");
	String str=in.nextLine();

	stm.executeUpdate(str);
	
	stm.close();
	con.close();
	}
	catch(Exception e){
	e.printStackTrace();
	}	

	}
}
//It has created a new table Temp in the already existing database
/*
sqlite> .open univ
sqlite> .table
STUDENTS  Temp      dept
sqlite> .schema
CREATE TABLE dept (deptno integer primary key,dname text);
CREATE TABLE STUDENTS(
sid integer primary key,
sname text,
city text,
deptno integer,
foreign key (deptno) references dept (deptno));
CREATE TABLE Temp (a integer,b float);
*/
