package com.example.acceptrequest;

import java.io.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    Connection con=null;
    String url="jdbc:mysql://localhost:3306/course";
    String username="root";
    String password="root";
    PreparedStatement  stm=null;
    ResultSet rs=null;



    public void init() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("init is working fine");


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello

        String name=request.getParameter("usename");
        String  passwd=request.getParameter("passwd");

        PrintWriter out = response.getWriter();
        try {
            String query="select * from student where usename=? and passwd=?";

            stm= con.prepareStatement(query);
            stm.setString(1,name);
            stm.setString(2,passwd);

             rs=stm.executeQuery();
            if(rs.next()){
//                out.println("<html><body>");
//                out.println("<h1>Login successful </h1>");
//                out.println("</html></body>");
                request.getRequestDispatcher("/drives").forward(request,response);
            }
            else{
                request.getRequestDispatcher("InvalidLogin.html").forward(request,response);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void destroy() {
        try{
            rs.close();
            stm.close();
            con.close();

        }
        catch (Exception e){

        }
    }
}