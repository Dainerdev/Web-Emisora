
<%@page import="entities.Programa"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Programas</title>
    </head>
    <body>
        <h1>Lista de Programas <a href="index.jsp"><input type="button" value="Volver"></a></h1>
        <%
            List<Programa> listaPrograma = (List) request.getSession().getAttribute("listaProgramas");
            int cont = 1;
            for (Programa lp : listaPrograma) {
        %>
                <p><b>Productora N°<%= cont %></b></p>
                <p>Id: <%= lp.getId()%></p>
                <p>Nombre: <%= lp.getNombre() %></p>
                <p>Género: <%= lp.getGenero() %></p>
                <p>Consorcio Id: <%= lp.getConsorcio() %></p>
                <p>+---------------------------------------+</p>
                <% cont = cont + 1; %>
        
        <% } %>
    </body>
</html>
