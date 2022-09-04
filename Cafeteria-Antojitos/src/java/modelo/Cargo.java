package modelo;

public class Cargo {
    int codigoCargo;
    String tipoCargo;

    public Cargo() {
    }

    public Cargo(int codigoCargo, String tipoCargo) {
        this.codigoCargo = codigoCargo;
        this.tipoCargo = tipoCargo;
    }

    public int getCodigoCargo() {
        return codigoCargo;
    }

    public void setCodigoCargo(int codigoCargo) {
        this.codigoCargo = codigoCargo;
    }

    public String getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(String tipoCargo) {
        this.tipoCargo = tipoCargo;
    }
    
    
}
