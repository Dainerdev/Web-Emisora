
<%@page import="entities.ProgResumen"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Programas Resumen</title>
    </head>
    <body>
        <h1>Lista de Programas Resumen <a href="index.jsp"><input type="button" value="Volver"></a></h1>
        <%
            List<ProgResumen> listaProgResumen = (List) request.getSession().getAttribute("listaProgResumen");
            int cont = 1;
            for (ProgResumen lpr : listaProgResumen) {
        %>
                <p><b>Programa Resumen N°<%= cont %></b></p>
                <p>Id: <%= lpr.getId()%></p>
                <p>Nombre: <%= lpr.getNombre() %></p>
                <p>Programa Id: <%= lpr.getPrograma()%></p>
                <p>Consorcio Id: <%= lpr.getConsorcio() %></p>
                <p>+---------------------------------------+</p>
                <% cont = cont + 1; %>
        
        <% } %>
    </body>
</html>
