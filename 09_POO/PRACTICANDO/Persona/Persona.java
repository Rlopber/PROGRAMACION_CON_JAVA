package Persona;

public class Persona {

    ////Atributos
    private String nombre = "";
    private int edad = 0;
    private String dni;
    private char sexo;
    private double peso = 0;
    private double altura = 0;

    private final static char SEXO_DEF = 'H';

    //Constante para IMC
    public static final int INFRAPESO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int SOBREPESO = 1;

    ////Constructores
    public Persona() {
        this.dni = generarDNI();
        comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.dni = generarDNI();
        comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = generarDNI();
        comprobarSexo(sexo);
    }
    
    ////Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    ////Métodos
    /** 
     * Método para calcular el IMC
     * @param peso
     * @param altura
     * @return int como variable constante
     */

    public int calcularIMC() {
        double imc = (peso/(Math.pow(altura, 2)));

        if (imc < 20) {
            return INFRAPESO;
        } else if (imc >= 20 && imc <=25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }


    /** 
     * Método para saber si es mayor de edad.
     * @param edad
     * @return boolean true si es mayor de edad
     */

    public boolean esMayordeEdad() {
        return (edad >= 18);
    }

    
    /** 
     * Comprueba que el sexo introducido es H o M
     * @param sexo
     * @return char M o H
     */

    private void comprobarSexo(char sexo) {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEF;
        }
    }
    
    /** 
     * Método para generar el DNI
     * @return String con números y letra
     */

    private String generarDNI() {
        String dni;
        String numerosDni = "";
        int sumaNum = 0;

        //Formar número aleatorio de 8 cifras
        for (int i = 0; i < 8; i++) {
            int aux = (int)(Math.random()*10);
            numerosDni += aux;
            sumaNum += aux;
        }
        
        //Añadir la letra
        dni = numerosDni + generarLetraDni(sumaNum % 23);

        return dni;
    }

    /** 
     * Método para averiguar la letra del dni
     * @param posicion
     * @return char letra del dni
     */
    private char generarLetraDni(int posicion) {
        char letra[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letra[posicion];
    }

    ////Override
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", sexo: " + sexo + ", DNI: " + dni + ", edad: " + edad + " años.\nPeso: " + peso + " kg, altura: " + altura + " m";
    } 
}
