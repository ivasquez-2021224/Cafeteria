<%-- 
    Document   : Sucursal
    Created on : 2/09/2022, 11:36:11 PM
    Author     : izumi
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Poppins:400;800;900" rel="stylesheet">
        <title>Clientes</title>
    </head>
    <body style="background-color: #b3b3b1;">
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form  action="Controlador?menu=Sucursal" method="POST">
                        <h1 style="font-family: 'Poppins',sans-serif; align-content: center;">Sucursales</h1>
                        <div class="form-group">
                            <label>Nombre sucursal:</label>
                            <input type="text" name="txtNombreSucursal" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Direccion:</label>
                            <input type="text" name="txtDireccion" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="AgregarSucursal" class="btn btn-info">
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-success" >
                    </form>
                </div>
            </div>

            <div class="col-sm-8">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <td>CODIGO</td>
                            <td>NOMBRES</td>
                            <td>DIRECCIÓN</td>
                            <td>ACCIONES</td>
                        </tr>
                    </thead>
                    <tbody>

                    <c:forEach var="sucursal" items="${sucursales}">
                        <tr>
                            <td>${sucursal.getCodigoSucursal()}</td>
                            <td>${sucursal.getNombreSucursal()}</td>
                            <td>${sucursal.getDireccion()}</td>
                            <td>
                                <a class="btn btn-warning" href="#">Editar</a>
                                <a class="btn btn-danger" href="#">Eliminar</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>

