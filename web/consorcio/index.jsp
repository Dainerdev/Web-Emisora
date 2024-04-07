
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú Consorcio</title>
    </head>
    <body>
        <center>
            <h1><a href="../index.jsp"><input type="button" value="Volver"></a> Menú Consorcio</h1>
            <hr>

            <h1>Datos de Consorcio</h1>
            <form action="../SvConsorcios" method="POST">
                <table>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Emisora:</th>
                        <td><input type="text" name="emisoraId" required placeholder="Indique el Id"></td>
                    </tr>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Productora:</th>
                        <td><input type="text" name="productoraId" required placeholder="Indique el Id"></td>
                    </tr>
                        <td colspan="2" style="text-align: center;">
                            <button type="submit"> Guardar </button>
                            <button type="reset"> Limpiar </button>
                        </td>
                    </tr>    
                </table>        
            </form>
            <br>
            <hr>

            <h1>Lista de Consorcios</h1>
            <p>Para ver la lista de Consorcio, haga click en el siguiente botón</p>
            <form action="../SvConsorcios" method="GET">
                <button type="submit"> Mostrar Consorcios </button>
            </form>
            <br>
            <hr>
            
            <h1>Eliminar Consorcio</h1>
            <p>Ingrese el Id de la Consorcio a Eliminar</p>
            <form action="../SvEliminarCons" method="POST">
                <p><label><label style="color: red;">*</label> Id: </label> <input type="text" name="id" required></p>
                <button type="submit"> Eliminar </button>
            </form>
            <br>
            <hr>

            <h1>Editar Consorcio</h1>
            <p>Ingrese el Id de la Consorcio a Editar</p>
            <form action="../SvEditarCons" method="GET">
                <p><label><label style="color: red;">*</label> Id: </label> <input type="text" name="id" required></p>
                <button type="submit"> Editar </button>
            </form>
            <br>
            <hr>
        </center>
    </body>
</html>
