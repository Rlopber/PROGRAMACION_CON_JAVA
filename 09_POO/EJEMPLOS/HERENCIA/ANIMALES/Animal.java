package ANIMALES;

/**
*
* Deficición de la clase animal
*
* @author: Raquel Lopez
*/

public abstract class Animal {
    
    ///Atributo
    private Sexo sexo;

    ///Constructor
    public Animal () {
        sexo = Sexo.MACHO;
    }

    public Animal (Sexo sexo) {
        this.sexo = sexo;
    }

    ///Getter (Método)
    public Sexo getSexo() {
        return this.sexo;
    }

    ///Sobrecarga/Override
    @Override
    public String toString() {
        return "Sexo: " + this.sexo + "\n";
    }

    /**
    * Hace que el animal se eche a dormir.
    */
    
    public void duerme() {
        System.out.println("Zzzzzzz");
    }
}
    

