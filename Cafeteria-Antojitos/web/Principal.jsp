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
                    <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Clientes&accion=ListarClientes" target="myFrame">Clientes</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Categorias&accion=ListarCategorias" target="myFrame">Categorias</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Cargo&accion=ListarCargo" target="myFrame">Cargo</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Sucursal&accion=ListarSucursal" target="myFrame">Sucursal</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Marcas&accion=ListarMarcas" target="myFrame">Marcas</a>
                  </li>
                  <li class="nav-item">
                       <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Productos&accion=ListarProducto" target="myFrame">Productos</a>                     
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Empleados&accion=ListarEmpleados" target="myFrame">Empleados</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Ventas&accion=ListarVentas" target="myFrame">Ventas</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=DetalleVenta&accion=ListarDetalle" target="myFrame">Detalle de la venta</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" href="Controlador?menu=Membresia&accion=ListarMembresia" target="myFrame">Membresia</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 10px; border: none" class="btn btn-outline-warning" class="btn btn-outline-light" href="Controlador?menu=Proveedores&accion=ListarProveedores" target="myFrame">Proveedores</a>
                    </li>
                </ul>
              </div>
                <div class="dropdown">
                    <button style="border:none" class="btn btn-outline-warning dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" >
                        ${usuario.getNombreEmpleado()} ${usuario.getApellidoEmpleado()}
                    </button>
                <div class="dropdown-menu dropdown-menu-right " aria-labellebdy="dropdownMenuButton" >
                    <a class="dropdown-item text-center" href="#" >
                        <img src="${usuario.getUsuarioImg()}" alt="" width="50">
                    </a>
                    <a class="dropdown-item text-center" href="#">${usuario.getUsuario()}</a>
                    <a class="dropdown-item text-center" href="#">${usuario.getTelefonoEmpleado()}</a>
                    <div class="dropdown-divider"></div>
                    <form action="Validar" method="POST">
                        <button  name="accion" name="Salir" class="dropdown-item text-center" href="#">Salir</button>
                    </form>            
                </div>                  
              </div>
         </nav>
                    <div class="m-4" style="height: 655px; ">
                        <iframe name="myFrame" style="height: 100%; width: 100%; border: none;"></iframe>
                    </div>
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>

