
/**
 * Clase que implementa la preparación de una hamburguesa tocineta.
 * Además extiende de Hamburguesa.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * @version 1.0
 * @since Semester: 2023-1
 */
public class HamburguesaTocineta extends Hamburguesa{

    @Override
    void prepararCarne() {
        System.out.println("Con carne molida y huevo hacemos las hamburguesas. Añadimos tocineta también.");
    }

    @Override
    void ponerQueso() {
        System.out.println("Ponemos queso cheddar.");
    }
}
