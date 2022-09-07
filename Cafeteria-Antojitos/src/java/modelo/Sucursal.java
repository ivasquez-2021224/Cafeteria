
package modelo;


public class Sucursal {
    
    private int codigoSucursal;
    private String nombreSucursal;
    private String direccion;

    public Sucursal() {
    }

    public Sucursal(int codigoSucursal, String nombreSucursal, String direccion) {
        this.codigoSucursal = codigoSucursal;
        this.nombreSucursal = nombreSucursal;
        this.direccion = direccion;
    }

    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(int codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
