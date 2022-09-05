package modelo;


public class Ventas {
    private int codigoVenta;
    private String fecha;
    private double monto;
    private String numeroSerie;
    private int codigoCliente;
    private int codigoEmpleado;

    public Ventas() {
    }

    public Ventas(int codigoVenta, String fecha, double monto, String numeroSerie, int codigoCliente, int codigoEmpleado) {
        this.codigoVenta = codigoVenta;
        this.fecha = fecha;
        this.monto = monto;
        this.numeroSerie = numeroSerie;
        this.codigoCliente = codigoCliente;
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
    
    
}