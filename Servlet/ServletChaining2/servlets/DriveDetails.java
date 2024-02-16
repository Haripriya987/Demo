package com.example.acceptrequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.*;

@WebServlet("/eligible")
public class DriveDetails extends HttpServlet {
    Connection con=null;
    String url="jdbc:mysql://localhost:3306/course";
    String username="root";
    String password="root";
    PreparedStatement stm=null;
    ResultSet rs=null;

    @Override
    public void init(){
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter write=resp.getWriter();
        resp.setContentType("text/html");
        String name=req.getParameter("usename");
        String password=req.getParameter("passwd");
        String query1="select * from student where usename=? and passwd=?";
        try {
            stm=con.prepareStatement(query1);
            stm.setString(1,name);
            stm.setString(2,password);
            rs=stm.executeQuery();
            if(rs.next()) {
                System.out.println("it is not getting");
                int ten = rs.getInt(3);
                int inter = rs.getInt(4);
                int degree = rs.getInt(5);

                String query2 = "select * from drive where 10th<=?  AND 12th<=? AND Degree<=?";
                PreparedStatement ps = con.prepareStatement(query2);
                ps.setInt(1, ten);
                ps.setInt(2, inter);
                ps.setInt(3, degree);
                ResultSet res = ps.executeQuery();

                write.println("</br>");
                write.println("<html><body>");
                write.println("<h1>Elgible Drives</h1>");
                write.println("<table border=2>\n" + " <tr> \n" +
                        " <th>id</th> \n" +
                        " <th>name</th> \n" +
                        " <th>10</th> \n" +
                        " <th>12</th> \n" +
                        " <th>degree</th> \n" +
                        " <th>profile</th> \n" +
                        " <th>package</th> \n" +
                        " <th>skills</th> \n" +
                        "</tr>");


                while (res.next()) {

                    write.println(" <tr> \n" +
                            " <td>" + res.getInt(1) + "</td> \n" +
                            " <td>" + res.getString(2) + "</td> \n" +
                            " <td>" + res.getInt(3) + "</td> \n" +
                            " <td>" + res.getInt(4) + "</td> \n" +
                            " <td>" + res.getInt(5) + "</td> \n" +
                            " <td>" + res.getString(6) + "</td> \n" +
                            " <td>" + res.getFloat(7) + "</td> \n" +
                            " <td>" + res.getString(8) + "</td> \n" +
                            "</tr>");

                }

                write.println("</table>");
                write.println("</body></html>");

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (Exception e){

        }



    }

    @Override
    public void destroy(){
        try{
            rs.close();
            stm.close();
            con.close();

        }
        catch (Exception e){

        }

    }
}
