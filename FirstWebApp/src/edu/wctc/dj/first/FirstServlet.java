package edu.wctc.dj.first;

import java.io.BufferedReader;
import java.io.File;
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
        File file = new File("web" + File.separatorChar + "WEB-INF" + File.separatorChar + "file.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            String htmlString = sb.toString();
            response.getOutputStream().println(htmlString);
        } finally {
            br.close();
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String html = "<html><body>Hi. I received param1=" +
                request.getParameter("param1") +
                " via GET</body><html>";

        response.getOutputStream().println(html);
    }
}
