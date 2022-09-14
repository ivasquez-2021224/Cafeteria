package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class MembresiaDAO{
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    //OPERACIONES DEL CRUD
    
    //MÉTODO DE LISTAR
    public List listarMembresia (){
        String sql = "select * from Membresia";
        List<Membresia> listaMembresia = new ArrayList<>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Membresia mem = new Membresia();
                mem.setCodigoMembresia(rs.getInt(1));
                mem.setTipoMembresia(rs.getString(2));
                mem.setDescripcionMembresia(rs.getString(3));
                listaMembresia.add(mem);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaMembresia;
    }
    
    
    //MÉTODO PARA AGREGAR
    public int agregarMembresia (Membresia mem){
        String sql = "insert into Membresia (tipoMembresia, descripcionMembresia) values (?, ?)";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, mem.getTipoMembresia());
            ps.setString(2, mem.getDescripcionMembresia());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo agregar el registro");
        }
        return resp;
    }
    
    
    //BUSCAR POR CÓDIGO
    public Membresia listarCodigoMembresia (int id){
        Membresia mem = new Membresia();
        String sql = "select * from Membresia where codigoMembresia = "+id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                mem.setTipoMembresia(rs.getString(2));
                mem.setDescripcionMembresia(rs.getString(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return mem;
    }
    
    
    //MÉTODO PARA EDITAR
    public int actualizarMembresia (Membresia mem){
        String sql = "update Membresia set tipoMembresia = ?, descripcionMembresia = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, mem.getTipoMembresia());
            ps.setString(2, mem.getDescripcionMembresia());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return resp;
    }
    
    
    //MÉTODO PARA ELIMINAR
    public void eliminarMembresia (int id){
        String sql = "delete from Membresia where codigoMembresia = "+id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}