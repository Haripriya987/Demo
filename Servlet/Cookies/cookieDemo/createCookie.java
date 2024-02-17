package com.example.cookies;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/create")
public class createCookie extends HelloServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       // super.doGet(request, response);
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        Cookie co=new Cookie("Hello","World");
        co.setMaxAge(10);
        response.addCookie(co);

        out.println("Cookie is created");

    }
}
