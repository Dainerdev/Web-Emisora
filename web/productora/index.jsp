
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú Productoras</title>
    </head>
    <body>
        <center>
            <h1><a href="../index.jsp"><input type="button" value="Volver"></a> Menú Productoras</h1>
            <hr>

            <h1>Datos de Productora</h1>
            <form action="../SvProductoras" method="POST">
                <table>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Nombre:</th>
                        <td><input type="text" name="nombre" required placeholder="Indique el Nombre"></td>
                    </tr>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> RFC:</th>
                        <td><input type="text" name="rfc" required placeholder="Indique el RFC"></td>
                    </tr>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Teléfono:</th>
                        <td><input type="text" name="tel" required placeholder="Indique el número"></td>
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

            <h1>Lista de Productoras</h1>
            <p>Para ver la lista de Productora, haga click en el siguiente botón</p>
            <form action="../SvProductoras" method="GET">
                <button type="submit"> Mostrar Productoras </button>
            </form>
            <br>
            <hr>
            
            <h1>Eliminar Productora</h1>
            <p>Ingrese el Id de la Productora a Eliminar</p>
            <form action="../SvEliminarProd" method="POST">
                <p><label><label style="color: red;">*</label> Id: </label> <input type="text" name="id" required></p>
                <button type="submit"> Eliminar </button>
            </form>
            <br>
            <hr>

            <h1>Editar Productoras</h1>
            <p>Ingrese el Id de la Productora a Editar</p>
            <form action="../SvEditarProd" method="GET">
                <p><label><label style="color: red;">*</label> Id: </label> <input type="text" name="id" required></p>
                <button type="submit"> Editar </button>
            </form>
            <br>
            <hr>
        </center>
    </body>
</html>
