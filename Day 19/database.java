import java.sql.*;
class database{
public static void main(String args[]){
try{
Class.forName("org.sqlite.JDBC");
Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ");
Statement stm=con.createStatement();
ResultSet rs=stm.executeQuery("select * from dept");
int dno;
String dname;
while(rs.next()){
dno=rs.getInt("deptno");
dname=rs.getString("dname");
System.out.println(dno+ " "+ dname);
}
}
catch(Exception e){}
}
}


/*
10 CS
20 STATS
30 MATHS
40 PHYSICS
*/