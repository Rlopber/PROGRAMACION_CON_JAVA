package funcionesmates;

/**
 * Funciones matemáticas de propósito general
 * 
 * @author Raquel López
 */

public class Varias {

  /**
   * Comprueba si un número entero positivo es primo o no.
   * Un número es primo cuando únicamente es divisible entre él mismo y la unidad.
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
   * @param x un número entero (int)
   * @return int la cantidad de dígitos que contiene el número.
   */
    public static int contarDigitos(int x) {
        
        x = Math.abs(x);

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
     * Devuelve el número de dígitos que contiene un número entero.
     * 
     * @param x un número entero (long)
     * @return int la cantidad de dígitos que contiene el número.
     */
        public static int contarDigitos(long x) {
            return contarDigitos((int)x);
        }

    
    /** 
     * Voltear un número introducido por teclado tipo long.
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

    
    /** 
     * 
     * Voltear un número introducido por teclado tipo int.
     * @param x un número entero
     * @return int el número volteado
     */
    public static int voltea(int x) {
        return (int) voltea((long)x);
    }


    
    /** 
     * 
     * Decir si un número es o no capicua para un long.
     * @param x un número entero
     * @return boolean true o false
     */

    public static boolean esCapicua(long x) {
        return x == voltea(x);

        // x = 1234
        // voltea(x) = 4321
        // x == voltea(x) --> False
        // return false;
    }

    /** 
     * 
     * Decir si un número es o no capicua para un int.
     * @param x un número entero
     * @return boolean true si es capicua, false si no es capicua.
     */

    public static boolean esCapicua(int x) {
        return  esCapicua((long)x);
    }

    
    /** 
     * 
     * Función para averiguar el siguiente primo desde un número introducido por teclado.
     * @param x un número entero
     * @return int siguiente primo
     */

    public static int siguientePrimo(int x) {

        do {
            x++;
        } while (!esPrimo(x));

        return x;
    }

    
    /** 
     * 
     * Función para saber si un número es par.
     * @param x un número entero
     * @return boolean true si es par, false si es impar.
     */

    public static boolean esPar(int x) {
        return x % 2 == 0;
    }

    /** 
     * 
     * Función para realizar la suma de los divisores propios de un número.
     * @param x un número entero
     * @return la suma de los divisores
     */

    public static int sumaDivisoresPropios(int x) {
        int suma = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                suma += i;
            }
        }

        return suma;
    }

    /** 
     * Función para saber si dos números son amigos entre sí.
     * @param x es la suma de los divisores propios de un número.
     * @param y es la suma de los divisores propios de un número.
     * @return boolean true sin son números amigos y false si no lo son.
     */
    public static boolean numerosAmigos(int x, int y) {
        return (x == sumaDivisoresPropios(y) && y == sumaDivisoresPropios(x));
    }


    
    /** 
     * Función para realizar potencias.
     * @param x es la base de la potencia.
     * @param y es el exponente de la potencia.
     * @return double resultado de la potencia.
     */
    public static double potencia(int x, int y) {
        return Math.pow(x, y);
    }

    
    /** 
     * Función para saber si el dígito está en el número dado y en qué posición en un int.
     * @param numero es el número donde hay que buscar.
     * @param digito el dígito es el número a encontrar
     * @return double de la posición en la que se encuentra el dígito.
     */
    public static double posicionDeDigito(int numero, int digito) {
        numero = voltea(numero);
        int posicion = 1;

        while (numero != 0) {
            if (numero%10 == digito) {
                return (double) posicion;
            } else {
                numero /= 10;
                posicion++;
            }
        }
        return -1;
    }

    
    /** 
     * Función para saber si el dígito está en el número dado y en qué posiciónen un long.
     * @param numero es el número donde hay que buscar.
     * @param digito el dígito es el número a encontrar
     * @return double de la posición en la que se encuentra el dígito.
     */
    public static double posicionDeDigito(long numero, int digito) {
        return (posicionDeDigito((long)numero, digito));
    }

    
    /** 
     * Función para colocar un dígito al final de otro número int.
     * @param x es el número.
     * @param y es el dígito a colocar.
     * @return int en número con el dígito colocado al final.
     */
    public static int pegaPorDetras(int x, int y) {
        return (x * 10) + y;
    }

    /** 
     * Función para colocar un dígito al principio de otro número int.
     * @param x es el número.
     * @param y es el dígito a colocar.
     * @return int en número con el dígito colocado al principio.
     */
    public static int pegaPorDelante(int x, int y) {
        return (voltea(pegaPorDetras(voltea(x), y)));
    }

    /** 
     * Función que quita un número de dígitos de un número por detrás.
     * @param x es el número.
     * @param y es el número de dígitos a quitar.
     * @return int es el número con y dígitos quitados por detrás.
     */
    public static int quitaPorDetras(int x, int y) {
        for (int i = 0; i < y; i++) {
            x /= 10;
        } 
        return x;
    }

    /** 
     * Función que quita un número de dígitos de un número por delante.
     * @param x es el número.
     * @param y es el número de dígitos a quitar.
     * @return int es el número con y dígitos quitados por delante.
     */
    public static int quitaPorDelante(int x, int y) {
        return (voltea(quitaPorDetras(voltea(x), y)));
    }

    /** 
     * Función para saber que número está en la posición dada, iniciando en 0.
     * @param x es el número.
     * @param y es la posición.
     * @return int es el número en la posición dada.
     */
    public static int digitoN(int x, int y) {
        x = voltea(x);
        int auxiliar = 0;
        for (int i = -1; i < y; i++) {
            auxiliar = x % 10;
            x /= 10;
        }
        return auxiliar;
    }

    /** 
     * Función para devolver un trozo de número teniendo en cuenta una posición inicial y otra final.
     * @param x es el número original
     * @param y es la posición por detrás.
     * @param z es la posición por delante.
     * @return int es el trozo que queda al quitar las posiciones.
     */
    public static int trozoDeNumero(int x, int y, int z) {
        return quitaPorDelante(quitaPorDetras(x, y), z);
    }

    /** 
     * Función para juntar dos números dados.
     * @param x es el primer número
     * @param y es el segundo número
     * @return int es la unión de ambos números.
     */
    public static int juntaNumeros(int x, int y) {
        return (x * (int)(potencia(10, contarDigitos(y))) + y);
    }

    /** 
     * Función para saber si un número es binario verificando si está compuesto por dígitos de 0 o 1.
     * @param x es el número a comprobar int.
     * @return boolean si es o no binario.
     */
    public static boolean esBinario(int x) {
        while (x > 0) {
            int digito = x % 10;
            if (digito != 0 && digito != 1) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

     /** 
     * Función para saber si un número es binario verificando si está compuesto por dígitos de 0 o 1.
     * @param x es el número a comprobar long.
     * @return boolean si es o no binario.
     */
    public static boolean esBinario(long x) {
        return esBinario((int) x);
    }

    public static long DecimalABinario(int x) {
        int digito;
        String binario = "";
        do {
            digito = x % 2;
            if (digito == 0) {
                binario = "0" + binario;
            } else {
                binario = "1" + binario;
            } 
            x /= 2; 
        } while (x != 0); 

        long binarioLong = Long.parseLong(binario);

        return binarioLong;
    }
}