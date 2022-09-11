<%-- 
    Document   : Ventas
    Created on : 2/09/2022, 11:37:05 PM
    Author     : izumi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Vista Ventas</title>
    </head>
    <body style="background-color: #b3b3b1;">
        <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="Controlador?menu=Ventas" method="POST">
                        <h1 style="font-family: 'Poppins',sans-serif; align-content: center;">Ventas</h1>
                        <div class="form-group">
                            <label>Fecha:</label>
                            <input type="text" name="txtFecha" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Monto:</label>
                            <input type="text" name="txtMonto" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Número De Serie:</label>
                            <input type="text" name="txtNumeroSerie" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Código Cliente:</label>
                            <input type="text" name="txtCodigoCliente" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Código Empleado:</label>
                            <input type="text" name="txtCodigoEmpleado" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="AgregarVentas" class="btn btn-info">
                        <input type="submit" name="accion" value="ActualizarVentas" class="btn btn-success">
                    </form>
                </div>
            </div>

            <div class="col-sm-7">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <td style="width: 5%;">CÓDIGO</td>
                            <td style="width: 15%;">FECHA</td>
                            <td style="width: 5%;">MONTO</td>
                            <td style="width: 15%;">NUM. SERIE</td>
                            <td style="width: 5%;">CLIENTE</td>
                            <td style="width: 15%;">EMPLEADO</td>
                            <td >ACCIONES</td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="ventas" items="${ventas}">
                            <tr style="height: 30px;">
                                <td>${ventas.getCodigoVenta()}</td>
                                <td>${ventas.getFecha()}</td>
                                <td>${ventas.getMonto()}</td>
                                <td>${ventas.getNumeroSerie()}</td>
                                <td>${ventas.getCodigoCliente()}<td>
                                <td>${ventas.getCodigoEmpleado()}</td>
                                <td>
                                    <a style="text-decoration: none; padding: 0px; padding-left: 8px; padding-right: 8px; font-family: helvetica; font-weight: 100; font-size: 15px; font-style: italic; border-radius: 10px;" class="btn btn-warning" href="">Editar</a>
                                    <a style="text-decoration: none; padding: 0px; padding-left: 8px; padding-right: 8px; font-family: helvetica; font-weight: 100; font-size: 15px; font-style: italic; border-radius: 10px;" class="btn btn-danger" href="">Eliminar</a>
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
