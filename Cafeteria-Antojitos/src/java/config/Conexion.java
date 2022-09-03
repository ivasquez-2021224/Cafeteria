
package config;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    Connection conexion;
    
    public Connection Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBCafeteriaAntojitos?useSSL=false", "root","");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Ha Ocurrido un erro al conectar con la base de datos ");
        }
        
        
        return conexion;
    }
}
