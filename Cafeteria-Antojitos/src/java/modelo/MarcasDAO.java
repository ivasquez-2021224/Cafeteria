
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class MarcasDAO {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    
    //METODO DE LISTAR CLIENTES 
    
    public List listarMarcas(){
        String sql = "select * from Marcas";
        List<Marcas> listaMarca = new ArrayList<Marcas>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Marcas ma = new Marcas();
                ma.setCodigoMarca(rs.getInt(1));
                ma.setNombreMarca(rs.getString(2));
                ma.setCodigoProveedor(rs.getInt(3));
                listaMarca.add(ma);  
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        
        return listaMarca;
    }
    
    //MÉTODO PARA AGREGAR
    public int agregarMarcas(Marcas ma){
        String sql = "Insert into Marcas (nombreMarca,codigoProveedor) values (?,?)";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, ma.getNombreMarca());
            ps.setInt(2, ma.getCodigoProveedor());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo agregar el registro"+e);
        }
        
        
        return resp;
    }
    
    
    
    //BUSCAR POR CODIGO
    public Marcas listarCodigoMarcas (int codMar){
        Marcas mar = new Marcas();
        String sql = "Select * from Marcas where codigoMarca = " +codMar;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                mar.setNombreMarca(rs.getString(2));
//                mar.setCodigoProveedor(rs.getInt(3));
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error en Listar CodigoMarcas");
        }
            
        return mar;
    }
    
    
    
    //MÉTODO PARA EDITAR
    public int actualizarMarcas(Marcas mar){
        String sql = "Update marcas set nombreMarca = ?  where codigoMarca = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, mar.getNombreMarca());
//            ps.setInt(2, mar.getCodigoProveedor());
            ps.setInt(2, mar.getCodigoMarca());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error metodo  actualizarMarcas"+e);
        }
        
        return resp;
    }
    
    
    
    //MÉTODO PARA ELIMINAR
    public void eliminarMarcas(int codMarca){
        String sql = "delete from marcas where codigoMarca = "+codMarca;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error en eliminarMarcas"+e);
        }
    }
}