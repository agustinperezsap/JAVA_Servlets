package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GeneracionExcelServlet")

public class GeneracionExcelServlet extends HttpServlet{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //indicamos el tipo de respuesta al navegador 
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filname-excelEjemplo.xls");
        //para un uso mas profecional de excel poi.apache.org
        
        //indicar al navegador que no guarde cache
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-control", "no-store");
        response.setDateHeader("Expire", -1);
        
        //desplegar la informacion al cliente
        PrintWriter out = response.getWriter();
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("total\t=SUMA(b2:b3)");
        out.close();
    }
    
}
