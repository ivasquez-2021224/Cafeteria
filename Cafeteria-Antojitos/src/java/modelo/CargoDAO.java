package modelo;
    
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CargoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    //OPERACIONES DEL CRUD
    
    //MÉTODO DE LISTAR
    
    public List listar(){
        String sql = "select * from Cargo";
        List<Cargo> listaCargo = new ArrayList<Cargo>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Cargo ca = new Cargo();
                ca.setCodigoCargo(rs.getInt(1));
                ca.setTipoCargo(rs.getString(2));
                listaCargo.add(ca);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        
        return listaCargo;
    }
    
    //MÉTODO PARA AGREGAR
    public int agregar(Cargo ca){
        String sql = "Insert into cargo (tipoCargo) values (?)";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, ca.getTipoCargo());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo agregar el registro");
        }
        
        
        return resp;
    }
    
    
    
    //BUSCAR POR CODIGO
    public Cargo listarCodigoCargo (int id){
        Cargo ca = new Cargo();
        String sql = "Select * from cargo where codigoCargo = " +id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                ca.setTipoCargo(rs.getString(2));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return ca;
    }
    
    
    
    //MÉTODO PARA EDITAR
    public int actualizar(Cargo ca){
        String sql = "Update cargo set tipoCargo = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, ca.getTipoCargo());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return resp;
    }
    
    
    
    //MÉTODO PARA ELIMINAR
    public void eliminar(int id){
        String sql = "delete from cargo where codigoCargo = "+id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
