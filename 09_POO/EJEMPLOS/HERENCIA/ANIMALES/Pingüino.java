package ANIMALES;   

/**
*
* Creación clase pingüino hijo de Ave
*
* @author: Raquel Lopez
*/

public class Pingüino extends Ave {
    
    public Pingüino() {
        super();
    }

    public Pingüino(Sexo sexo) {
        super(sexo);
    }

    /**
    * El pingüino se siente triste porque no puede volar.
    */
    @Override
    public void vuela() {
        System.out.println("No puedo volar");
    }
}
