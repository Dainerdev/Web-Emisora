
<%@page import="entities.ProgResumen"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Programa Resumen</title>
    </head>
    <body>
        <% ProgResumen progres = (ProgResumen) request.getSession().getAttribute("progResumEditar"); %>
        <h1>Datos de Programa Resumen</h1>
        <form action="../SvEditarPres" method="POST">
            <p><label>Nombre: </label> <input type="text" name="nombre" value="<%= progres.getNombre() %>"></p>
            <p><label>Programa Id: </label> <input type="text" name="prog" value="<%= progres.getPrograma()%>"></p>
            <p><label>Consorcio Id: </label> <input type="text" name="cons" value="<%= progres.getConsorcio()%>"></p>
            <button type="submit"> Editar </button>
            <a href="index.jsp"><input type="button" value="Cancelar"></a>
        </form>
    </body>
</html>
