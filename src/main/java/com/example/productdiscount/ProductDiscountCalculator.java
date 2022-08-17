package com.example.productdiscount;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculator", value = "/Calculate")
public class ProductDiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double ListPrice = Float.parseFloat(request.getParameter("List Price"));
        double DiscountPercent = Float.parseFloat(request.getParameter("Discount Percent"));

        double  DiscountAmount = ListPrice * DiscountPercent* 0.01;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>ListPrice: " + ListPrice  + "</h1>");
        writer.println("<h1>DiscountPercent: " + DiscountPercent + "</h1>");
        writer.println("<h1>DiscountAmount: " + DiscountAmount + "</h1>");
        writer.println("</html>");
    }
}