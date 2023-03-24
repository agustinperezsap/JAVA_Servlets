package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HolaMundo")

//No se recomienda usar codigo HTML dentro de los Servlet

public class HolaMundo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("/text/html;chartset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("Hola mundo Desde Servlet");
    }
    
    

}
