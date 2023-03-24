package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookiesServlet")

public class CookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //suponesmos que el usuario visita por primera vez nuestro sitio
        boolean nuevoUsuario = true;

        //Obtenemos el arreglo de cookies
        //las cookies basicamente es un archivo que contiene un nombre
        //y un valor asociado, es como un mapa.
        //es la informacion que vamos a tener del lado del servidor
        // y esta informacion se envia al servidor 
        Cookie[] cookies = request.getCookies();//obtenemos las cookies del lado del cliente

        //buscando si ya existe una cookie creada con anterioridad
        //llamada visitante recurrente
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) {
                    //si ya existe la cookie es un usuario recurrente
                    nuevoUsuario = false;
                    break;
                }
            }
        }

        String mensaje = null;
        if (nuevoUsuario) {
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez.";

        } else {
            mensaje = "Gracias por visitar nuevamente nuestro sitio";
        }
        response.setContentType("tex/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Mensaje: " + mensaje);
        out.close();

    }

}
