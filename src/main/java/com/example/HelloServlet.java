package com.example;

import java.io.*;
import javax.servlet.http.HttpServlet;
import jakarta.servlet.annotation.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Deployed via Jenkins CI/CD!</h2>");
    }
}
