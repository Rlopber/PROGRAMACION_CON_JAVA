package Ejercicio13;
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
    private static String[] numerosCuentaGenerados = new String[10000]; //privada porque solo se usa en esta clase y estatica porque sólo tiene que realizarse una vez.
    private static int cuentasGeneradas = 0;

    ////Atributos
    private String numero = "";
    private double saldo;

    ////Constructores
    public CuentaCorriente() {
        do {
            generarAleatorio();
        } while (existeNumeroGenerado());
        agregarNumeroGenerado();
        saldo = 0;
    }

    public CuentaCorriente(double saldoInicial) { 
        do {
            generarAleatorio();
        } while (existeNumeroGenerado());
        agregarNumeroGenerado();
        this.saldo = saldoInicial;
    }

    private void generarAleatorio() { //No me devuelvas nada, pero dentro haces cosas --> void
        for (int i = 0; i < 10; i++) {
            numero += (int)(Math.random()*10);
        }
    }

    private boolean existeNumeroGenerado() {
        for (int i = 0; i < cuentasGeneradas; i++) {
            if (numerosCuentaGenerados[i].equals(numero)) { //Comparamos el array de cuentas con el numero generado aleatoriamente.
                return true;                                // Si existe, el booleano es verdadero y se repetiria el proceso.
            }
        }
        return false;                                       //Si no existe, el booleano es falso y se pararia el bucle en CuentaCorriente
    }

    private void agregarNumeroGenerado() {
        numerosCuentaGenerados[cuentasGeneradas] = numero;
        cuentasGeneradas++;
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
