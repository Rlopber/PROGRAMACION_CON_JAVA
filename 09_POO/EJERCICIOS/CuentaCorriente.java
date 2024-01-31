/**
*
* Implementa la clase CuentaCorriente. Cada cuenta corriente tiene un número de cuenta de 10 dígitos. 
* Para simplificar, el número de cuenta se genera de forma aleatoria cuando se crea una cuenta nueva. 
* La cuenta se puede crear con un saldo inicial; en caso de no especificar saldo, se pondrá a cero inicialmente.
* En una cuenta se pueden hacer ingresos y gastos. También es posible hacer una transferencia entre una cuenta y otra. 
* Se permite el saldo negativo. 
* En el siguiente capítulo se propone un ejercicio como mejora de éste, 
* en el que se pide llevar un registro de los movimientos realizados.
*
* @author: Raquel Lopez
*/

public class CuentaCorriente {
    
    ////Atributos
    private String numero = "";
    private double saldo;

    ////Constructores
    public CuentaCorriente() {
        generarAleatorio();
        saldo = 0;
    }

    public CuentaCorriente(double saldoInicial) { 
        generarAleatorio();
        this.saldo = saldoInicial;
    }

    private void generarAleatorio() { //No me devuelvas nada, pero dentro haces cosas --> void
        for (int i = 0; i < 10; i++) {
            numero += (int)(Math.random()*10);
        }
    }

    public void ingreso (double cantidad) {
        this.saldo += cantidad;
    }

    public void cargo (double cantidad) {
        this.saldo -= cantidad;
    }

    public void transferencia (CuentaCorriente destino, double cantidad) {
        destino.saldo += cantidad;
        this.saldo -= cantidad;
    }

    ////Getter
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return String.format("Número cta: %s\t Saldo: %.2f €", numero, saldo);
    }
}
