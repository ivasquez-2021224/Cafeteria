package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DetalleVentaDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    public List listarDetalleVenta(){
        String sql = "select * from DetalleVenta";
        List<DetalleVenta> listarDetalleVenta = new ArrayList<>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                DetalleVenta dv = new DetalleVenta();
                dv.setCodigoDetalleVenta(rs.getInt(1));
                dv.setCantidad(rs.getInt(2));
                dv.setPrecio(rs.getInt(3));
                dv.setCodigoProducto(rs.getInt(4));
                dv.setCodigoVenta(rs.getInt(5));
                listarDetalleVenta.add(dv);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
             return listarDetalleVenta;
    }
    
    // metodo para agregar
    public int agregar(DetalleVenta dv){
    String sql = "insert into DetalleVenta (cantidad, precio, codigoProducto, codigoVenta) values (?,?,?,?)";
    try{    
        con = cn.Conexion();
        ps = con.prepareStatement(sql);
        ps.setInt(1, dv.getCantidad());
        ps.setDouble(2, dv.getPrecio());
        ps.setInt(3, dv.getCodigoProducto());
        ps.setInt(4, dv.getCodigoVenta());
        ps.executeUpdate();
    }catch(Exception e){
        e.printStackTrace();
     System.out.println("No se pudo agregar el DetalleVenta"+e);
    }
       return resp; 
    }
    
    
     // buscar por codigo 
    public DetalleVenta listarCodigoDetalleVenta(int id){
        DetalleVenta dv = new DetalleVenta();
        String sql = "Select * from DetalleVenta where codigoDetalleVenta = "+id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                dv.setCantidad(rs.getInt(2));
                dv.setPrecio(rs.getDouble(3));
                dv.setCodigoProducto(rs.getInt(4));
                dv.setCodigoVenta(rs.getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return dv;
    }
    // metodo para editar
    public int actualizar(DetalleVenta dv){
        String sql = "Update DetalleVenta set cantidad =?, precio = ? where codigoDetalleVenta = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dv.getCantidad());
            ps.setDouble(2, dv.getPrecio());
            ps.setInt(3, dv.getCodigoDetalleVenta()); 
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return resp;
    }
    // metodo para eliminar
    public void eliminar(int id){
        String sql = "Delete from DetalleVenta where codigoDetalleVenta ="+id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
  
}
