import matematicas.Varias;
import matematicas.Volumen;

public class PruebaFunciones {
    public static void main(String[] args) {
        int n;

        //Probamos la función esPrimo() alojada en la clase Varias dentro del paquete matemáticas.
        System.out.print("Introduzca un número entero positivo: ");
        n = Integer.parseInt(System.console().readLine());

        if (Varias.esPrimo(n)) {
            System.out.println("El " + n + " es primo.");
        } else {
          System.out.println("El " + n + " no es primo.");
        }

       
        //Prueba de contarDigitos() alojada en la clase Varias dentro del paquete matemáticas.
        System.out.print("Introduzca un número entero positivo: ");
        n = Integer.parseInt(System.console().readLine());

        int numDigitos = Varias.contarDigitos(n);
        System.out.println(n + " tiene " + numDigitos + " dígitos.");

        
        //Prueba de volumenCilindro()
        double r;
        double h;

        System.out.print("Introduzca el radio del cilindro (cm): ");
        r = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca la altura del cilindro (cm): ");
        h = Double.parseDouble(System.console().readLine());

        System.out.println("El volumen del cilindro es " + Volumen.volumenCilindro(r, h) + "u^3");


        //Prueba de invertir un número (long)
        long numero;

        System.out.print("Introduce un número entero positivo y te lo voltearé: ");
        numero = Long.parseLong(System.console().readLine());

        System.out.println("El número " + numero + " invertido es " + Varias.voltea(numero));


        //Prueba de invertir un número (int)
        int num;

        System.out.print("Introduce un número entero positivo y te lo voltearé: ");
        num = Integer.parseInt(System.console().readLine());

        System.out.println("El número " + num + " invertido es " + Varias.voltea(num));


        // Prueba funcion esCapicua(long)
        System.out.println("Introduzca un número para saber si es capicúa (long): ");
        numero = Long.parseLong(System.console().readLine());
        if (Varias.esCapicua(numero)) {
            System.out.println("El número es capicua.");
        } else {
            System.out.println("El número no es capicua.");
        }

        // Prueba funcion esCapicua(int)
        System.out.println("Introduzca un número para saber si es capicúa (int): ");
        numero = Integer.parseInt(System.console().readLine());
        if (Varias.esCapicua(numero)) {
            System.out.println("El número es capicua.");
        } else {
            System.out.println("El número no es capicua.");
        }

        //Prueba de siguientePrimo

        System.out.print("Introduzaca un número para conocer el siguiente primo: ");
        n = Integer.parseInt(System.console().readLine());
        
        System.out.println("El siguiente primo tras " + n + " es " + Varias.siguientePrimo(n));
    }
}
