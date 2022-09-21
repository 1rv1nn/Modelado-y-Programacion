/**
 * Clase que implementa la preparación de una Hamburguesa Ranchera.
 * Además extiende de Hamburguesa.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * @version 1.0
 * @since Semester: 2023-1
 */
public class HamburguesaRanchera extends Hamburguesa {

    public HamburguesaRanchera (){

        id = 5;
        nombre = "Hamburgesa Ranchera.";
        precio = 46;
        tieneQueso = false;
        esVegetariano = false;
        descripcion = "ID: " + id
                    + "\nNombre: " + nombre
                    + "\nPrecio: " + precio
                    + "\nNo tiene queso"
                    + "\nNo es vegetariana"
                    + "Deliciosa hamburguesa ranchera.";
    }

    @Override
    void prepararCarne() {
        System.out.println("Con carne de res molida, unas rebanadas de tocino, chorizo de res, y salsa BBQ hacemos las hamburguesas.");
    }

    @Override
    void ponerQueso() {
        System.out.println("No tiene queso.");
    }

    @Override
    public String toString() {
        return descripcion;
    }
}