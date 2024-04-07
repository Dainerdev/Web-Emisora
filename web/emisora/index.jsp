
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú Emisoras</title>
    </head>
    <body>
        <center>
            <h1><a href="../index.jsp"><input type="button" value="Volver"></a> Menú Emisoras</h1>
            <hr>

            <h1>Datos de Emisora</h1>
            <form action="../SvEmisoras" method="POST">
                <table>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Nombre:</th>
                        <td><input type="text" name="nombre" required placeholder="Imgrese el Nombre"></td>
                    </tr>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Frecuencia:</th>
                        <td><input type="text" name="frec" required placeholder="Hz"></td>
                    </tr>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Transimisión:</th>
                        <td><input type="text" name="trans" required placeholder="AM / FM" maxlength="2"></td>
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

            <h1>Lista de Emisoras</h1>
            <p>Para ver la lista de usuarios, haga click en el siguiente botón</p>
            <form action="../SvEmisoras" method="GET">
                <button type="submit"> Mostrar Emisoras </button>
            </form>
            <br>
            <hr>
            
            <h1>Eliminar Emisoras</h1>
            <p>Ingrese el Id de la Emisora a Eliminar</p>
            <form action="../SvEliminar" method="POST">
                <p><label><label style="color: red;">*</label> Id: </label> <input type="text" name="id" required></p>
                <button type="submit"> Eliminar </button>
            </form>
            <br>
            <hr>

            <h1>Editar Emisoras</h1>
            <p>Ingrese el Id de la Emisora a Editar</p>
            <form action="../SvEditar" method="GET">
                <p><label><label style="color: red;">*</label> Id: </label> <input type="text" name="id" required></p>
                <button type="submit"> Editar </button>
            </form>
            <br>
            <hr>
        </center>
    </body>
</html>
