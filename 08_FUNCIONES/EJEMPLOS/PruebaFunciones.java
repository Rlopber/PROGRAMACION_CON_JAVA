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

        //Prueba de invertir un número

        long numero;

        System.out.print("Introduce un número entero positivo y te lo voltearé: ");
        numero = Long.parseLong(System.console().readLine());

        System.out.println("EL número " + numero + " invertido es " + Varias.invertirNumero(numero));
    }
}
