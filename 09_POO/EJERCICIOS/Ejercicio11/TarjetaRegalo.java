package Ejercicio11;

public class TarjetaRegalo {

    ////Atributos
    private double saldo;
    private int numeroTarjeta;

    ////Constructores
    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.numeroTarjeta = (int)(Math.random() * 90000 + 10000);
    }

    public TarjetaRegalo() {
        this.saldo = 0;
        this.numeroTarjeta = (int)(Math.random() * 90000 + 10000);
    }

    ////Getters
    public double getSaldo() {
        return saldo;
    }

    ////Métodos

    /* Restar lo que va gastando de la tarjeta */
    public double gasta(double gastando) {
        if (gastando > saldo) {
            System.out.printf("No tiene suficiente saldo para gastar %.2f€\n", gastando);
        } else {
            saldo -= gastando;
        }
        return saldo;
    }

    /* Fusionar dos tarjetas */
    public TarjetaRegalo fusionaCon(TarjetaRegalo tarjeta) {
        double nuevoSaldo = this.saldo + tarjeta.getSaldo();
        this.saldo = 0;
        tarjeta.saldo = 0;
        return new TarjetaRegalo(nuevoSaldo);
    }

    ////Override
    @Override
    public String toString() {
        return String.format("Tarjeta nº %d - Saldo %.2f €", numeroTarjeta, saldo);
    }
}
