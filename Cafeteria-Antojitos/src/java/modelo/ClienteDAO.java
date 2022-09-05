package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;

    //METODO DE LISTAR CLIENTES 
    public List listarClientes() {
        String sql = "select * from Clientes";
        List<Cliente> listaCliente = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCodigoCliente(rs.getInt(1));
                cliente.setDPICliente(rs.getString(2));
                cliente.setNombresCliente(rs.getString(3));
                cliente.setDireccionCliente(rs.getString(4));
                cliente.setTelefonoCliente(rs.getString(5));
                listaCliente.add(cliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en el metodo listar clientes(ClienteDAO )" + e);
        }

        return listaCliente;
    }

    //METODO PARA AGREGAR CLIENTES
    public int agregarCliente(Cliente cliente) {
        String sql = "insert into Clientes(DPICliente, nombresCliente, direccionCliente, telefonoCliente) values (?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getDPICliente());
            ps.setString(2, cliente.getNombresCliente());
            ps.setString(3, cliente.getDireccionCliente());
            ps.setString(4, cliente.getTelefonoCliente());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en el metodo agregar cliente(Cliente DAO): " + e);
        }
        return resp;
    }
    
    //BUSCAR CLIENTE
    public Cliente listarCodigoCliente(int codCliente){
        Cliente  cliente = new Cliente();
        String sql = "Select * from Cliente where codigoCliente ="+codCliente;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                cliente.setDPICliente(rs.getString(2));
                cliente.setNombresCliente(rs.getString(3));
                cliente.setDireccionCliente(rs.getString(4));
                cliente.setTelefonoCliente(rs.getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error en el metodo buscar cliente: "+e);
        }
        
        return cliente;
    }
    
    //Metodo para actualizar clientes
    public int actualizarCliente(Cliente cliente){
        String sql = "Update Cliente  set DPICliente=?, nombresCliente=?, direccionCliente=?, telefonoCliente=? where codigoCliente=?";
        try{
            con=cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getDPICliente());
            ps.setString(2, cliente.getNombresCliente());
            ps.setString(3, cliente.getDireccionCliente());
            ps.setString(4, cliente.getTelefonoCliente());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error en el metodo editar cliente (Cliente DAO): "+e);
        }
        
        return resp;
    }
    
    //Metodo para eliminar
    public void eliminarCliente(int codCliente){
        String sql = "Delete from Cliente where codigoCliente ="+codCliente;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error en el metodo eliminar cliente(ClienteDAO) :"+e);
        }
    }
}
