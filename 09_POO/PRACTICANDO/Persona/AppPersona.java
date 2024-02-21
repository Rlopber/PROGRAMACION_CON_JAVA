package Persona;

public class AppPersona {
    public static void main(String[] args) {

        
        //Declarar variables
        String nombre;
        int edad;
        char sexo;
        double peso;
        double altura;

        //Entrada de datos
        System.out.print("Introduzca el nombre: ");
        nombre = System.console().readLine();

        System.out.print("Introduzca la edad: ");
        edad = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca el sexo: ");
        sexo = (System.console().readLine()).charAt(0);

        System.out.print("Introduzca el peso: ");
        peso = Double.parseDouble(System.console().readLine());

        System.out.print("Introduzca la altura: ");
        altura = Double.parseDouble(System.console().readLine());

        //Crear objetos
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);

        //Establecer datos con setters
        persona2.setPeso(65.2);
        persona2.setAltura(1.55);

        persona1.setNombre("Amanda");
        persona1.setEdad(8);
        persona1.setPeso(35);
        persona1.setSexo('M');
        persona1.setAltura(1.35);

        //Presentar datos
        System.out.println("Persona 1");
        System.out.println(persona1);
        MuestraMensajePeso(persona1);
        MuestraMensajeMayorEdad(persona1);

        System.out.println();

        System.out.println("Persona 2");
        System.out.println(persona2);
        MuestraMensajePeso(persona2);
        MuestraMensajeMayorEdad(persona2);

        System.out.println();

        System.out.println("Persona 3");
        System.out.println(persona3);
        MuestraMensajePeso(persona3);
        MuestraMensajeMayorEdad(persona3);
    }

    //Función para mostrar mensajes de IMC
    public static void MuestraMensajePeso(Persona persona) {

        int imc = persona.calcularIMC();
        switch (imc) {
            case Persona.INFRAPESO:
                System.out.println("Su peso es demasiado bajo.");
                break;
            case Persona.PESO_IDEAL:
                System.out.println("Su peso es ideal.");
                break;
            case Persona.SOBREPESO:
                System.out.println("Su peso es demasiado alto.");
                break;
        
            default:
                System.out.println("No se ha podido calcular su peso.");
                break;
        } 
    }

    //Función para mostrar mensajes de mayorEdad
    public static void MuestraMensajeMayorEdad(Persona persona) {

        if (persona.esMayordeEdad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona no es mayor de edad.");
        }
    }
}

