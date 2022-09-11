package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    public Empleado validar(String usuario, String DPIEmpleado){
        Empleado empleado = new  Empleado();
        String sql = "select * from Empleados where usuario = ? and DPIEmpleado = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, DPIEmpleado);
            rs = ps.executeQuery();
            while(rs.next()){
                empleado.setCodigoEmpleado(rs.getInt("codigoEmpleado"));
                empleado.setDPIEmpleado(rs.getString("DPIEmpleado"));
                empleado.setNombreEmpleado(rs.getString("nombreEmpleado"));
                empleado.setApellidoEmpleado(rs.getString("apellidoEmpleado"));
                empleado.setTelefonoEmpleado(rs.getString("telefonoEmpleado"));
                empleado.setUsuario(rs.getString("usuario"));
                empleado.setCodigoCargo(rs.getInt("codigoCargo"));
                empleado.setCodigoSucursal(rs.getInt("codigoSucursal"));
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se puedo validar el usuario"+e.getMessage());
        }
        return empleado;
    }
    
    public List listar(){
        String sql = "select * from Empleados";
        List<Empleado> listaEmpleado =  new ArrayList<>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Empleado em = new Empleado();
                em.setCodigoEmpleado(rs.getInt(1));
                em.setDPIEmpleado(rs.getString(2));
                em.setNombreEmpleado(rs.getString(3));
                em.setApellidoEmpleado(rs.getString(4));
                em.setTelefonoEmpleado(rs.getString(5));
                em.setUsuario(rs.getString(6));
                em.setCodigoCargo(rs.getInt(7));
                em.setCodigoSucursal(rs.getInt(8));
                listaEmpleado.add(em);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo listar Empleados " + e.getMessage());
        }
        
        return listaEmpleado;
    }
    
    public int agregar(Empleado emp){
        String  sql = "insert into Empleados (DPIEmpleado, nombreEmpleado, apellidoEmpleado, telefonoEmpleado, usuario, codigoCargo, codigoSucursal) values (?, ?, ?, ?, ?, ?, ?)";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, emp.getDPIEmpleado());
            ps.setString(2, emp.getNombreEmpleado());
            ps.setString(3, emp.getApellidoEmpleado());
            ps.setString(4, emp.getTelefonoEmpleado());
            ps.setString(5, emp.getUsuario());
            ps.setInt(6, emp.getCodigoCargo());
            ps.setInt(7, emp.getCodigoSucursal());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo agregar el empleado "+e.getMessage());
        }
        return resp;
    }
    
    public Empleado listarCodigoEmpleado(int id){
        Empleado emp = new  Empleado();
        String sql = "select * from Empleados where codigoEmpleado = "+id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                emp.setDPIEmpleado(rs.getString(2));
                emp.setNombreEmpleado(rs.getString(3));
                emp.setApellidoEmpleado(rs.getString(4));
                emp.setTelefonoEmpleado(rs.getString(5));
                emp.setUsuario(rs.getString(6));
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo buscar el empleado por su id " +e.getMessage() );
        }
        return emp;
    }
    
    public int actualizar(Empleado emp){
        String sql = "Update empleados set DPIEmpleado = ?, nombreEmpleado = ?, apellidoEmpleado = ?, telefonoEmpleado = ?, usuario = ? where codigoEmpleado = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, emp.getDPIEmpleado());
            ps.setString(2, emp.getNombreEmpleado());
            ps.setString(3, emp.getApellidoEmpleado());
            ps.setString(4, emp.getTelefonoEmpleado());
            ps.setString(5, emp.getUsuario());
            ps.setInt(6, emp.getCodigoEmpleado());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo actualizar empleados "+e.getMessage());
        }        
        return resp;
    }
    
    public void eliminar(int id){
        String sql = "delete from empleados where codigoEmpleado ="+id;
        try{
            con = cn.Conexion();
            ps =  con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("No se pudo eliminar el empleado "+e.getMessage());
        }
    }
}
