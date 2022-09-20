/**
 * Clase que implementa la preparación de una Hamburguesa Vegana.
 * Además extiende de Hamburguesa.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * @version 1.0
 * @since Semester: 2023-1
 */
public class HamburguesaVegana extends Hamburguesa {

    public HamburguesaVegana() {
        id = 9;
        nombre = "Hamburguesa Vegana.";
        precio = 65;
        tieneQueso = false;
        esVegetariano = true;
        descripcion = "ID: " + id
                    + "\nNombre: " + nombre
                    + "\nPrecio: " + precio
                    + "\nNo tiene queso"
                    + "\nEs vegetariana"
                    + "\nDelicisa hamburguesa vegana.";
    }

    @Override
    void prepararCarne() {
        System.out.println("Con chicharos cocidos, garbanzos, chipotle molido y aceite vegetal hacemos las hamburguesas.");
    }

    @Override
    void ponerQueso() {
        System.out.println("No tiene queso.");
    }

}