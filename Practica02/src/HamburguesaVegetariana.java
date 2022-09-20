/**
 * Clase que implementa la preparación de una hamburguesa vegetariana.
 * Además extiende de Hamburguesa.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * @version 1.0
 * @since Semester: 2023-1
 */
public class HamburguesaVegetariana extends Hamburguesa{

    @Override
    void prepararCarne() {
        System.out.println("Con calabazas, zanahorias, germinado, huevo y pan molido hacemos las hamburguesas.");
    }

    @Override
    void ponerQueso() {
        System.out.println("Ponemos queso Halloumi.");
    }
}
