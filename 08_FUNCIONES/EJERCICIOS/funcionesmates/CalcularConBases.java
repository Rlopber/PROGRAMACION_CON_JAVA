package funcionesmates;

/**
 * Funciones matemáticas de propósito general
 * 
 * @author Raquel López
 */

public class CalcularConBases {

     /** 
     * Función para saber si un número es binario verificando si está compuesto por dígitos de 0 o 1.
     * 
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
     * 
     * @param x es el número a comprobar long.
     * @return boolean si es o no binario.
     */
    public static boolean esBinario(long x) {
        while (x > 0) {
            int digito = (int)(x % 10);
            if (digito != 0 && digito != 1) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    
    /** 
     * Función para pasar de decimal a binario.
     * 
     * @param x siendo el número decimal.
     * @return long es el número binario.
     */
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
        
        /** 
         * Función para pasar de binario a decimal
         * 
         * @param x siendo el número binario.
         * @return int el número decimal.
         */
        public static int BinarioADecimal(long x) {
            int digito;
            int base = 0;
            int decimal = 0;

            do {
                digito = (int)x%10;
                x /= 10;

                if (digito == 1) {
                    decimal += (int)(1 * Varias.potencia(2, base));
                }
                base += 1;
            } while (x > 0);

            return decimal;
    }
}