
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

    public HamburguesaTocineta () {
        id = 3;
        nombre = "Hamburguesa Tocineta.";
        precio = 40;
        tieneQueso = true;
        esVegetariano = false;
        descripcion = "ID: " + id 
                    + "\nNombre: " + nombre  
                    + "\nPrecio: " + precio 
                    + "\nTiene queso" 
                    + "\nNo es vegetariana" 
                    + "Deliciosa hamburguesa con tocineta.";
    }

    @Override
    void prepararCarne() {
        System.out.println("Con carne molida y huevo hacemos las hamburguesas. Añadimos tocineta también.");
    }

    @Override
    void ponerQueso() {
        System.out.println("Ponemos queso cheddar.");
    }
}
