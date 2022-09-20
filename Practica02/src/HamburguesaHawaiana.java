
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

    public HamburguesaHawaiana() {
        id = 1;
        nombre = "Hamburguesa Hawaiana.";
        precio = 50;
        tieneQueso = true;
        esVegetariano = false;
        descripcion = "ID: " + id 
                    + "\nNombre: " + nombre  
                    + "\nPrecio: " + precio 
                    + "\nTiene queso" 
                    + "\nNo es vegetariana" 
                    + "Deliciosa hamburguesa con piña y jamón.";
    }

    @Override
    void prepararCarne() {
        System.out.println("Con carne molida y especias hacemos las hamburguesas.");
    }

    @Override
    void ponerQueso() {
        System.out.println("Ponemos queso parmesano y manchego.");
    }
}
