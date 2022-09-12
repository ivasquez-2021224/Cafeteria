package modelo;


public class DetalleVenta {
   private  int codigoDetalleVenta;
   private int cantidad;
   private double precio;
   private int codigoProducto;
   private int codigoVenta;

    public DetalleVenta() {
    }

    public DetalleVenta(int codigoDetalleVenta, int cantidad, double precio, int codigoProducto, int codigoVenta) {
        this.codigoDetalleVenta = codigoDetalleVenta;
        this.cantidad = cantidad;
        this.precio = precio;
        this.codigoProducto = codigoProducto;
        this.codigoVenta = codigoVenta;
    }

    public int getCodigoDetalleVenta() {
        return codigoDetalleVenta;
    }

    public void setCodigoDetalleVenta(int codigoDetalleVenta) {
        this.codigoDetalleVenta = codigoDetalleVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }
    
                            
}
