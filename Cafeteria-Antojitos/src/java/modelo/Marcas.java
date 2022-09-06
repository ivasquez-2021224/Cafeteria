
package modelo;


public class Marcas {
    private int codigoMarca;
    private String nombreMarca;
    private String codigoProveedor;

    public Marcas() {
    }

    public Marcas(int codigoMarca, String nombreMarca, String codigoProveedor) {
        this.codigoMarca = codigoMarca;
        this.nombreMarca = nombreMarca;
        this.codigoProveedor = codigoProveedor;
    }

    public int getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(int codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }
    
    
}
