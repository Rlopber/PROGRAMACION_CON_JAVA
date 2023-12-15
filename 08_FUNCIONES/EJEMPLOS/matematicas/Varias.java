package matematicas;

/**
 * Funciones matemáticas de propósito general
 * 
 * @author Sergio Sánchez
 */
public class Varias {

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

  /**
   * Devuelve el número de dígitos que contiene un número entero
   * 
   * @param x un número entero
   * @return int la cantidad de dígitos que contiene el número
   */
    public static int contarDigitos(int x) {
    
        if (x == 0) {
        return 1;
        } else {
        int n = 0;
        while (x > 0) {
            x /= 10;
            n++;
        }
        return n;
        }
    }

    
    /** 
     * Voltear un número introducido por teclado.
     * @param x un número entero
     * @return long el número volteado
     * 
     */

    public static long voltea(long x) {
        
        if (x < 0) {
            return -voltea(-x); //Esta es la opción para cuando el número es negativo. Si sólo se pone el -x, te da positivo, por eso se pone otro - en voltea.
        }

        long numeroVolteado = 0;
        while (x > 0) {
            numeroVolteado = (numeroVolteado * 10) + (x % 10);
            x /= 10;
        }

        return numeroVolteado;
    }
}