package Ejercicio2;

public abstract class Vehiculo {

    ////Atributos
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;

    private int kilometrosRecorridos;

    ////Constructores
    public Vehiculo() {
        this.kilometrosRecorridos = 0;
        vehiculosCreados++;
    }

    ////Getters
    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    ////Métodos

    /* Devuelve los kilometros recorridos por el vehículo*/
    public int getKilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }

    /* Devuelve el total de kilometros recorridos por todos los vehículos */
    public static int getKilometrosTotales() {
        return Vehiculo.kilometrosTotales;
    }

    /* Anda con el vehículo */
    public void anda(int kilometros) {
        this.kilometrosRecorridos += kilometros;
        kilometrosTotales += kilometros;
    }

    ////Override
    @Override
    public String toString() {
        return "Has recorrido " + kilometrosRecorridos + " km";
    }
}
