package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductosDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int p;
    
    public List listarProducto(){
        String sql = "Select * from Productos";
        List<Productos> listaProducto = new ArrayList<>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Productos pro = new Productos();
                pro.setCodigoProducto(rs.getInt(1));
                pro.setNombreProducto(rs.getString(2));
                pro.setPrecio(rs.getDouble(3));
                pro.setStock(rs.getInt(4));
                pro.setCodigoMarca(rs.getInt(5));
                pro.setCodigoCategoria(rs.getInt(6));
                listaProducto.add(pro);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return listaProducto;
    }
    public int agregar(Productos pro){
        String sql = "Insert into productos (nombreProducto, precio, stock, codigoMarca, codigoCategoria) values (?,?,?,?,?)";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombreProducto());
            ps.setDouble(2, pro.getPrecio());
            ps.setInt(3, pro.getStock());
            ps.setInt(4, pro.getCodigoMarca());
            ps.setInt(5, pro.getCodigoCategoria());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.print("No se pudo agregar el registo ");
        }
        
        
        return p;
    }
    
    public Productos listarCodigoProducto(int id){
        Productos pro=new Productos();
        String sql = "Select * from Productos where codigoProducto = " +id;
        try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()){
               pro.setNombreProducto(rs.getString(2));
               pro.setPrecio(rs.getDouble(3));
               pro.setStock(rs.getInt(4));
               pro.setCodigoMarca(rs.getInt(5));
               pro.setCodigoCategoria(rs.getInt(6));
              
           }
           
        }catch(Exception e){
            e.printStackTrace();
        }
        return pro;
    }
    public int actualizarProducto(Productos pro){
        String sql = "update Productos set nombreProducto = ?, precio = ?, stock = ? where codigoProducto = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombreProducto());
            ps.setDouble(2, pro.getPrecio());
            ps.setInt(3, pro.getStock());
            ps.setInt(4, pro.getCodigoProducto());
            ps.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return p;
    }
   public void eliminarProducto(int id){
      String sql = "delete from Productos where codigoProducto = " + id;
      try{
          con = cn.Conexion();
          ps = con.prepareStatement(sql);
          ps.executeUpdate();
          
      }catch(Exception e){
          e.printStackTrace();
      }
      
   }
}
