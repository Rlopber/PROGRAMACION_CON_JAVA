package Cuenta;

public class Cuenta {
    
    ////Atributos
    private String titular;
    private double cantidad;

    ////Constructores
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    ////Getters
    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    ////Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    ////Métodos
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        this.cantidad -= cantidad;

        if (this.cantidad < 0) {
            this.cantidad = 0;
        }
    }

    ////Override
    @Override
    public String toString() {
        return "Titular de la cuenta: " + titular + "\nCantidad en la cuenta: " + cantidad + " euros.";
    }
}
