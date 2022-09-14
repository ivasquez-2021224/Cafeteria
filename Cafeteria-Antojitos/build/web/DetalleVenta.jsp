<%-- 
    Document   : DetalleVenta
    Created on : 2/09/2022, 11:37:21 PM
    Author     : izumi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        <title>Detalles De Venta</title>
    </head>
    <body style="background-color: #b3b3b1;">
       <div class="d-flex">
            <div class="card col-sm-4">
                <div class="card-body">
                    <form action="Controlador?menu=DetalleVenta" method="POST">
                        <h1 style="font-family: 'Poppins',sans-serif; align-content: center;">Detalle de Ventas</h1>
                     
                        <div class="input-group">
                            <label>DPI Cliente</label>
                            <input type="text" name="txtDPICliente" value="${clientess.getDPICliente()}" class="form-control rounded" placeholder="DPI Cliente" > <input type="submit" value="Verificacion" name="accion" class="btn btn-outline-primary" >
                        </div>    
                        <div>
                            <br><input type="text" name="txtNombreCliente" value="${clientess.getNombreCliente()} ${clientess.getApellidoCliente()}" class="form-control" placeholder="Nombre Cliente">
                        </div>
                        <br><div class="input-group">
                                <br>
                                <label>Datos Producto:</label>
                                <br> <input type="text" name="txtDatosProducto" value="${producto.getCodigoProducto()}" class="form-control rounded" placeholder="Dato del Producto" > <input type="submit" value="Verificacion" name="accion" class="btn btn-outline-primary"> 
                            </div>
                            
                            <div>
                                <br> <input type="text" name="txtNombreProducto" value="${producto.getNombreProducto()}" class="form-control" placeholder="Nombre Producto">
                            </div>
                            
                            <div>
                                <br> <input type="text" name="txtPrecioProducto" value="${producto.getPrecio()}" class="form-control" placeholder="Precio Producto">
                            </div>
                               
                            <div>
                                <br> <input type="text" name="txtStock" value="${producto.getStock()}" class="form-control" placeholder="Stock">
                            </div>
                                
                            <div>
                                <label>Cantidad</label>
                                <input type="text" value="${detalleVenta.getCantidad()}" name="txtCantidad" class="form-control">
                            </div>
                            
                            <br><div class="input-group">
                            <label>Codigo Venta</label>
                            <input type="text" name="txtCodVenta" value="${detalleVenta.getCodigoVenta()}" class="form-control rounded" placeholder="Codigo Venta" > <input type="submit" value="Verificacion" name="accion" class="btn btn-outline-primary" >
                            <p>${mensaje}</p>
                        </div>
                            <br>
                        <input type="submit" name="accion" value="AgregarDetalle" class="btn btn-info">
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                    </form>
                </div>
            </div>
            <div class="col-sm-8">
                <table class="table table-secondary table-striped table-hover">
                    <thead>
                        <tr>
                            <td>CODIGO</td>
                            <td>CANTIDAD</td>
                            <td>PRECIO</td>
                            <td>CODIGO PRODUCTO</td>
                            <td>SUB-TOTAL</td>
                            <td>CODIGO VENTA</td>
                            <td>ACCIONES</td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="detalleVenta" items="${ventass}">
                            <tr>
                            <td>${detalleVenta.getCodigoDetalleVenta()}</td>
                            <td>${detalleVenta.getCantidad()}</td>
                            <td>${detalleVenta.getPrecio()}</td>
                            <td>${detalleVenta.getCodigoProducto()}</td>
                            <td>${detalleVenta.getCantidad() * detalleVenta.getPrecio()}</td>
                            <td>${detalleVenta.getCodigoVenta()}</td>
                           
                            <td>
                                <a class="btn btn-warning" href="Controlador?menu=DetalleVenta&accion=Editar&codigoDetalleVenta=${detalleVenta.getCodigoDetalleVenta()}">Editar</a>
                                <a class="btn btn-danger" href="Controlador?menu=DetalleVenta&accion=Eliminar&codigoDetalleVenta=${detalleVenta.getCodigoDetalleVenta()}">Eliminar</a>
                            </td>
                            </tr>
                        </c:forEach>
                        
                    </tbody>
                    <tfoot>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td>Total:</td>
                            <td>${total}</td>
                            <td></td>
                            <td></td>
                        </tr>
                    </tfoot>
                </table>
            </div>
        </div>    
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>

