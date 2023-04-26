<%-- 
    Document   : Expresiones
    Created on : 26 abr. 2023, 15:49:10
    Author     : Santiago Perez 
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Expresiones</title>
    </head>
    <body>
        <h1>JSP con Expresiones</h1>
        concatenacion: <%= "saludos " + " " + "JSP"%>
        <br>
        Operacion Matematica <%= 2*3/2 %>
        <br><!-- comment -->
        Session id: <%= session.getId() %>
        <br>
        <br>
        <a href="index.html">Regrasar al inicio<a/>
        <br>
        
        
        
    </body>
</html>
