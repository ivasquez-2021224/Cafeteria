
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
    
    public List listar(){
        String sql = "select * from Marcas";
        List<Marcas> listaMarcas = new ArrayList<Marcas>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Marcas ma = new Marcas();
                ma.setCodigoMarca(rs.getInt("1"));
                ma.setNombreMarca(rs.getString("2"));
                ma.setCodigoProveedor(rs.getString("3"));
                listaMarcas.add(ma);
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        
        return listaMarcas;
    }
    
    //MÉTODO PARA AGREGAR
    public int agregar(Marcas ma){
        String sql = "Insert into Marcas (nombreMarca,codigoProveedor ) values (?,?)";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, ma.getNombreMarca());
            ps.setString(2, ma.getCodigoProveedor());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo agregar el registro");
        }
        
        
        return resp;
    }
    
    
    
    //BUSCAR POR CODIGO
    public Marcas listarCodigoMarcas (int codMarca){
        Marcas ma = new Marcas();
        String sql = "Select * from marcas where codigoMarca = " +codMarca;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                ma.setNombreMarca(rs.getString(2));
                ma.setCodigoProveedor(rs.getString(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return ma;
    }
    
    
    
    //MÉTODO PARA EDITAR
    public int actualizar(Marcas ma){
        String sql = "Update marca set nombreMarca = ?, codigoProveedoor = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, ma.getNombreMarca());
            ps.setString(2, ma.getCodigoProveedor());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return resp;
    }
    
    
    
    //MÉTODO PARA ELIMINAR
    public void eliminar(int codMarca){
        String sql = "delete from Marcas where codigoMarca = "+codMarca;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
