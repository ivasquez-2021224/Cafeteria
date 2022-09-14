/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cargo;
import modelo.CargoDAO;
import modelo.Categorias;
import modelo.CategoriasDAO;
import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.DetalleVenta;
import modelo.DetalleVentaDAO;
import modelo.Empleado;
import modelo.EmpleadoDAO;
import modelo.Marcas;
import modelo.MarcasDAO;
import modelo.Membresia;
import modelo.MembresiaDAO;
import modelo.Productos;
import modelo.ProductosDAO;
import modelo.Proveedor;
import modelo.ProveedorDAO;
import modelo.Sucursal;
import modelo.SucursalDAO;
import modelo.Ventas;
import modelo.VentasDAO;

/**
 *
 * @author izumi
 */
public class Controlador extends HttpServlet {

    Cargo cargo = new Cargo();
    CargoDAO cargoDAO = new CargoDAO();
    Cliente cliente = new Cliente();
    ClienteDAO clienteDAO = new ClienteDAO();
    Proveedor proveedor = new Proveedor();
    ProveedorDAO proveedorDAO = new ProveedorDAO();
    Ventas ventas = new Ventas();
    VentasDAO ventasDAO = new VentasDAO();
    EmpleadoDAO empleadoDAO = new EmpleadoDAO();
    Empleado empleado = new Empleado();
    Marcas marcas = new Marcas();
    MarcasDAO marcasDAO = new MarcasDAO();
    Categorias categorias = new Categorias();
    CategoriasDAO categoriasDAO = new CategoriasDAO();
    DetalleVentaDAO detalleDAO = new DetalleVentaDAO();
    DetalleVenta detalle = new DetalleVenta();
    Productos producto = new Productos();
    ProductosDAO productoDAO = new ProductosDAO();
    Sucursal sucursal = new Sucursal();
    SucursalDAO sucursalDAO = new SucursalDAO();
    Membresia membresia = new Membresia();
    MembresiaDAO membresiaDAO = new MembresiaDAO();
    int codEmpleado;
    int codCliente;
    int codVenta;
    int codProducto;
    int codCategoria;
    int codMarca;
    int codProveedor;
    int codCargo;
    int codDetalleVenta;
    int codVentas;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        if (menu.equals("Cargo")) {

            switch (accion) {
                case "ListarCargo":
                    List listaCargo = cargoDAO.listar();
                    request.setAttribute("cargos", listaCargo);
                    break;
                case "AgregarCargo":
                    String tipoCargo = request.getParameter("txtTipoCargo");
                    cargo.setTipoCargo(tipoCargo);
                    cargoDAO.agregar(cargo);
                    request.getRequestDispatcher("Controlador?menu=Cargo&accion=ListarCargo").forward(request, response);
                    break;

                case "Editar":
                        codCargo = Integer.parseInt(request.getParameter("codigoCargo"));
                        Cargo c = cargoDAO.listarCodigoCargo(codCargo);
                        request.setAttribute("cargo", c);
                        request.getRequestDispatcher("Controlador?menu=Cargo&accion=ListarCargo").forward(request, response);
                        break;   
                
                case "Actualizar":
                        String tipoCar = request.getParameter("txtTipoCargo");
                        cargo.setTipoCargo(tipoCar);
                        cargo.setCodigoCargo(codCargo);
                        cargoDAO.actualizar(cargo);
                        request.getRequestDispatcher("Controlador?menu=Cargo&accion=ListarCargo").forward(request, response);
                        break;

                case "Eliminar":
                        codCargo = Integer.parseInt(request.getParameter("codigoCargo"));
                        cargoDAO.eliminar(codCargo);
                        request.getRequestDispatcher("Controlador?menu=Cargo&accion=ListarCargo").forward(request, response);
                        break;
            }
            request.getRequestDispatcher("Cargo.jsp").forward(request, response);
        } else if (menu.equals("Clientes")) {
            switch (accion) {
                case "ListarClientes":
                    List listaClientes = clienteDAO.listarClientes();
                    request.setAttribute("clientes", listaClientes);
                    break;
                case "AgregarCliente":
                    String DPI = request.getParameter("txtDPICliente");
                    String nombres = request.getParameter("txtNombresCliente");
                    String apellidos = request.getParameter("txtApellidosCliente");
                    String direccion = request.getParameter("txtDireccionCliente");
                    String telefono = request.getParameter("txtTelefonoCliente");
                    int membresia = Integer.parseInt(request.getParameter("txtMembresiaCliente"));
                    cliente.setDPICliente(DPI);
                    cliente.setNombreCliente(nombres);
                    cliente.setApellidoCliente(apellidos);
                    cliente.setDireccionCliente(direccion);
                    cliente.setTelefonoCliente(telefono);
                    cliente.setCodigoMembresia(membresia);
                    clienteDAO.agregarCliente(cliente);
                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=ListarClientes").forward(request, response);
                    break;
                case "Editar":
                    codCliente = Integer.parseInt(request.getParameter("codigoCliente"));
                    Cliente c = clienteDAO.listarCodigoCliente(codCliente);
                    request.setAttribute("cliente", c);
                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=ListarClientes").forward(request, response);
                    break;
                case "ActualizarCliente":
                    String DPICli = request.getParameter("txtDPICliente");
                    String nombresCli= request.getParameter("txtNombresCliente");
                    String apellidosCli = request.getParameter("txtApellidosCliente");
                    String direccionCli = request.getParameter("txtDireccionCliente");
                    String telefonoCli = request.getParameter("txtTelefonoCliente");
                    cliente.setDPICliente(DPICli);
                    cliente.setNombreCliente(nombresCli);
                    cliente.setApellidoCliente(apellidosCli);
                    cliente.setDireccionCliente(direccionCli);
                    cliente.setTelefonoCliente(telefonoCli);
                    cliente.setCodigoCliente(codCliente);
                    clienteDAO.actualizarCliente(cliente);
                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=ListarClientes").forward(request, response);
                    break;
                case "Eliminar":
                    codCliente = Integer.parseInt(request.getParameter("codigoCliente"));
                    clienteDAO.eliminarCliente(codCliente);
                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=ListarClientes").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("Clientes.jsp").forward(request, response);
        } else if (menu.equals("Proveedores")) {
            switch (accion) {
                case "ListarProveedores":
                    List listaProveedor = proveedorDAO.listarProveedores();
                    request.setAttribute("proveedores", listaProveedor);
                    break;
                case "AgregarProveedor":
                    String Nombre = request.getParameter("txtNombreProveedor");
                    String Direccion = request.getParameter("txtDireccionProveedor");
                    String Telefono = request.getParameter("txtTelefonoProveedor");
                    proveedor.setNombreProveedor(Nombre);
                    proveedor.setDireccion(Direccion);
                    proveedor.setTelefono(Telefono);
                    proveedorDAO.agregarProveedor(proveedor);
                    request.getRequestDispatcher("Controlador?menu=Proveedores&accion=ListarProveedores").forward(request, response);
                    break;
                case "EditarProveedor":
                    codProveedor = Integer.parseInt(request.getParameter("codigoProveedor"));
                    Proveedor p = proveedorDAO.listarCodigoProveedor(codProveedor);
                    request.setAttribute("proveedor", p);
                    request.getRequestDispatcher("Controlador?menu=Proveedores&accion=ListarProveedores").forward(request, response);
                    break;
                    
                case "ActualizarProveedor":
                    String nombreProv = request.getParameter("txtNombreProveedor");
                    String direccionPro = request.getParameter("txtDireccionProveedor");
                    String telefonoPro = request.getParameter("txtTelefonoProveedor");
                    proveedor.setNombreProveedor(nombreProv);
                    proveedor.setDireccion(direccionPro);
                    proveedor.setTelefono(telefonoPro);
                    proveedor.setCodigoProveedor(codProveedor);
                    proveedorDAO.actualizarProveedor(proveedor);
                    request.getRequestDispatcher("Controlador?menu=Proveedores&accion=ListarProveedores").forward(request, response);
                    break;
                    
                case "EliminarProveedor":
                    codProveedor = Integer.parseInt(request.getParameter("codigoProveedor"));
                    proveedorDAO.eliminarProveedor(codProveedor);
                    request.getRequestDispatcher("Controlador?menu=Proveedores&accion=ListarProveedores").forward(request, response);
                    break;
            }

            request.getRequestDispatcher("Proveedores.jsp").forward(request, response);
        } else if (menu.equals("Ventas")) {
            switch (accion) {
                case "ListarVentas":
                    List listaVentas = ventasDAO.listarVentas();
                    request.setAttribute("ventas", listaVentas);
                    break;
                case "AgregarVentas":
                    String fecha = request.getParameter("txtFecha");
                    Double monto = Double.parseDouble(request.getParameter("txtMonto"));
                    String numSerie = request.getParameter("txtNumeroSerie");
                    int codCliente = Integer.parseInt(request.getParameter("txtCodigoCliente"));
                    int codEmpleado = Integer.parseInt(request.getParameter("txtCodigoEmpleado"));
                    ventas.setFecha(fecha);
                    ventas.setMonto(monto);
                    ventas.setNumeroSerie(numSerie);
                    ventas.setCodigoCliente(codCliente);
                    ventas.setCodigoEmpleado(codEmpleado);
                    ventasDAO.agregarVenta(ventas);
                    request.getRequestDispatcher("Controlador?menu=Ventas&accion=ListarVentas").forward(request, response);
                    break;
                case "Editar":
                    codVenta = Integer.parseInt(request.getParameter("codigoVenta"));
                    Ventas v = ventasDAO.listarCodigoVenta(codVenta);
                    request.setAttribute("venta", v);
                    request.getRequestDispatcher("Controlador?menu=Ventas&accion=ListarVentas").forward(request, response);
                    break;
                case "Actualizar":
                    String fechaVen = request.getParameter("txtFecha");
                    Double montoVen = Double.parseDouble(request.getParameter("txtMonto"));
                    String numSerieVen = request.getParameter("txtNumeroSerie");
                    ventas.setFecha(fechaVen);
                    ventas.setMonto(montoVen);
                    ventas.setNumeroSerie(numSerieVen);
                    ventas.setCodigoVenta(codVenta);
                    ventasDAO.actualizarVenta(ventas);
                    request.getRequestDispatcher("Controlador?menu=Ventas&accion=ListarVentas").forward(request, response);
                    System.out.println(fechaVen + montoVen + numSerieVen);
                    break;
                case "Eliminar":
                    codVenta = Integer.parseInt(request.getParameter("codigoVenta"));
                    ventasDAO.eliminarVentas(codVenta);
                    request.getRequestDispatcher("Controlador?menu=Ventas&accion=ListarVentas").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("Ventas.jsp").forward(request, response);
        } else if (menu.equals("Empleados")) {
            switch (accion) {
                case "ListarEmpleados":
                    List listaEmpleados = empleadoDAO.listar();
                    request.setAttribute("empleados", listaEmpleados);
                    break;
                case "AgregarEmpleado":
                    String DPI = request.getParameter("txtDPIEmpleado");
                    String nombre = request.getParameter("txtNombreEmpleado");
                    String apellido = request.getParameter("txtApellidoEmpleado");
                    String telefono = request.getParameter("txtTelefonoEmpleado");
                    String user = request.getParameter("txtUsuario");
                    int codCar = Integer.parseInt(request.getParameter("txtCodigoCargo"));
                    int codSuc = Integer.parseInt(request.getParameter("txtCodigoSucursal"));
                    empleado.setDPIEmpleado(DPI);
                    empleado.setNombreEmpleado(nombre);
                    empleado.setApellidoEmpleado(apellido);
                    empleado.setTelefonoEmpleado(telefono);
                    empleado.setUsuario(user);
                    empleado.setCodigoCargo(codCar);
                    empleado.setCodigoSucursal(codSuc);
                    empleadoDAO.agregar(empleado);
                    request.getRequestDispatcher("Controlador?menu=Empleados&accion=ListarEmpleados").forward(request, response);
                    break;
                case "Editar":
                    codEmpleado = Integer.parseInt(request.getParameter("codigoEmpleado"));
                    Empleado e = empleadoDAO.listarCodigoEmpleado(codEmpleado);
                    request.setAttribute("empleado", e); 
                    request.getRequestDispatcher("Controlador?menu=Empleados&accion=ListarEmpleados").forward(request, response);                    
                    break;
                case "Actualizar":
                    String DPIEmp = request.getParameter("txtDPIEmpleado");
                    String nombreEmp = request.getParameter("txtNombreEmpleado");
                    String apellidoEmp = request.getParameter("txtApellidoEmpleado");
                    String telefonoEmp = request.getParameter("txtTelefonoEmpleado");
                    String userEmp = request.getParameter("txtUsuario");
                    empleado.setDPIEmpleado(DPIEmp);
                    empleado.setNombreEmpleado(nombreEmp);
                    empleado.setApellidoEmpleado(apellidoEmp);
                    empleado.setTelefonoEmpleado(telefonoEmp);
                    empleado.setUsuario(userEmp);
                    empleado.setCodigoEmpleado(codEmpleado);
                    empleadoDAO.actualizar(empleado);
                    request.getRequestDispatcher("Controlador?menu=Empleados&accion=ListarEmpleados").forward(request, response);                    
                    break;
                case "Eliminar":
                    codEmpleado = Integer.parseInt(request.getParameter("codigoEmpleado"));
                    empleadoDAO.eliminar(codEmpleado);
                    request.getRequestDispatcher("Controlador?menu=Empleados&accion=ListarEmpleados").forward(request, response);                    
                    break;
            }
            request.getRequestDispatcher("Empleados.jsp").forward(request, response);
        } else if (menu.equals("Principal")) {
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        } else if (menu.equals("Marcas")) {
            switch (accion) {

               case "ListarMarcas":
                    List listaMarca = marcasDAO.listarMarcas();
                    request.setAttribute("marcas", listaMarca);
                    break;

                case "Agregar":
                    String nombre = request.getParameter("txtNombresMarca");
                    int codProveedor = Integer.parseInt(request.getParameter("txtCodigoProveedor"));
                    marcas.setNombreMarca(nombre);
                    marcas.setCodigoProveedor(codProveedor);
                    marcasDAO.agregarMarcas(marcas);
                    request.getRequestDispatcher("Controlador?menu=Marcas&accion=ListarMarcas").forward(request, response);
                    

                    break;
                case "Editar":
                    codMarca = Integer.parseInt(request.getParameter("codigoMarca"));
                    request.setAttribute("read", "readonly");
                    Marcas mar = marcasDAO.listarCodigoMarcas(codMarca);
                    request.setAttribute("marca", mar);
                    request.getRequestDispatcher("Controlador?menu=Marcas&accion=ListarMarcas").forward(request, response);
                    
                    break;
                case "Actualizar":
                    String nomMarca = request.getParameter("txtNombresMarca");
//                    String cdProveedor = request.getParameter("txtCodigoProveedor");
                    marcas.setNombreMarca(nomMarca);
//                    marcas.setCodigoProveedor(cdProveedor);
                    marcas.setCodigoMarca(codMarca);
                    marcasDAO.actualizarMarcas(marcas);
                    request.getRequestDispatcher("Controlador?menu=Marcas&accion=ListarMarcas").forward(request, response);
                    
                    break;
                case "Eliminar":
                    codMarca = Integer.parseInt(request.getParameter("codigoMarca"));
                    marcasDAO.eliminarMarcas(codMarca);
                    request.getRequestDispatcher("Controlador?menu=Marcas&accion=ListarMarcas").forward(request, response);
                    break;

            }
            request.getRequestDispatcher("Marcas.jsp").forward(request, response);
        }else if (menu.equals("Categorias")) {
            switch (accion) {
                case "ListarCategorias":
                    List listaCategorias = categoriasDAO.listar();
                    request.setAttribute("categorias", listaCategorias);
                    break;
                case "AgregarCategorias":
                    String nombreCategoria = request.getParameter("txtNombreCategoria");
                    String descripcionCategoria = request.getParameter("txtDescripcionCategoria");
                    categorias.setNombreCategoria(nombreCategoria);
                    categorias.setDescripcionCategoria(descripcionCategoria);
                    categoriasDAO.agregar(categorias);
                    request.getRequestDispatcher("Controlador?menu=Categorias&accion=ListarCategorias").forward(request, response);
                    break;
                case "Editar":
                    codCategoria = Integer.parseInt(request.getParameter("codigoCategoria"));
                    Categorias c = categoriasDAO.listarCodigoCategoria(codCategoria);
                    request.setAttribute("categoria", c);
                    request.getRequestDispatcher("Controlador?menu=Categorias&accion=ListarCategorias").forward(request, response);
                    break;
                case "Actualizar":
                    String nombreCat = request.getParameter("txtNombreCategoria");
                    String descripcionCat = request.getParameter("txtDescripcionCategoria");
                    categorias.setNombreCategoria(nombreCat);
                    categorias.setDescripcionCategoria(descripcionCat);
                    categorias.setCodigoCategoria(codCategoria);
                    categoriasDAO.actualizar(categorias);
                    request.getRequestDispatcher("Controlador?menu=Categorias&accion=ListarCategorias").forward(request, response);
                    break;
                case "Eliminar":
                    codCategoria = Integer.parseInt(request.getParameter("codigoCategoria"));
                    categoriasDAO.eliminar(codCategoria);
                    request.getRequestDispatcher("Controlador?menu=Categorias&accion=ListarCategorias").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("Categorias.jsp").forward(request, response);
        } else if (menu.equals("DetalleVenta")) {

            switch (accion) {
                
                case "ListarDetalle":
                    List listaDetalle = detalleDAO.listarCodigoVentaDV(codVenta);
                    double t = detalleDAO.getTotal();
                    request.setAttribute("ventass", listaDetalle);
                    request.setAttribute("total", t);
                    break;
                case "AgregarDetalle":
                    int cantidad = Integer.parseInt(request.getParameter("txtCantidad"));
                    double precio = Double.parseDouble(request.getParameter("txtPrecioProducto"));
                    int codigoProducto = Integer.parseInt(request.getParameter("txtDatosProducto"));
                    int codigoVenta = Integer.parseInt(request.getParameter("txtCodVenta"));
                    detalle.setCantidad(cantidad);
                    detalle.setPrecio(precio);
                    detalle.setCodigoProducto(codigoProducto);
                    detalle.setCodigoVenta(codigoVenta);
                    detalleDAO.agregar(detalle);
                    request.getRequestDispatcher("Controlador?menu=DetalleVenta&accion=ListarDetalle").forward(request, response);
                    break;

                case "Editar":
                    codDetalleVenta = Integer.parseInt(request.getParameter("codigoDetalleVenta"));
                    DetalleVenta de = detalleDAO.listarCodigoDetalleVenta(codDetalleVenta);
                    request.setAttribute("detalleVenta", de);
                    request.getRequestDispatcher("Controlador?menu=DetalleVenta&accion=ListarDetalle").forward(request, response);
                    break;

                case "Actualizar":
                    int cantidadDell = Integer.parseInt(request.getParameter("txtcantidad"));
                    double precioDell = Double.parseDouble(request.getParameter("txtPrecio"));
                    int codigoProductoDell = Integer.parseInt(request.getParameter("txtDatosProducto"));
                    int codigoVentaDell = Integer.parseInt(request.getParameter("txtCodVenta"));
                    detalle.setCantidad(cantidadDell);
                    detalle.setPrecio(precioDell);
                    detalle.setCodigoProducto(codigoProductoDell);
                    detalle.setCodigoVenta(codigoVentaDell);
                    detalle.setCodigoDetalleVenta(codDetalleVenta);
                    detalleDAO.actualizar(detalle);
                    request.getRequestDispatcher("Controlador?menu=DetalleVenta&accion=ListarDetalle").forward(request, response);
                    break;

                case "Eliminar":
                    codDetalleVenta = Integer.parseInt(request.getParameter("codigoDetalleVenta"));
                    detalleDAO.eliminar(codDetalleVenta);
                    request.getRequestDispatcher("Controlador?menu=DetalleVenta&accion=ListarDetalle").forward(request, response);
                    break;
                case "Verificacion":
                    String cC = request.getParameter("txtDPICliente");
                    if (cC.isEmpty()) {
                        cC = "0";
                    } else {
                        cC = request.getParameter("txtDPICliente");
                    }

                    cliente = clienteDAO.listarDPICliente(cC);
                    codCliente = cliente.getCodigoCliente();

                    if (codCliente != 0) {
                        request.setAttribute("clientess", cliente);
                    }

                    String cP = request.getParameter("txtDatosProducto");

                    if (cP.isEmpty()) {

                    } else {
                        codProducto = Integer.parseInt(request.getParameter("txtDatosProducto"));
                    }

                    producto = productoDAO.listarCodigoProducto(codProducto);

                    if (codProducto != 0) {
                        request.setAttribute("producto", producto);
                        if (codCliente != 0) {
                            request.setAttribute("clientess", cliente);
                        } 
                    }

                    String cV = request.getParameter("txtCodVenta");
                    if (cV.isEmpty()) {

                    } else {
                        codVenta = Integer.parseInt(request.getParameter("txtCodVenta"));
                    }

                    ventas = ventasDAO.listarCodigoVenta(codVenta);

                    if (ventas == null) {

                    } else {
                        detalle.setCodigoVenta(ventas.getCodigoVenta());
                        
                        if (codVenta != 0) {
                            request.setAttribute("detalleVenta", detalle);
                            if (producto.getCodigoProducto() != 0) {
                                request.setAttribute("producto", producto);
                            }
                            if (codCliente != 0) {
                                request.setAttribute("clientess", cliente);
                            }
                            request.setAttribute("mensaje", "Existe la Factura");
                        }
                    }
                    
                    request.getRequestDispatcher("Controlador?menu=DetalleVenta&accion=ListarDetalle").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("DetalleVenta.jsp").forward(request, response);

        } else if (menu.equals("Productos")) {
            switch (accion) {
                case "ListarProducto":
                    List listaProductos = productoDAO.listarProducto();
                    request.setAttribute("productos", listaProductos);
                    break;
                case "AgregarProducto":
                    String Nombre = request.getParameter("txtNombreProducto");
                    double Precio = Double.parseDouble(request.getParameter("txtPrecio"));
                    int Stock = Integer.parseInt(request.getParameter("txtStock"));
                    int Marca = Integer.parseInt(request.getParameter("txtCodigoMarca"));
                    int Categoria = Integer.parseInt(request.getParameter("txtCodigoCategoria"));
                    producto.setNombreProducto(Nombre);
                    producto.setPrecio(Precio);
                    producto.setStock(Stock);
                    producto.setCodigoMarca(Marca);
                    producto.setCodigoCategoria(Categoria);
                    productoDAO.agregar(producto);
                    request.getRequestDispatcher("Controlador?menu=Productos&accion=ListarProducto").forward(request, response);

                    break;
                case "EditarProducto":
                    codProducto =Integer.parseInt(request.getParameter("codigoProducto"));
                    Productos e = productoDAO.listarCodigoProducto(codProducto);
                    request.setAttribute("producto", e);
                    request.getRequestDispatcher("Controlador?menu=Productos&accion=ListarProducto").forward(request, response);
                    break;
                    
                case "ActualizarProducto":
                    String nomPro = request.getParameter("txtNombreProducto");
                    double precioPro = Double.parseDouble(request.getParameter("txtPrecio"));
                    int stockPro = Integer.parseInt(request.getParameter("txtStock"));
                    producto.setNombreProducto(nomPro);
                    producto.setPrecio(precioPro);
                    producto.setStock(stockPro);
                    producto.setCodigoProducto(codProducto);                  
                    productoDAO.actualizarProducto(producto);
                    request.getRequestDispatcher("Controlador?menu=Productos&accion=ListarProducto").forward(request, response);
                    break;
                    
                case "EliminarProducto":
                    codProducto = Integer.parseInt(request.getParameter("codigoProducto"));
                    productoDAO.eliminarProducto(codProducto);
                    request.getRequestDispatcher("Controlador?menu=Productos&accion=ListarProducto").forward(request, response);
                    break;

            }

            request.getRequestDispatcher("Productos.jsp").forward(request, response);

        } else if (menu.equals("Sucursal")) {
            switch (accion) {
                case "ListarSucursal":
                    List listaSucursal = sucursalDAO.listarSucursal();
                    request.setAttribute("sucursales", listaSucursal);
                    break;
                case "AgregarSucursal":
                    String DPI = request.getParameter("txtCodigoSucursal");
                    String nombres = request.getParameter("txtNombreSucursal");
                    String direccion = request.getParameter("txtDireccion");
                    sucursal.setNombreSucursal(nombres);
                    sucursal.setDireccion(direccion);
                    sucursalDAO.agregarSucursal(sucursal);
                    request.getRequestDispatcher("Controlador?menu=Sucursal&accion=ListarSucursal").forward(request, response);
                    break;
                case "Editar":

                    break;
                case "Actualizar":

                    break;
                case "Eliminar":

                    break;
            }
            request.getRequestDispatcher("Sucursal.jsp").forward(request, response);
            
        }else if(menu.equals("Membresia")){
            switch(accion){
                case "ListarMembresia":
                    List listaMembresia = membresiaDAO.listarMembresia();
                    request.setAttribute("membresias", listaMembresia);
                    break;
                case "AgregarMembresia":
                    String tipoMembresia = request.getParameter("txtTipoMembresia");
                    String descripcionMembresia = request.getParameter("txtDescripcionMembresia");
                    membresia.setTipoMembresia(tipoMembresia);
                    membresia.setDescripcionMembresia(descripcionMembresia);
                    membresiaDAO.agregarMembresia(membresia);
                    request.getRequestDispatcher("Controlador?menu=Membresia&accion=ListarMembresia").forward(request, response);
                    break;
                case "Editar":

                    break;
                case "Actualizar":

                    break;
                case "Eliminar":

                    break;
            }
            request.getRequestDispatcher("Membresia.jsp").forward(request, response);
        }else if(menu.equals("Home")){
            request.getRequestDispatcher("Home.jsp").forward(request, response);
        }

    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
