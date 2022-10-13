/**
 * Clase abstracta que simula el <componente> blindaje. 
 * Se encarga de  establecer los métodos que afectan al blindaje. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public abstract class Blindaje implements Componente{
    public String getDescripcion() {
        String descripcion = "El blindaje de la nave es del tipo " + getNombre() + "  y modifica los siguientes aspectos de la nave:" +
                            "\nVelocidad: " + sumaVelocidad() + " km/min." +  
                            "\nPeso: " + sumaPeso() + " toneladas." + 
                            "\nPoder de defensa: " + sumDefensa() + 
                            "\nPrecio: " + getPrecio() + " billones de USD.";

        return descripcion;
    }
    public abstract int sumDefensa();
}
