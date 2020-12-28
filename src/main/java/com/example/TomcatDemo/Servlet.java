package com.example.TomcatDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet("/ShowGET")
public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println("HELLO WEB HELLO WEB");


        String wartosc_imie = request.getParameter("imie");
        String wartosc_miasto = request.getParameter("miasto");
        response.getWriter().append("Witaj " + wartosc_imie + " z " + wartosc_miasto);
        writer.println("Witaj " + wartosc_imie + " z " + wartosc_miasto);

        System.out.println("Witaj " + wartosc_imie + " z " + wartosc_miasto);

        Map<String, String[]> mapa_klucz_wartość = request.getParameterMap();

        for (String klucz : mapa_klucz_wartość.keySet()) {
            response.getWriter().print(klucz + "=");

            for (String wartość : mapa_klucz_wartość.get(klucz))
                response.getWriter().println(wartość);

        }
    }
}
//@WebServlet("/path3")
//public class Servlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter responseWriter = resp.getWriter();
//        responseWriter.write("<html><body>");
//        responseWriter.write("<p>ContextPath: " + req.getContextPath() + "</p>");
//        responseWriter.write("<p>ServletPath: " + req.getServletPath() + "</p>");
//        responseWriter.write("<p>RequestURI: " + req.getRequestURI() + "</p>");
//        responseWriter.write("<p>RequestURL: " + req.getRequestURL() + "</p>");
//        responseWriter.write("</body></html>");
//    }
//}




