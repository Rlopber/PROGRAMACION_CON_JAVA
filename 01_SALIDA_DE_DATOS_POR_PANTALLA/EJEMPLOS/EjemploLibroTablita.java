/**
 * Ejemplo del libro de una tabla de precios de frutas.
 * 
 * @author: Raquel Lopez
 */
public class EjemploLibroTablita {
    public static void main(String[] args) {
        System.out.println("  Artículo     Precio/Caja     Nº Cajas");
        System.out.println("_______________________________________");
        System.out.printf("%-10s     %8.2f     %7d\n", "manzanas", 4.5, 10);
        System.out.printf("%-10s     %8.2f     %7d\n", "peras", 2.75, 120);
        System.out.printf("%-10s     %8.2f     %7d\n", "aguacates", 10.0, 6);
    }
}
