package Ejercicio3;

public class Ave extends Animal{

    ////Atributo
    private boolean nido;

    ////Constructores
    public Ave(Sexo sexo) {
        super(sexo);
    }

    public Ave() {
        super();
    }

    ////Métodos
    public void volar() {
        System.out.println("Está volando");
    }

    public void anidar() {
        System.out.println("Está haciendo un nido");
        nido = true;
    }

    public void asear() {
        System.out.println("Se está limpiando las plumas");
    }
    
    public void cantar() {
        System.out.println("Está cantando");
    }

    ////Override
    public void reproduccion() {
        super.reproduccion();
        if (nido) {
            System.out.println("El ave se reproduce de manera ovípara. ¡La hembra ha puesto huevos!");
        } else {
            System.out.println("¡No tienes preparado el nido! No puedes poner huevos.");
        }
    }
}
