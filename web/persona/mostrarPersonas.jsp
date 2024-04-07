
<%@page import="entities.Persona"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Personas</title>
    </head>
    <body>
        <h1>Lista de Personas <a href="index.jsp"><input type="button" value="Volver"></a></h1>
        <%
            List<Persona> listaPersona = (List) request.getSession().getAttribute("listaPersonas");
            int cont = 1;
            for (Persona lp : listaPersona) {
        %>
                <p><b>Persona N°<%= cont %></b></p>
                <p>Id: <%= lp.getId()%></p>
                <p>Cédula: <%= lp.getCedula()%></p>
                <p>Nombre: <%= lp.getNombre() %></p>
                <p>Rol: <%= lp.getRol()%></p>
                <p>Producción: <%= lp.getProduccion()%></p>
                <p>Productora Id: <%= lp.getProductora()%></p>
                <p>Programa Id: <%= lp.getPrograma()%></p>
                <p>Programa Resumen Id: <%= lp.getProgResumen()%></p>
                <p>+---------------------------------------+</p>
                <% cont = cont + 1; %>
        
        <% } %>
    </body>
</html>
