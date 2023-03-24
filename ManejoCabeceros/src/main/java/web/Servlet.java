package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeaders")

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        //Procesamos los cabeceros relacionados
        //con la informacion de esta peticion
        //solicitamos el tipo de metodo Http que se esta ejecutnado
        //en esta peticion 
        String metodoHttp = request.getMethod();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Headers HTTP</h1>");
        out.print("</br>");
        out.print("Metodos HTTP: " + metodoHttp);
        
        String uri = request.getRequestURI();
        out.print("</br>");
        out.print("Uri solicitada: " + uri);
        
        out.print("</br>");
        out.print("</br>");
        
        //imprimimos todos los cabeceros disponibles
        Enumeration cabeceros = request.getHeaderNames();
        while(cabeceros.hasMoreElements()){
            String nombreCabeceros = (String) cabeceros.nextElement();
            out.print("<b>" + nombreCabeceros + "</b>");
            out.print(request.getHeader(nombreCabeceros));
            out.print("</br>");
        }
        
        out.print("<body>");
        out.print("</html>");
        out.close();

    }

}
