
<%@page import="entities.Emisora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Emisoras</title>
    </head>
    <body>
        <% Emisora emi = (Emisora) request.getSession().getAttribute("emiEditar"); %>
        <h1>Datos de Emisora</h1>
        <form action="../SvEditarEmi" method="POST">
            <p><label>Nombre: </label> <input type="text" name="nombre" value="<%= emi.getNombre() %>"></p>
            <p><label>Frecuencia: </label> <input type="text" name="frec" value="<%= emi.getFrecuencia()%>"></p>
            <p><label>Transmisión: </label> <input type="text" name="trans" value="<%= emi.getTransmision()%>"></p>
            <button type="submit"> Editar </button>
            <a href="index.jsp"><input type="button" value="Cancelar"></a>
        </form>
    </body>
</html>
