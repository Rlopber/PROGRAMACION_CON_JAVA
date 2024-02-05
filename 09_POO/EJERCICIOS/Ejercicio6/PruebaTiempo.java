package Ejercicio6;

public class PruebaTiempo {
    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(1, 20, 30);
        Tiempo t2 = new Tiempo(0, 30, 40);
        Tiempo t3 = new Tiempo(0, 35, 20);
              
        System.out.println(t1 + " + " + t2 + " = " + Tiempo.sumarTiempos(t1, t2));
        System.out.println(t2 + " + " + t3 + " = " + Tiempo.sumarTiempos(t2, t3));
    }
}

