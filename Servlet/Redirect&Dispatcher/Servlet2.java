package com.example.dispatchredirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/serv2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h3>Servlet2 , Request2</h3>");
        req.getRequestDispatcher("/serv3").include(req,resp);
       //req.getRequestDispatcher("/serv3").forward(req,resp);

        //resp.sendRedirect("serv3");

        out.println("<h3>Servlet2 , Response2</h3>");
    }
}
