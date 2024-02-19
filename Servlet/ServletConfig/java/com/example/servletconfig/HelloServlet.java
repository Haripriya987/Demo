package com.example.servletconfig;

import java.io.*;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class HelloServlet extends HttpServlet {
    Connection con = null;
    @Override
    public void init(ServletConfig sc) throws ServletException {
        //System.out.println("Is it working");
        try {
            String url = sc.getInitParameter("url");
            String username = sc.getInitParameter("username");
            String password = sc.getInitParameter("password");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        System.out.println(name);
        System.out.println(password);
        resp.setContentType("text/html");
        PrintWriter write = resp.getWriter();
        try {

            String query = "select * from student where usename=? and passwd=?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1,name);
            stmt.setString(2,password);
            ResultSet res = stmt.executeQuery();
            if(res.next()) {
                req.getRequestDispatcher("/drive").include(req,resp);

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

