package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class VentasDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    //OPERACIONES DEL CRUD
    
    //MÉTODO DE LISTAR
    public List listarVentas (){
        String sql = "select * from Ventas";
        List<Ventas> listaVenta = new ArrayList<>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Ventas ven = new Ventas();
                ven.setCodigoVenta(rs.getInt(1));
                ven.setFecha(rs.getString(2));
                ven.setMonto(rs.getDouble(3));
                ven.setNumeroSerie(rs.getString(4));
                ven.setCodigoCliente(rs.getInt(5));
                ven.setCodigoEmpleado(rs.getInt(6));
                listaVenta.add(ven);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error en VentasDAO en el metodo listarVentas  "+e);
        }
        return listaVenta;
    }
    
    
    //MÉTODO PARA AGREGAR
    public int agregarVenta (Ventas ven){
        String sql = "insert into Ventas (fecha, monto, numeroSerie, codigoCliente, codigoEmpleado) values (?, ?, ?, ?, ?)";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, ven.getFecha());
            ps.setDouble(2, ven.getMonto());
            ps.setString(3, ven.getNumeroSerie());
            ps.setInt(4, ven.getCodigoCliente());
            ps.setInt(5, ven.getCodigoEmpleado());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo agregar el registro");
        }
        return resp;
    }
    
    
    //BUSCAR POR CÓDIGO
    public Ventas listarCodigoVenta (int codVenta){
        Ventas ven = new Ventas();
        String sql = "select * from Ventas where codigoVenta = "+codVenta;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ven.setFecha(rs.getString(2));
                ven.setMonto(rs.getDouble(3));
                ven.setNumeroSerie(rs.getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error en VentasDAO en el metodo listarCodigoVenta  "+e);
        }
        return ven;
    }
    
    
    //MÉTODO PARA EDITAR
    public int actualizarVenta (Ventas ven){
        String sql = "update Ventas set fecha = ?, monto = ?, numeroSerie = ? where codigoVenta = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, ven.getFecha());
            ps.setDouble(2, ven.getMonto());
            ps.setString(3, ven.getNumeroSerie());
            ps.setInt(4, ven.getCodigoVenta());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error en VentasDAO en el metodo actualizarVenta  "+e);
        }
        return resp;
    }
    
    
    //MÉTODO PARA ELIMINAR
    public void eliminarVentas (int id){
        String sql = "delete from Ventas where codigoVenta = "+id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error en VentasDAO en el metodo eliminarVentas  "+e);
        }
    }
}
