package Electrodomesticos;

public class Electrodomestico {

    //Atributos
    private double precioBase;
    private String color;
    private char consumoElectrico;
    private double peso;

    //Atributos estáticos
    protected static final double PRECIO_DEF = 100;
    protected static final String COLOR_DEF = "blanco";
    protected static final char CONSUMO_DEF = 'F';
    protected static final double PESO_DEF = 5;

    
    //Constructores
    public Electrodomestico() {
        this.precioBase = PRECIO_DEF;
        this.color = COLOR_DEF;
        this.consumoElectrico = CONSUMO_DEF;
        this.peso = PESO_DEF;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = COLOR_DEF;
        this.consumoElectrico = CONSUMO_DEF;
        this.peso = peso;
    }


    public Electrodomestico(double precioBase, String color, char consumoElectrico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoElectrico = comprobarConsumo(consumoElectrico);
        this.peso = peso;
    }

    //Getters
    public double getPrecioBase() {
        return precioBase;
    }

    public char getConsumoElectrico() {
        return consumoElectrico;
    }

    public double getPeso() {
        return peso;
    }

    //Métodos

    /** 
     * Comprueba que el color está en la lista. Si no está, establece el valor por defecto.
     * @param color
     * @return String color elegido o color default
     */
    
    private String comprobarColor(String color) {
        String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado = false;

            for (int i = 0; i < coloresDisponibles.length && !encontrado; i++) {
                if (coloresDisponibles[i].equals(color)) {
                    encontrado = true;
                }
            }
        
            if (!encontrado) {
                return COLOR_DEF;
            } else {
                return color;
            }
    }

    /** 
     * Comprueba que el color está en la lista. Si no está, establece el valor por defecto.
     * @param consumoElectrico
     * @return char consumo elegido o el default
     */
    
     private char comprobarConsumo(char consumoElectrico) {
        char[] tiposConsumo = {'A', 'B', 'C', 'D', 'E', 'F'};
        boolean encontrado = false;
       

        for (int i = 0; i < tiposConsumo.length && !encontrado; i++) {
            if (tiposConsumo[i] == consumoElectrico) {
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            return CONSUMO_DEF;
        } else {
            return consumoElectrico;
        }
    }

   
    public double precioFinal() {
        int aumentoPrecio = 0;

        switch (consumoElectrico) {
            case 'A':
                aumentoPrecio += 100;
                break;

            case 'B':
                aumentoPrecio += 80;
                break;

            case 'C':
                aumentoPrecio += 60;
                break;

            case 'D':
                aumentoPrecio += 50;
                break;

            case 'E':
                aumentoPrecio += 30;
                break;

            case 'F':
                aumentoPrecio += 10;
                break;
        
            default:
                System.out.println("El consumo energético tipo " + consumoElectrico + " no existe.");
                break;
        }
        
        if (peso >= 0 && peso <= 19) {
            aumentoPrecio += 10;
        } else if (peso > 19 && peso <= 49) {
            aumentoPrecio += 50;
        } else if (peso > 49 && peso <= 79) {
            aumentoPrecio += 80;
        } else if (peso > 79) {
            aumentoPrecio += 100;
        } else {
            System.out.println("El peso no puede ser negativo.");
        }

        double precioFinal = precioBase+aumentoPrecio;
        return precioFinal;
    }   
}