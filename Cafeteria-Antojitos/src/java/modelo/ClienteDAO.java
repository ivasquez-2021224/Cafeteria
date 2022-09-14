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
                cliente.setNombreCliente(rs.getString(3));
                cliente.setApellidoCliente(rs.getString(4));
                cliente.setDireccionCliente(rs.getString(5));
                cliente.setTelefonoCliente(rs.getString(6));
                cliente.setCodigoMembresia(rs.getInt(7));
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
        String sql = "insert into Clientes(DPICliente, nombreCliente, apellidoCliente, direccionCliente, telefonoCliente, codigoMembresia) values (?,?,?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getDPICliente());
            ps.setString(2, cliente.getNombreCliente());
            ps.setString(3, cliente.getApellidoCliente());
            ps.setString(4, cliente.getDireccionCliente());
            ps.setString(5, cliente.getTelefonoCliente());
            ps.setInt(6, cliente.getCodigoMembresia());
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
        String sql = "Select * from Clientes where codigoCliente ="+codCliente;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                cliente.setDPICliente(rs.getString(2));
                cliente.setNombreCliente(rs.getString(3));
                cliente.setApellidoCliente(rs.getString(4));
                cliente.setDireccionCliente(rs.getString(5));
                cliente.setTelefonoCliente(rs.getString(6));
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error en el metodo buscar cliente: "+e);
        }
        
        return cliente;
    }
    
     public Cliente listarDPICliente(String DPICliente){
        Cliente  cliente = new Cliente();
        String sql = "Select * from Clientes where DPICliente ="+DPICliente;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                cliente.setCodigoCliente(rs.getInt(1));
                cliente.setDPICliente(rs.getString(2));
                cliente.setNombreCliente(rs.getString(3));
                cliente.setApellidoCliente(rs.getString(4));
                cliente.setDireccionCliente(rs.getString(5));
                cliente.setTelefonoCliente(rs.getString(6));
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error en el metodo buscar cliente: "+e);
        }
        
        return cliente;
    }
    
    //Metodo para actualizar clientes
    public int actualizarCliente(Cliente cliente){
        String sql = "Update Clientes  set DPICliente=?, nombreCliente=?, apellidoCliente=?, direccionCliente=?, telefonoCliente=? where codigoCliente=?";
        try{
            con=cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getDPICliente());
            ps.setString(2, cliente.getNombreCliente());
            ps.setString(3, cliente.getApellidoCliente());
            ps.setString(4, cliente.getDireccionCliente());
            ps.setString(5, cliente.getTelefonoCliente());
            ps.setInt(6, cliente.getCodigoCliente());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error en el metodo actualizar cliente (Cliente DAO): "+e);
        }
        
        return resp;
    }
    
    //Metodo para eliminar
    public void eliminarCliente(int codCliente){
        String sql = "Delete from Clientes where codigoCliente ="+codCliente;
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
