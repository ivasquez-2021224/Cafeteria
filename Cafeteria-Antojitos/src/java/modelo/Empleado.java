package modelo;

public class Empleado {
    private int codigoEmpleado;
    private String DPIEmpleado;
    private String nombresEmpleado;
    private String telefonoEmpleado;
    private String usuario;
    private int codigoCargo;
    private int codigoSucursal;

    public Empleado() {
    }

    public Empleado(int codigoEmpleado, String DPIEmpleado, String nombresEmpleado, String telefonoEmpleado, String usuario, int codigoCargo, int codigoSucursal) {
        this.codigoEmpleado = codigoEmpleado;
        this.DPIEmpleado = DPIEmpleado;
        this.nombresEmpleado = nombresEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.usuario = usuario;
        this.codigoCargo = codigoCargo;
        this.codigoSucursal = codigoSucursal;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getDPIEmpleado() {
        return DPIEmpleado;
    }

    public void setDPIEmpleado(String DPIEmpleado) {
        this.DPIEmpleado = DPIEmpleado;
    }

    public String getNombresEmpleado() {
        return nombresEmpleado;
    }

    public void setNombresEmpleado(String nombresEmpleado) {
        this.nombresEmpleado = nombresEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getCodigoCargo() {
        return codigoCargo;
    }

    public void setCodigoCargo(int codigoCargo) {
        this.codigoCargo = codigoCargo;
    }

    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(int codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }
    
    
}
