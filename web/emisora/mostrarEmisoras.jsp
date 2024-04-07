
<%@page import="entities.Emisora"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Emisoras</title>
    </head>
    <body>
        <h1>Lista de Emisoras <a href="index.jsp"><input type="button" value="Volver"></a></h1>
        <%
            List<Emisora> listaEmisoras = (List) request.getSession().getAttribute("listaEmisoras");
            int cont = 1;
            for (Emisora le : listaEmisoras) {
        %>
                <p><b>Emisora N°<%= cont %></b></p>
                <p>Id: <%= le.getId()%></p>
                <p>Nombre: <%= le.getNombre() %></p>
                <p>Frecuencia: <%= le.getFrecuencia() %></p>
                <p>Transmisión: <%= le.getTransmision() %></p>
                <p>+---------------------------------------+</p>
                <% cont = cont + 1; %>
        
        <% } %>
    </body>
</html>
