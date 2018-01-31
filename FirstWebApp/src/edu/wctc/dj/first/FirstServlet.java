package edu.wctc.dj.first;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "FirstServlet")
public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String html = "<html><body>Hi. I received param1=" +
                request.getParameter("param1") +
                " via POST</body><html>";

        response.getOutputStream().println(html);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String html = "<html><body>Hi. I received param1=" +
                request.getParameter("param1") +
                " via GET</body><html>";

        response.getOutputStream().println(html);
    }
}
