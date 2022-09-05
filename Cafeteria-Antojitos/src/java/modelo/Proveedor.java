package modelo;

public class Proveedor {
    private int codigoProveedor;
    private String nombresProveedor;
    private String direccion;
    private String telefono;

    public Proveedor() {
    }

    public Proveedor(int codigoProveedor, String nombresProveedor, String direccion, String telefono) {
        this.codigoProveedor = codigoProveedor;
        this.nombresProveedor = nombresProveedor;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombresProveedor() {
        return nombresProveedor;
    }

    public void setNombresProveedor(String nombresProveedor) {
        this.nombresProveedor = nombresProveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
