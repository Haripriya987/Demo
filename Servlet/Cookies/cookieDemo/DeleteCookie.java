package com.example.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/delete")
public class DeleteCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();

        Cookie ck1=new Cookie("Hello","");
        ck1.setMaxAge(0);
        resp.addCookie(ck1);

        writer.println("<h3>Cookie has been deleted</h3>");
    }
}
