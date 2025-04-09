package com.sa.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

public class DateServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // Get PrintWriter
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        
        // Get current date
        Date date = new Date();
        
        // Print response
        pw.println("<html><body>");
        pw.println("<h1>Current Date and Time: " + date.toString() + "</h1>");
        pw.println("</body></html>");
        
        // Close PrintWriter
        pw.close();
    }
}
