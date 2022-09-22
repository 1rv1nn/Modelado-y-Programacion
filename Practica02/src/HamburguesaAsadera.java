/**
 * Clase que implementa la preparación de una Hamburguesa Asadera.
 * Además extiende de Hamburguesa.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * @version 1.0
 * @since Semester: 2023-1
 */
public class HamburguesaAsadera extends Hamburguesa {

    public HamburguesaAsadera() {
        id = 7;
        nombre = "Hamburguesa Asadera.";
        precio = 75;
        tieneQueso = true;
        esVegetariano = false;
        descripcion = "ID: " + id
                    + "\nNombre: " + nombre
                    + "\nPrecio: " + precio
                    + "\nTiene queso"
                    + "\nNo es vegetariana"
                    + "Deliciosa hamburguesa asadera.";
    }

    @Override
    void prepararCarne() {
        System.out.println("Con carne de res, salchicha para azar y jamon hacemos las hamburguesas.");
    }

    @Override
    void ponerQueso() {
        System.out.println("Agregamos queso amarillo y queso asadero fundido.");
    }

    @Override
    public String toString() {
        return descripcion;
    }
} 