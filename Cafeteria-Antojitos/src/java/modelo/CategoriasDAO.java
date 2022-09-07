package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoriasDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    public List listar(){
        String sql = "select * from Categorias";
        List<Categorias> listaCategorias = new ArrayList<Categorias>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Categorias c = new Categorias();
                c.setCodigoCategoria(rs.getInt(1));
                c.setNombreCategoria(rs.getString(2));
                c.setDescripcionCategoria(rs.getString(3));
                listaCategorias.add(c);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaCategorias;
    }
    
    public int agregar(Categorias c){
        String sql = "Insert into Categorias (nombreCategoria, descripcionCategoria) values (?,?)";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getNombreCategoria());
            ps.setString(2, c.getDescripcionCategoria());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo agregar el registro");
        }
        return resp;
    }
    
    public Categorias listarCodigoMarca(int id){
        Categorias c = new Categorias();
        String sql = "Select * from Categorias where codigoCategorias = "+id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                c.setNombreCategoria(rs.getString(2));
                c.setDescripcionCategoria(rs.getString(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return c;
    }
    
    public int actualizar(Categorias c){
        String sql = "Update Categorias set nombreCategoria = ?, descripcionCategoria = ? where codigoCategoria = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getNombreCategoria());
            ps.setString(2, c.getDescripcionCategoria());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return resp;
    }
    
    public void eliminar (int id){
        String sql = "delete from Categoria where codigoCategoria = " + id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}