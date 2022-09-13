package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDAO {
    Conexion cn = new Conexion ();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int ph;
    
    public List listarProveedores(){
        String sql = "select * from proveedores";
        List<Proveedor> listaProveedor = new ArrayList<>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Proveedor pv = new Proveedor();
                pv.setCodigoProveedor(rs.getInt(1));
                pv.setNombreProveedor(rs.getString(2));
                pv.setDireccion(rs.getString(3));
                pv.setTelefono(rs.getString(4));
                listaProveedor.add(pv);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return listaProveedor;
    }
    
    public int agregarProveedor(Proveedor pv){
        String sql = "Insert into Proveedores(nombreProveedor, direccion, telefono) values (?, ?, ?)";
            try{
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                ps.setString(1, pv.getNombreProveedor());
                ps.setString(2, pv.getDireccion());
                ps.setString(3, pv.getTelefono());
                ps.executeUpdate();
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("No se pudo agregar el proveedor" +e);
            }
        return ph;
    }
    
    public Proveedor listarCodigoProveedor(int id){
        Proveedor hp = new Proveedor();
        String sql = "Select * from proveedores where codigoProveedor = " +id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                hp.setNombreProveedor(rs.getString(2));
                hp.setDireccion(rs.getString(3));
                hp.setTelefono(rs.getString(4));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return hp;
    }
    
    public int actualizar(Proveedor hp){
        String sql = "Update proveedores set nombreProveedor = ?, direccion = ?, telefono = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, hp.getNombreProveedor());
            ps.setString(2, hp.getDireccion());
            ps.setString(3, hp.getTelefono());
            ps.setInt(4, hp.getCodigoProveedor());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return ph;
    }
    
    public void eliminar(int id){
        String sql = "Delete from proveedores where codigoProveedor =" +id;
        try{
        con = cn.Conexion();
        ps = con.prepareStatement(sql);
        ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
