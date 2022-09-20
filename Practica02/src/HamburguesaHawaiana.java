
/**
 * Clase que implementa la preparación de una hamburguesa hawaiana.
 * Además extiende de Hamburguesa.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * @version 1.0
 * @since Semester: 2023-1
 */
public class HamburguesaHawaiana extends Hamburguesa{

    @Override
    void prepararCarne() {
        System.out.println("Con carne molida y especias hacemos las hamburguesas.");
    }

    @Override
    void ponerQueso() {
        System.out.println("Ponemos queso parmesano y manchego.");
    }
}
