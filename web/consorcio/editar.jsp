
<%@page import="entities.Consorcio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Consorcios</title>
    </head>
    <body>
        <% Consorcio cons = (Consorcio) request.getSession().getAttribute("consEditar"); %>
        <h1>Datos de Emisora</h1>
        <form action="../SvEditarCons" method="POST">
            <p><label>Emisora Id: </label> <input type="text" name="emi" value="<%= cons.getEmisora()%>"></p>
            <p><label>Productora Id: </label> <input type="text" name="prod" value="<%= cons.getProductora()%>"></p>
            <button type="submit"> Editar </button>
            <a href="index.jsp"><input type="button" value="Cancelar"></a>
        </form>
    </body>
</html>
