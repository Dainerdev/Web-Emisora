
<%@page import="entities.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Persona</title>
    </head>
    <body>
        <% Persona per = (Persona) request.getSession().getAttribute("perEditar"); %>
        <h1>Datos de Persona</h1>
        <form action="../SvEditarPer" method="POST">
            <p><label>Cédula: </label> <input type="text" name="cedu" value="<%= per.getCedula()%>"></p>
            <p><label>Nombre: </label> <input type="text" name="nombre" value="<%= per.getNombre()%>"></p>
            <p><label>Rol: </label> <input type="text" name="rol" value="<%= per.getRol()%>"></p>
            <p><label>Producción: </label> <input type="text" name="produc" value="<%= per.getProduccion()%>"></p>
            <p><label>Productora Id: </label> <input type="text" name="product" value="<%= per.getProductora()%>"></p>
            <p><label>Programa Id: </label> <input type="text" name="prog" value="<%= per.getPrograma()%>"></p>
            <p><label>Programa Resumen Id: </label> <input type="text" name="progResum" value="<%= per.getProgResumen()%>"></p>
            
            <button type="submit"> Editar </button>
            <a href="index.jsp"><input type="button" value="Cancelar"></a>
        </form>
    </body>
</html>
