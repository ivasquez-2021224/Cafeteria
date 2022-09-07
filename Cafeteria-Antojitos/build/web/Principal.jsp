<%-- 
    Document   : Principal
    Created on : 2/09/2022, 11:34:32 PM
    Author     : izumi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

        <title>Menu Principal</title>
    </head>
    <body style="background-color: #b3b3b1;">
        <nav class="navbar navbar-expand-lg nvbar-light" style="background-color: #49240f">
              <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                  <li class="nav-item active">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Home" target="myFrame">Home</a>
                  </li>
                  <li class="nav-item">
                    <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Clientes&accion=ListarCliente" target="myFrame">Clientes</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Categorias&accion=ListarCategorias" target="myFrame">Categorias</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Cargo&accion=ListarCargo" target="myFrame">Cargo</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Sucursal" target="myFrame">Sucursal</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Marcas&accion=ListarMarcas" target="myFrame">Marcas</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Productos" target="myFrame">Productos</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Empleados&accion=ListarEmpleados" target="myFrame">Empleados</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Ventas&accion=ListarVentas" target="myFrame">Ventas</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=DetalleVenta" target="myFrame">Detalle de la venta</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" class="btn btn-outline-light" href="Controlador?menu=Proveedores&accion=ListarProveedores" target="myFrame">Proveedores</a>
                    </li>
                </ul>
              </div>
         </nav>
                    <div class="m-4" style="height: 620px; ">
                        <iframe name="myFrame" style="height: 100%; width: 100%; border: none;"></iframe>
                    </div>
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>

