
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menú Personas</title>
    </head>
    <body>
        <center>
            <h1><a href="../index.jsp"><input type="button" value="Volver"></a> Menú Programas</h1>
            <hr>

            <h1>Datos de Personas</h1>
            <form action="../SvPersonas" method="POST">
                <table>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Cédula:</th>
                        <td><input type="text" name="cedu" required placeholder="Ingrese la Cédula"></td>
                    </tr>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Nombre:</th>
                        <td><input type="text" name="nombre" required placeholder="Ingrese el Nombre"></td>
                    </tr>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Rol:</th>
                        <td><input type="text" name="rol" required placeholder="Ingrese el Rol"></td>
                    </tr>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Producción:</th>
                        <td><input type="text" name="produc" required placeholder="Ingrese tipo de Producción"></td>
                    </tr>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Productora Id:</th>
                        <td><input type="text" name="product" required placeholder="Ingrese el Id"></td>
                    </tr>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Programa Id:</th>
                        <td><input type="text" name="prog" required placeholder="Ingrese el Id"></td>
                    </tr>
                    <tr>
                        <th style="text-align: right"><label style="color: red;">*</label> Programa Resumen Id:</th>
                        <td><input type="text" name="progRes" required placeholder="Ingrese el Id""></td>
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

            <h1>Lista de Personas</h1>
            <p>Para ver la lista de Personas, haga click en el siguiente botón</p>
            <form action="../SvPersonas" method="GET">
                <button type="submit"> Mostrar Personas </button>
            </form>
            <br>
            <hr>
            
            <h1>Eliminar Personas</h1>
            <p>Ingrese el Id del Persona a Eliminar</p>
            <form action="../SvEliminarPer" method="POST">
                <p><label><label style="color: red;">*</label> Id: </label> <input type="text" name="id" required></p>
                <button type="submit"> Eliminar </button>
            </form>
            <br>
            <hr>

            <h1>Editar Personas</h1>
            <p>Ingrese el Id del Persona a Editar</p>
            <form action="../SvEditarPer" method="GET">
                <p><label><label style="color: red;">*</label> Id: </label> <input type="text" name="id" required></p>
                <button type="submit"> Editar </button>
            </form>
            <br>
            <hr>
        </center>
    </body>
</html>
