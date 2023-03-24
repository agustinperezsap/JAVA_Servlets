package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Declaramos la variable contador
        int contador = 0;
        
        //Revisamos si existe la cookie contadorVisitas
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("contadorVisitas")) {
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }
        //incrementar el contador en 1
        contador++;
        
        //agregamos la respuesta al navegador 
        Cookie c = new Cookie("contadorVisitas",Integer.toString(contador));
        
        //la cookie se almacenara en el cliente por 1 hora = 3600 seg
        c.setMaxAge(3600);
        response.addCookie(c);
        
        //Mandamos el mensaje al navegador
        response.setContentType("text/html/charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Contador de visitas de cada cliente: " + contador);
        out.close();
        
    }
    
}
