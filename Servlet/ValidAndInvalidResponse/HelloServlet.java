package com.example.demo5;

import java.io.*;
import java.sql.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


//@WebServlet("/helloservlet")
public class HelloServlet extends HttpServlet {

    String url="jdbc:mysql://localhost:3306/course";
    String username="root";
    String password="";
    Connection con=null;

    @Override
    public void init() throws ServletException {
        try {
            System.out.println("init is working fine");

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(url,username,password);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        System.out.println(name);
        System.out.println(password);
        resp.setContentType("text/html");
        PrintWriter write = resp.getWriter();
//        till now we are printing data manually now print the data which is from table in database
        try {

            String query = "select * from student where usename = ? and passwd = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            System.out.println("query is working fine");

            stmt.setString(1,name);
            stmt.setString(2,password);
            ResultSet res = stmt.executeQuery();
            if(res.next()) {
                System.out.println("Login is working fine");

                write.println("<h3> Login successful </h3>");
            }
            else{

//                to redirect html page we are using dispatcher
                RequestDispatcher rd = req.getRequestDispatcher("InvalidDetails.html");
                rd.forward(req,resp);

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}