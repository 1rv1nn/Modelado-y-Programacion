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
public class HamburguesaChampiqueso extends Hamburguesa {

    public HamburguesaChampiqueso() {
        id = 6;
        nombre = "Hamburguesa Champiqueso.";
        precio = 36;
        tieneQueso = true;
        esVegetariano = false;
        descripcion = "ID: " + id
                    + "\nNombre: " + nombre
                    + "\nPrecio: " + precio
                    + "\nTiene queso"
                    + "\nNo es vegetariana"
                    + "Deliciosa hamburguesa de champiqueso.";
    }

    @Override
    void prepararCarne() {
        System.out.println("Con carne molida, huevo, champiñones rebanados y cebolla picada hacemos las hamburguesas.");
    }

    @Override
    void ponerQueso() {
        System.out.println("Agregamos queso gouda.");
    }

    @Override
    public String toString() {
        return descripcion;
    }
}