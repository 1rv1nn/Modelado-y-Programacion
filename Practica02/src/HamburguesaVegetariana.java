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

    public HamburguesaVegetariana() {
        id = 2;
        nombre = "Hamburguesa Vegetariana.";
        precio = 60;
        tieneQueso = false;
        esVegetariano = true;
        descripcion = "ID: " + id 
                    + "\nNombre: " + nombre  
                    + "\nPrecio: " + precio 
                    + "\nNo tiene queso" 
                    + "\nEs vegetariana" 
                    + "Deliciosa hamburguesa vegetariana.";
    }

    @Override
    void prepararCarne() {
        System.out.println("Con calabazas, zanahorias, germinado, huevo y pan molido hacemos las hamburguesas.");
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