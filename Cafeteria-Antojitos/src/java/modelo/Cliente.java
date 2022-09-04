package modelo;

public class Cliente {
    private int codigoCliente;
    private String DPICliente;
    private String nombresCliente;
    private String direccionCliente;
    private String telefonoCliente;

    public Cliente() {
    }

    public Cliente(int codigoCliente, String DPICliente, String nombresCliente, String direccionCliente, String telefonoCliente) {
        this.codigoCliente = codigoCliente;
        this.DPICliente = DPICliente;
        this.nombresCliente = nombresCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getDPICliente() {
        return DPICliente;
    }

    public void setDPICliente(String DPICliente) {
        this.DPICliente = DPICliente;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    
    
}
