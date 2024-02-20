/**
*
* Ejemplo Gato Simple en POO
*
* @author: Raquel Lopez
*/

public class GatoSimple implements Comparable<GatoSimple>{

    //Atributos 

    String color, raza, sexo;
    int edad;
    double peso;

    //Métodos

    //Constructor
    GatoSimple (String s, String color, String raza) {
        this.sexo = s;
        this.color = color;
        this.raza = raza;
    }

    //Getter
    String getSexo() {
        return this.sexo;
    }

    /**
     * Hace que el gato maulle
     */

    void maulla() {
        System.out.println("Miaaaau");
    }

    /**
     * Hace que el gato ronronee
     */

     void ronronea() {
        System.out.println("prrrrr");
     }

        /**
         * Hace que el gato coma.
        * A los gatos les gusta el pesacado, si le damos otra comida la rechazará
        * @param comida  la comida que se le ofrece al gato
        */

        void come(String comida) {
            if (comida.equals("pescado")) {
                System.out.println("Hmmmm, gracias");
            } else {
                System.out.println("Lo siento, sólo como pescado");
            }
        }

        /**
        * Pone a pelear dos gatos.
        * Solo se van a pelear dos machos entre sí.
        *
        * @param contrincante es el gato contra el que pelear
        */

        void peleaCon(GatoSimple contrincante) {
            if (this.sexo.equals("hembra")) {
                System.out.println("no me gusta pelear");
            } else {
            if (contrincante.getSexo().equals("hembra")) {
                System.out.println("no peleo contra gatitas");
            } else {
                System.out.println("ven aquí que te vas a enterar");
            }
        }
    }
        public int compareTo(GatoSimple g) {
            return (this.sexo).compareTo(g.getSexo());
        }

        @Override
        public String toString() {
            return "GatoSimple [color=" + color + ", raza=" + raza + ", sexo=" + sexo + "]";
        }
}
