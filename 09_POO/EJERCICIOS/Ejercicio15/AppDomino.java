package Ejercicio15;

public class AppDomino {
    public static void main(String[] args) {
        FichaDomino primeraFicha = new FichaDomino();
        System.out.print(primeraFicha);

        FichaDomino siguienteFicha;
        
        for (int i = 0; i < 7; i++) {
            do {
                siguienteFicha = FichaDomino.generarSiguienteFicha(primeraFicha);
            } while (!primeraFicha.encaja(siguienteFicha));


            if ((primeraFicha.getLado2() == siguienteFicha.getLado2())) {
                siguienteFicha.voltea();
            }
                
            System.out.print(siguienteFicha);
            primeraFicha = siguienteFicha;
        }
    }
}
