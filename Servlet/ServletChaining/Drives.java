package com.example.acceptrequest;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/drives")
public class Drives extends HttpServlet {
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
            con= DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        try{
            String query="select * from drive";
            stm=con.prepareStatement(query);
            rs=stm.executeQuery();
            out.println("<h1>Drives Data</h1>");
            out.println("<html><body>");
            out.println("<table border=2>\n"+" <tr> \n" +
                    " <th>id</th> \n" +
                    " <th>name</th> \n" +
                    " <th>10</th> \n" +
                    " <th>12</th> \n" +
                    " <th>degree</th> \n" +
                    " <th>profile</th> \n" +
                    " <th>package</th> \n" +
                    " <th>skills</th> \n"+
                    "</tr>");

            while(rs.next()){
                int id=rs.getInt(1);
                String name=rs.getString(2);
                int ten=rs.getInt(3);
                int twelve=rs.getInt(4);
                int degree=rs.getInt(5);
                String profile=rs.getString(6);
                float sal=rs.getFloat(7);
                 String skill=rs.getString(8);

                out.println(" <tr> \n" +
                        " <td>"+id+"</td> \n" +
                        " <td>"+name+"</td> \n" +
                        " <td>"+ten+"</td> \n" +
                        " <td>"+twelve+"</td> \n" +
                        " <td>"+degree+"</td> \n" +
                        " <td>"+profile+"</td> \n" +
                        " <td>"+sal+"</td> \n" +
                        " <td>"+skill+"</td> \n"+
                        "</tr>");



            }
            out.println("</body></html>");


        }catch (Exception e){
            e.printStackTrace();
        }



    }


    @Override
    public  void destroy(){
        try{
            rs.close();
            stm.close();
            con.close();

        }
        catch (Exception e){

        }
    }

}
