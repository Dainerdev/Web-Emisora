
<%@page import="entities.Programa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Programa</title>
    </head>
    <body>
        <% Programa prog = (Programa) request.getSession().getAttribute("progEditar"); %>
        <h1>Datos de Programa</h1>
        <form action="../SvEditarProg" method="POST">
            <p><label>Nombre: </label> <input type="text" name="nombre" value="<%= prog.getNombre() %>"></p>
            <p><label>Género: </label> <input type="text" name="gen" value="<%= prog.getGenero()%>"></p>
            <p><label>Consorcio Id: </label> <input type="text" name="cons" value="<%= prog.getConsorcio()%>"></p>
            <button type="submit"> Editar </button>
            <a href="index.jsp"><input type="button" value="Cancelar"></a>
        </form>
    </body>
</html>
