package Ejercicio5;

public class Pizza {
    
    ////Atributos
    /* Atributos estáticos (común a todas las instancias) para realizar el seguimiento del total de pizzas */
    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    /* Atributos para cada pizza individual */
    private String sabor;
    private String tamano;
    private String estado;

    

    ////Constructores
    public Pizza(String sabor, String tamano) {
        this.sabor = sabor;
        this.tamano = tamano;
        this.estado = "pedida";
        Pizza.totalPedidas++;
    }

    ////Getters
    public String getSabor() {
        return sabor;
    }

    public String getTamaño() {
        return tamano;
    }

    public static int getTotalPedidas() {
        return Pizza.totalPedidas;
    }

    public static int getTotalServidas() {
        return Pizza.totalServidas;
    }

    ////Métodos
    public void sirve() {
        if (this.estado.equals("pedida")) {
            this.estado = "servida";
            Pizza.totalServidas++;
        } else {
            System.out.println("esa pizza ya se ha servido");
        }
    }

    ////Override
    @Override
    public String toString() {
        return "pizza " + this.sabor + " " + this.tamano + ", " + this.estado;
    }
}

/*
 * Los atributos estáticos se usan para aquellos que son comunes a todas las clases.
 * Todas las pizzas van a tener ese mismo atributo, da igual el sabor o tamaño.
 */