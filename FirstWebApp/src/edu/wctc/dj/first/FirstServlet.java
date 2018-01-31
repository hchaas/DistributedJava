package edu.wctc.dj.first;

import java.io.FileReader;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "FirstServlet")
public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        String html = "<html><body>Hi. I received param1=" +
//                request.getParameter("param1") +
//                " via POST</body><html>";
//
//        response.getOutputStream().println(html);

        //using a file reader
        FileReader fileReader = new FileReader("file");
        int ch;
        String html2 = "";
        while ((ch=fileReader.read())!=-1) html2 += fileReader.read();
        // close the file
        fileReader.close();

        String html3 = "<html><body>" + html2;
        response.getOutputStream().println(html3);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String html = "<html><body>Hi. I received param1=" +
                request.getParameter("param1") +
                " via GET</body><html>";

        response.getOutputStream().println(html);
    }
}
