
<%@page import="entities.Productora"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Productoras</title>
    </head>
    <body>
        <h1>Lista de Productoras <a href="index.jsp"><input type="button" value="Volver"></a></h1>
        <%
            List<Productora> listaProductoras = (List) request.getSession().getAttribute("listaProductoras");
            int cont = 1;
            for (Productora lp : listaProductoras) {
        %>
                <p><b>Productora N°<%= cont %></b></p>
                <p>Id: <%= lp.getId()%></p>
                <p>Nombre: <%= lp.getNombre() %></p>
                <p>RFC: <%= lp.getRfc()%></p>
                <p>Teléfono: <%= lp.getTelefono()%></p>
                <p>+---------------------------------------+</p>
                <% cont = cont + 1; %>
        
        <% } %>
    </body>
</html>
