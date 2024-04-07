
<%@page import="entities.Consorcio"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Consorcios</title>
    </head>
    <body>
        <h1>Lista de Consorcios <a href="index.jsp"><input type="button" value="Volver"></a></h1>
        <%
            List<Consorcio> listaConsorcios = (List) request.getSession().getAttribute("listaConsorcios");
            int cont = 1;
            for (Consorcio lc : listaConsorcios) {
        %>
                <p><b>Consorcio N°<%= cont %></b></p>
                <p>Id: <%= lc.getId()%></p>
                <p>Emisora Id: <%= lc.getEmisora() %></p>
                <p>Productora Id: <%= lc.getProductora() %></p>
                <p>+---------------------------------------+</p>
                <% cont = cont + 1; %>
        
        <% } %>
    </body>
</html>
