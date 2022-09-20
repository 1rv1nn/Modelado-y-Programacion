/**
 * Clase abstracta Hamburguesa que implementa el esqueleto de cómo se prepara una hamburguesa
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * @version 1.0
 * @since Semester: 2023-1
 */
public abstract class Hamburguesa {

    /**
     * Método final sobre cómo preparar cualquier hamburguesa dentro de los platillos
     * de todos los menús.
     */
    final void prepararAnvorguesa() {
        ponerPanInferior();
        ponerMayonesa();
        ponerMostaza();
        prepararCarne();
        if(esHamburguesaConQueso()){
            ponerQueso();
        }
        ponerVegetales();
        ponerCatsup();
        ponerPanSuperior();
    }


    /**
     * Método que simula poner el pan inferior cuando se preprara una hamburguesa.
     */
    public void ponerPanInferior() {
        System.out.println("Ponemos el primer pancito.");
    }


    /**
     * Método que simula ponerle mayonesa a la hamburguesa.
     */
    public void ponerMayonesa() {
        System.out.println("Ponemos mayonesa.");
    }

    /**
     * Método que simula ponerle mostaza a la hamburguesa.
     */
    public void ponerMostaza() {
        System.out.println("Ponemos mostaza.");
    }

    /**
     * Método abstracto de cómo preparar la carne.
     * 
     * Aquí es donde se implementa el patrón Template.
     */
    abstract void prepararCarne();

    /**
     * Método que simula ponerle mostaza a la hamburguesa.
     */
    public void ponerCarne() {
        System.out.println("Ponemos la carne preparada.");
    }

    /**
     * Método abstracto de si ponerle queso a la hamburguesa o no.
     * 
     * Aquí es donde se implementa el patrón Template.
     */
    abstract void ponerQueso();


    /**
     * Método que simula ponerle vegetales a la hamburguesa.
     */
    public void ponerVegetales() {
        System.out.println("Ponemos lechuga, jitomate y cebolla.");
    }


    /**
     * Método que simula ponerle catusup a la hamburguesa.
     */
    public void ponerCatsup() {
        System.out.println("Ponemos catsup.");
    }


    /**
     * Método que simula ponerle el pan superior a la hamburguesa.
     * 
     * Así se llega al final.
     */
    public void ponerPanSuperior() {
        System.out.println("Ponemos el pan superior y terminó de prepararse la hamburguesa.");
    }

    /**
     * Hook para probar cuando una hamburguesa lleva queso o no.
     * @return
     */
    public boolean esHamburguesaConQueso() {
        return true;
    }
}
