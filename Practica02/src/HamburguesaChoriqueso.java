/**
 * Clase que implementa la preparación de una Hamburguesa de Choriqueso.
 * Además extiende de Hamburguesa.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * @version 1.0
 * @since Semester: 2023-1
 */
public class HamburguesaChoriqueso extends Hamburguesa{

    public HamburguesaChoriqueso () {
        id = 4;
        nombre = "Hamburguesa Choriqueso.";
        precio = 35;
        tieneQueso = true;
        esVegetariano = false;
        descripcion = "ID: " + id 
                    + "\nNombre: " + nombre  
                    + "\nPrecio: " + precio 
                    + "\nTiene queso" 
                    + "\nNo es vegetariana" 
                    + "Deliciosa hamburguesa de choriqueso.";
    }

    @Override
    void prepararCarne() {
        System.out.println("Con carne de res, huevo, pan molido y chorizo hacemos las hamburguesas.");
    }

    @Override
    void ponerQueso() {
        System.out.println("Agregamos queso asadero.");
    }

    @Override
    public String toString() {
        return descripcion;
    }
}