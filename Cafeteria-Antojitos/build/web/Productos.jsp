<%-- 
    Document   : Producto
    Created on : 23/08/2022, 11:51:53 PM
    Author     : Sicajan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Productos</title>
    </head>
     <body style="background-color: #b3b3b1;">
        <div class="d-flex">
            <div class="card col-lg-4">
                <div class="card-body">
                    <form action="Controlador?menu=Productos" method="POST">
                       
                        <div class="form-group">
                            <label>NombresProducto:</label>
                            <input type="text" value="${producto.getNombreProducto()}" name="txtNombreProducto" class="form-control">
                         </div> 
                        <div class="form-group">
                            <label>Precio:</label>
                            <input type="text" value="${producto.getPrecio()}" name="txtPrecio" class="form-control">
                         </div>   
                        <div class="form-group">
                            <label>Stock:</label>
                            <input type="text" value="${producto.getStock()}" name="txtStock" class="form-control">
                         </div>   <div class="form-group">
                            <label>CodigoMarca:</label>
                            <input type="text" value="${producto.getCodigoMarca()}" name="txtCodigoMarca" class="form-control">
                         </div>  
                         <div class="form-group">
                            <label>CodigoCategoria:</label>
                            <input type="text" value="${producto.getCodigoCategoria()}" name="txtCodigoCategoria" class="form-control">
                         </div>
                         <input type="submit" name="accion" value="AgregarProducto" class="btn btn-info">
                         <input type="submit" name="accion" value="ActualizarProducto" class="btn btn-success">
                    </form>
                </div>
            </div>
            
            <div class="col-sm-8">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <td>CODIGOPRODUCTO</td>
                            <td>NOMBRESPRODUCTO</td>
                            <td>PRECIO</td>
                            <td>STOCK</td>
                            <td>CODIGOMARCA</td>
                            <td>CODIGOCATEGORIA</td>
                            <td>ACCIONES</td>
                        </tr>                      
                    </thead>
                    <tbody>
                        <c:forEach var="producto" items="${productos}">
                            
                        
                        <tr>
                          <td>${producto.getCodigoProducto()}</td>
                          <td>${producto.getNombreProducto()}</td> 
                          <td>${producto.getPrecio()}</td> 
                          <td>${producto.getStock()}</td> 
                          <td>${producto.getCodigoMarca()}</td> 
                          <td>${producto.getCodigoCategoria()}</td>
                          <td>
                              <a class="btn btn-warning" href="Controlador?menu=Productos&accion=EditarProducto&codigoProducto=${producto.getCodigoProducto()}" >Editar</a>
                              <a class="btn btn-danger" href="Controlador?menu=Productos&accion=EliminarProducto&codigoProducto=${producto.getCodigoProducto()}">Eliminar</a>  
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