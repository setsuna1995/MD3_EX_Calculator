package com.example.calculator;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hel lo-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        float a = Float.parseFloat(request.getParameter("a"));
        float b = Float.parseFloat(request.getParameter("b"));
        char operator = request.getParameter("cal").charAt(0);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result:</h1>");
        try {
            float result = Calculator.calculate(a, b, operator);
            writer.println(a + " " + operator + " " + b + " " + "=" + result);
        }
        catch (Exception e) {
           writer.println("Error:" + e.getMessage());
        }
        writer.println("</html>");
    }

    public void destroy() {
        super.destroy();
    }
}