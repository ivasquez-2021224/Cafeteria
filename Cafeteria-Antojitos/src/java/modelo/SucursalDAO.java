/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Home
 */
public class SucursalDAO {
    Conexion cn = new Conexion ();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int scu;
    
    public List listarSucursal(){
        String sql = "select * from Sucursal";
        List<Sucursal> listaSucursal = new ArrayList<>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Sucursal sc = new Sucursal();
                sc.setCodigoSucursal(rs.getInt(1));
                sc.setNombreSucursal(rs.getString(2));
                sc.setDireccion(rs.getString(3));
                listaSucursal.add(sc);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return listaSucursal;
    }
    
    public int agregarSucursal(Sucursal sc){
        String sql = "Insert into Sucursal (nombreSucursal, direccion) values (?,?);";
            try{
                con = cn.Conexion();
                ps = con.prepareStatement(sql);
                ps.setString(1, sc.getNombreSucursal());
                ps.setString(2, sc.getDireccion());
                ps.executeUpdate();
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("No se pudo agregar el Sucursal" +e);
            }
        return scu;
    }
    
//    public Proveedor listarCodigoSucursal(int id){
//        Proveedor hp = new Proveedor();
//        String sql = "Select * from Sucursal where codigoSucursal = " +id;
//        try{
//            con = cn.Conexion();
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()){
//                hp.setNombreProveedor(rs.getString(2));
//                hp.setDireccion(rs.getString(3));
//                hp.setTelefono(rs.getString(4));
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        return hp;
//    }
    
//    public int actualizar(Sucursal hp){
//        String sql = "Update Sucursal set  direccion = ?, telefono = ?";
//        try{
//            con = cn.Conexion();
//            ps = con.prepareStatement(sql);
//            ps.setString(1, hp.getDireccion());
//            ps.setString(2, hp.getTelefono());
//            ps.setInt(3, hp.getCodigoSucursal());
//            ps.executeUpdate();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        return scu;
//    }
//    
//    public void eliminar(int id){
//        String sql = "Delete from Sucursal where codigoSucursal =" +id;
//        try{
//        con = cn.Conexion();
//        ps = con.prepareStatement(sql);
//        ps.executeUpdate();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        
//    }
}
