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
import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.Empleado;
import modelo.EmpleadoDAO;
import modelo.Productos;
import modelo.ProductosDAO;
import modelo.Proveedor;
import modelo.ProveedorDAO;
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
    Productos producto = new Productos();
    ProductosDAO productoDAO = new ProductosDAO();    
    
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
        if (menu.equals("Cargo")){
            
            switch(accion){
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
                        
                        break;    
                        
                case "Actualizar":
                        
                        break;
                        
                case "Eliminar":
                        
                        break;
            }
            request.getRequestDispatcher("Cargo.jsp").forward(request, response);
        }else if(menu.equals("Clientes")){
            switch(accion){
                case "ListarCliente":
                    List listaClientes = clienteDAO.listarClientes();
                    request.setAttribute("clientes", listaClientes);
                    break;
                case "AgregarCliente":
                    String DPI = request.getParameter("txtDPICliente");
                    String nombres = request.getParameter("txtNombresCliente");
                    String direccion = request.getParameter("txtDireccionCliente");
                    String telefono = request.getParameter("txtTelefonoCliente");
                    cliente.setDPICliente(DPI);
                    cliente.setNombresCliente(nombres);
                    cliente.setDireccionCliente(direccion);
                    cliente.setTelefonoCliente(telefono);
                    clienteDAO.agregarCliente(cliente);
                    request.getRequestDispatcher("Controlador?menu=Clientes&accion=ListarCliente").forward(request, response);
                    break;
                case "Editar":
                    
                    break;
                case "Actualizar":
                    
                    break;
                case "Eliminar":
                    
                    break;
            }
            request.getRequestDispatcher("Clientes.jsp").forward(request, response);
        }else if(menu.equals("Proveedores")){
            switch(accion){
                case "ListarProveedores":
                    List listaProveedor = proveedorDAO.listarProveedores();
                    request.setAttribute("proveedores", listaProveedor);
                    break;
                case "AgregarProveedor":
                    String Nombre = request.getParameter("txtNombresProveedor");
                    String Direccion = request.getParameter("txtDireccionProveedor");
                    String Telefono = request.getParameter("txtTelefonoProveedor");
                    proveedor.setNombresProveedor(Nombre);
                    proveedor.setDireccion(Direccion);
                    proveedor.setTelefono(Telefono);
                    proveedorDAO.agregarProveedor(proveedor);
                    request.getRequestDispatcher("Controlador?menu=Proveedores&accion=ListarProveedores").forward(request, response);
                    break;
            }
            
            
            request.getRequestDispatcher("Proveedores.jsp").forward(request, response);
        }else if(menu.equals("Ventas")){
            switch(accion){
                case "ListarVentas":
                    List listaVentas = ventasDAO.listarVentas();
                    request.setAttribute("ventas", listaVentas);
                    break;
                case "AgregarVentas":
                    String fecha = request.getParameter("txtFecha");
                    Double monto = (Double.parseDouble(request.getParameter("txtMonto")));
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
                    
                    break;
                case "Actualizar":
                    
                    break;
                case "Eliminar":
                    
                    break;
            }
            request.getRequestDispatcher("Ventas.jsp").forward(request, response);
        }else if(menu.equals("Empleados")){
            switch(accion){
                case "ListarEmpleados":
                    List listaEmpleados = empleadoDAO.listar();
                    request.setAttribute("empleados", listaEmpleados);
                    break;
                case "AgregarEmpleado":
                    String  DPI = request.getParameter("txtDPIEmpleado");
                    String nombres = request.getParameter("txtNombresEmpleado");
                    String telefono = request.getParameter("txtTelefonoEmpleado");
                    String user = request.getParameter("txtUsuario");
                    int codCar = Integer.parseInt(request.getParameter("txtCodigoCargo"));
                    int codSuc = Integer.parseInt(request.getParameter("txtCodigoSucursal"));
                    empleado.setDPIEmpleado(DPI);
                    empleado.setNombresEmpleado(nombres);
                    empleado.setTelefonoEmpleado(telefono);
                    empleado.setUsuario(user);
                    empleado.setCodigoCargo(codCar);
                    empleado.setCodigoSucursal(codSuc);
                    empleadoDAO.agregar(empleado);
                    request.getRequestDispatcher("Controlador?menu=Empleados&accion=ListarEmpleados").forward(request, response);
                    break;
                case "Editar":
                    break;
                case "Actualizar":
                    break;
                case "Eliminar":
                    break;
            }
            request.getRequestDispatcher("Empleados.jsp").forward(request, response);
        }else if(menu.equals("Principal")){
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }else if(menu.equals("Productos")){
            switch(accion){
                case "ListarProducto":
                    List listaProductos = productoDAO.listarProducto();
                    request.setAttribute("Productos", listaProductos);
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
                   
            }
        
            request.getRequestDispatcher("Productos.jsp").forward(request, response);
            
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
