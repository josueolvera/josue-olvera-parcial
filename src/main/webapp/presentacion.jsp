<%-- 
    Document   : presentacion
    Created on : 3/07/2015, 08:09:34 PM
    Author     : T-107
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Examen</title>
    </head>
    <body>
        <h1>Resultado de Calificaciones</h1>
        <form action="resultados" method="GET">
            <input type="text" placeholder="ingresa el nombre" name="nombre"><br>
            <input type="text" placeholder="ingresa la calificacion" name="calificacion"><br>
            <input type="submit" value="Enviar">  
             
        </form>
    </body>
</html>
