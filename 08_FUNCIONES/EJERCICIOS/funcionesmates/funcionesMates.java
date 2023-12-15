package funcionesmates;

public class funcionesMates {
    
    /** 
    * Invertir un número.
    * @param x un número entero positivo
    * @return int el número invertido
    *
    */

    public static long voltearNumero(long x) {
        
        long numeroVolteado = 0;
        while (x > 0) {
            numeroVolteado = (numeroVolteado * 10) + (x % 10);
            x /= 10;
        }

        return numeroVolteado;
    }

    /** 
    * Contar los dígitos de un número
    * @param x un número entero positivo
    * @return int total de dígitos
    *
    */

    public static int contarDigitos(long x) {

        if (x == 0) {
            return 1;
        } else {
            int digitos = 0;
            while (x > 0) {
                x /= 10;
                digitos++;
            }
            return digitos;
        }
    }

    /**
     * Comprueba si un número entero positivo es primo o no.
     * Un número es primo cuando únicamente es divisible entre
     * él mismo y la unidad.
     * 
     * @param x un número entero positivo
     * @return boolean <code>true</code> si el número es primo o <code>false</code> en caso contrario
     */

    public static boolean esPrimo(int x) {
        
        if (x < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        } else if (x == 1 || x == 0) { // 0 y 1 no son primos.
            return false;
        } else if (x == 2) {
            return true;
        } else if (x % 2 == 0) {
            return false;
        } else{
            for (int i = 3; i <= Math.sqrt(x); i += 2) { /*Explicacion en T05Ejercicio16 */
                if ((x % i) == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}

/*
 * 
 * 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro
es capicúa y falso en caso contrario.

3. siguientePrimo: Devuelve el menor primo que es mayor al número que
se pasa como parámetro.
4. potencia: Dada una base y un exponente devuelve la potencia.


7. digitoN: Devuelve el dígito que está en la posición digitos de un número entero.
Se empieza contando por el 0 y de izquierda a derecha.
8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
dentro de un número entero. Si no se encuentra, devuelve -1.
9. quitaPorDetras: Le quita a un número digitos dígitos por detrás (por la
derecha).
10. quitaPorDelante: Le quita a un número digitos dígitos por delante (por la
izquierda).
11. pegaPorDetras: Añade un dígito a un número por detrás.
12. pegaPorDelante: Añade un dígito a un número por delante.
13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
dentro de un número y devuelve el trozo correspondiente.
14. juntaNumeros: Pega dos números para formar uno.
 */