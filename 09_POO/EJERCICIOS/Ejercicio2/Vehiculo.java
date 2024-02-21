package Ejercicio2;

public abstract class Vehiculo {

    ////Atributo de clase
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;

    ////Atributos de instancia
    private int kilometrosRecorridos;

    ////Constructores
    public Vehiculo() {
        this.kilometrosRecorridos = 0;
        vehiculosCreados++;
    }

    ////Getters
    /* Devuelve los kilometros recorridos por el vehículo*/
    public int getKilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    /* Anda con el vehículo */
    public void anda(int kilometros) {
        this.kilometrosRecorridos += kilometros;
        kilometrosTotales += kilometros;
    }

    ////Métodos de clase
    /* Devuelve el total de kilometros recorridos por todos los vehículos */ 
    public static int getKilometrosTotales() {
        return Vehiculo.kilometrosTotales;
    }
    
    ////Override
    @Override
    public String toString() {
        return "Has recorrido " + kilometrosRecorridos + " km";
    }
}
