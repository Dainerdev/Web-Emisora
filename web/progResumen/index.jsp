
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú Programas Resumen</title>
    </head>
    <body>
        <center>
            <h1><a href="../index.jsp"><input type="button" value="Volver"></a> Menú Programas Resumen</h1>
            <hr>

            <h1>Datos de Programa Resumen</h1>
            <form action="../SvProgResumen" method="POST">
                <table>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Nombre:</th>
                        <td><input type="text" name="nombre" required placeholder="Ingrese el Nombre"></td>
                    </tr>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Programa Id:</th>
                        <td><input type="text" name="prog" required placeholder="Ingrese el Id"></td>
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

            <h1>Lista de Programas Resumen</h1>
            <p>Para ver la lista de Programas, haga click en el siguiente botón</p>
            <form action="../SvProgResumen" method="GET">
                <button type="submit"> Mostrar Programas Resumen </button>
            </form>
            <br>
            <hr>
            
            <h1>Eliminar Programas Resumen</h1>
            <p>Ingrese el Id del Programa Resumen a Eliminar</p>
            <form action="../SvEliminarPres" method="POST">
                <p><label><label style="color: red;">*</label> Id: </label> <input type="text" name="id" required></p>
                <button type="submit"> Eliminar </button>
            </form>
            <br>
            <hr>

            <h1>Editar Programas Resumen</h1>
            <p>Ingrese el Id del Programa Resumen a Editar</p>
            <form action="../SvEditarPres" method="GET">
                <p><label><label style="color: red;">*</label> Id: </label> <input type="text" name="id" required></p>
                <button type="submit"> Editar </button>
            </form>
            <br>
            <hr>
        </center>
    </body>
</html>
