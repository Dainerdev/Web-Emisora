
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú Programas</title>
    </head>
    <body>
        <center>
            <h1><a href="../index.jsp"><input type="button" value="Volver"></a> Menú Programas</h1>
            <hr>

            <h1>Datos de Programa</h1>
            <form action="../SvProgramas" method="POST">
                <table>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Nombre:</th>
                        <td><input type="text" name="nombre" required placeholder="Ingrese el Nombre"></td>
                    </tr>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Género:</th>
                        <td><input type="text" name="gen" required placeholder="Ingrese el Género"></td>
                    </tr>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Consorcio Id:</th>
                        <td><input type="text" name="cons" required placeholder="Ingrese el Id" maxlength="2"></td>
                    </tr>
                    <tr>
                        <td colspan="2" style="text-align: center;">
                            <button type="submit"> Guardar </button>
                            <button type="reset"> Limpiar </button>
                        </td>
                    </tr>    
                </table>        
            </form>
            <br>
            <hr>

            <h1>Lista de Programas</h1>
            <p>Para ver la lista de Programas, haga click en el siguiente botón</p>
            <form action="../SvProgramas" method="GET">
                <button type="submit"> Mostrar Programas </button>
            </form>
            <br>
            <hr>
            
            <h1>Eliminar Programas</h1>
            <p>Ingrese el Id del Programa a Eliminar</p>
            <form action="../SvEliminarProg" method="POST">
                <p><label><label style="color: red;">*</label> Id: </label> <input type="text" name="id" required></p>
                <button type="submit"> Eliminar </button>
            </form>
            <br>
            <hr>

            <h1>Editar Programas</h1>
            <p>Ingrese el Id del Programa a Editar</p>
            <form action="../SvEditarProg" method="GET">
                <p><label><label style="color: red;">*</label> Id: </label> <input type="text" name="id" required></p>
                <button type="submit"> Editar </button>
            </form>
            <br>
            <hr>
        </center>
    </body>
</html>
