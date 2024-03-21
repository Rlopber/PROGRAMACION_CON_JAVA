package Ejercicio5;

public class Articulo {

    ///Atributos
    private String codigo;
    private String descripcion;
    private double precioDeCompra;
    private double precioDeVenta;
    private int stock;

    ///Getters
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioDeCompra() {
        return precioDeCompra;
    }

    public double getPrecioDeVenta() {
        return precioDeVenta;
    }

    public int getStock() {
        return stock;
    }   

    ///Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioDeCompra(double precioDeCompra) {
        this.precioDeCompra = precioDeCompra;
    }

    public void setPrecioDeVenta(double precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    ///Override
    @Override
    public String toString() {
        return "-------" +
                "\nCódigo: " + this.codigo +
                "\nDescripción: " + this.descripcion +
                "\nPrecio de compra: " + this.precioDeCompra +
                "\nPrecio de venta: " + this.precioDeVenta +
                "\nStock: " + this.stock;
    }
}
