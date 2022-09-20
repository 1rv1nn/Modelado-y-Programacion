/**
 * Clase que implementa la preparación de una Hamburguesa Especial.
 * Además extiende de Hamburguesa.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * @version 1.0
 * @since Semester: 2023-1
 */
public class HamburguesaEspecial extends Hamburguesa {

    public HamburguesaEspecial() {
        id = 8;
        nombre = "Hamburguesa Especial.";
        precio = 39;
        tieneQueso = true;
        esVegetariano = false;
        descripcion = "ID: " + id
                    + "\nNombre: " + nombre
                    + "\nPrecio: " + precio
                    + "\nTiene queso"
                    + "\nNo es vegetariana"
                    + "Deliciosa hamburguesa especial.";
    }

    @Override
    void prepararCarne() {
        System.out.println("Con carne de ternera, jamon ahumado, cilantro y especias hacemos las hamburguesas.");
    }

    @Override
    void ponerQueso() {
        System.out.println("Agregamos queso cheddar.");
    }
} 