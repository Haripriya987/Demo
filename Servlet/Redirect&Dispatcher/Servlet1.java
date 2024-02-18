package com.example.dispatchredirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/serv1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h3>Servlet1 , Request1</h3>");
      req.getRequestDispatcher("/serv2").include(req,resp);
            // req.getRequestDispatcher("/serv2").forward(req,resp);
          //  resp.sendRedirect("serv2");
        out.println("<h3>Servlet1 , Response1</h3>");

    }
}
