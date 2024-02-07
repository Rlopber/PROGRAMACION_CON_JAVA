package Ejercicio18;

public class Incidencia {
    ////Atributos
    private int codigoIncidencia;
    private int puesto;
    private String problema;
    private String estado = "Pendiente";

    private static int contadorCodigos = 1;
    private static int contadorIncidencias = 0;


    ////Constructores
    public Incidencia(int puesto, String problema) {
        this.codigoIncidencia = contadorCodigos++;
        this.puesto = puesto;
        this.problema = problema;

        contadorIncidencias++;
    }

    ////Métodos

    /* Resolver una incidencia */
    public String resuelve(String solucion) {
        estado = "Resuelta - " + solucion;
        contadorIncidencias--;
        return estado;
    }

    /* Enseña cuántas incidencias quedan pendientes */
    public static int getPendientes() {
        return contadorIncidencias;
    }
    
    ////Override
    
    @Override
    public String toString() {
        return "Incidencia " + codigoIncidencia + " - Puesto: " + puesto + " - " + problema + " - " + estado;
    }
}
