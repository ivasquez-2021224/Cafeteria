package modelo;

public class Membresia {
    private int codigoMembresia;
    private String tipoMembresia;
    private String descripcionMembresia;

    public Membresia() {
    }

    public Membresia(int codigoMembresia, String tipoMembresia, String descripcionMembresia) {
        this.codigoMembresia = codigoMembresia;
        this.tipoMembresia = tipoMembresia;
        this.descripcionMembresia = descripcionMembresia;
    }

    public int getCodigoMembresia() {
        return codigoMembresia;
    }

    public void setCodigoMembresia(int codigoMembresia) {
        this.codigoMembresia = codigoMembresia;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public String getDescripcionMembresia() {
        return descripcionMembresia;
    }

    public void setDescripcionMembresia(String descripcionMembresia) {
        this.descripcionMembresia = descripcionMembresia;
    }
    
    
}