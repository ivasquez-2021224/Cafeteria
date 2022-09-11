<%-- 
    Document   : Categorias
    Created on : 2/09/2022, 11:35:29 PM
    Author     : izumi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Categorias</title>
    </head>
    <body style="background-color: #b3b3b1;">
        <div class="d-flex">
            <div class="card col-sm-5">
                <div class="card-body">
                    <form action="Controlador?menu=Categorias" method="POST">
                        <h1 style="font-family: 'Poppins',sans-serif; align-content: center;">Categorías</h1>
                        <div class="form-group">
                            <label>Nombre Categoria:</label>
                            <input type="text" name="txtNombreCategoria" class="form-control">
                            <label>Descripcion Categoria:</label>
                            <input type="text" name="txtDescripcionCategoria" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="AgregarCategorias" class="btn btn-info">
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                    </form>
                </div>
            </div>
            <div class=" col-sm-5">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <td>CODIGO</td>
                            <td>NOMBRE</td>
                            <td>DESCRIPCION</td>
                            <td>ACCIONES</td>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="categorias" items="${categorias}">
                        <tr>
                            <td>${categorias.getCodigoCategoria()}</td>
                            <td>${categorias.getNombreCategoria()}</td>
                            <td>${categorias.getDescripcionCategoria()}</td>
                            <td>
                                <a class="btn btn-warning" href="">Editar</a>
                                <a class="btn btn-danger" href="">Eliminar</a>
                            </td>
                        </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>

