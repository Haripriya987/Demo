package com.example.servletconfig;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class DriveDetails  extends HttpServlet {
    Connection con = null;
    public void init(ServletConfig sc) throws ServletException {
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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        try {
            String name = req.getParameter("name");
            String password = req.getParameter("password");

            String query1 = "select * from student where usename = ? and passwd = ?";
            PreparedStatement stmt1 = con.prepareStatement(query1);
            stmt1.setString(1,name);
            stmt1.setString(2,password);
            ResultSet res1 = stmt1.executeQuery();
            res1.next();
            int ten = res1.getInt(3);
            int twelve = res1.getInt(4);
            int grd = res1.getInt(5);
            PrintWriter write = resp.getWriter();

            System.out.println(ten+" "+twelve+""+grd);

            write.println("<h1>Eligible Drives Are </h1>");
            String query  = "select * from drive where 10th <= ? and 12th <= ? and Degree <= ?";
            PreparedStatement ptmt1 = con.prepareStatement(query);
            ptmt1.setInt(1,ten);
            ptmt1.setInt(2,twelve);
            ptmt1.setInt(3,grd);
            ResultSet res = ptmt1.executeQuery();

            write.println("<table border=\"1\">\n" +
                    "    <tr>\n" +
                    "        <th>id</th>\n" +
                    "        <th>Name</th>\n" +
                    "        <th>10th</th>\n" +
                    "        <th>12th</th>\n" +
                    "        <th>grad</th>\n" +
                    "        <th>Profile</th>\n" +
                    "        <th>package</th>\n" +
                    "        <th>Skills</th>\n" +
                    "    </tr>");

            while(res.next()) {
                write.println("    <tr>\n" +
                        "        <td>"+res.getInt(1)+"</td>\n" +
                        "        <td>"+res.getString(2)+"</td>\n" +
                        "        <td>"+res.getInt(3)+"</td>\n" +
                        "        <td>"+res.getInt(4)+"</td>\n" +
                        "        <td>"+res.getInt(5)+"</td>\n" +
                        "        <td>"+res.getString(6)+"</td>\n" +
                        "        <td>"+res.getFloat(7)+"</td>\n" +
                        "        <td>"+res.getString(8)+"</td>\n" +
                        "    </tr>");
            }

            write.println("</table>");


        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}