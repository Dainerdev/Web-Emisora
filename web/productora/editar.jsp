
<%@page import="entities.Productora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Productora</title>
    </head>
    <body>
        <% Productora prod = (Productora) request.getSession().getAttribute("prodEditar"); %>
        <h1>Datos de Productora</h1>
        <form action="../SvEditarProd" method="POST">
            <p><label>Nombre: </label> <input type="text" name="nombre" value="<%= prod.getNombre() %>"></p>
            <p><label>RFC: </label> <input type="text" name="rfc" value="<%= prod.getRfc()%>"></p>
            <p><label>Teléfono: </label> <input type="text" name="tel" value="<%= prod.getTelefono()%>"></p>
            <button type="submit"> Editar </button>
            <a href="index.jsp"><input type="button" value="Cancelar"></a>
        </form>
    </body>
</html>
