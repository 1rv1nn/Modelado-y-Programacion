/**
 * Clase abstracta que simula el <componente> cabina. 
 * Se encarga de  establecer los métodos que afectan a la cabina. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public abstract class Cabina implements Componente{
    public String getDescripcion() {
        String descripcion = "La cabina de la nave esta preparada para " + getNombre() + " y modifica los siguientes aspectos de la nave:" +
                            "\nVelocidad: " + sumaVelocidad() + " km/min." +  
                            "\nPeso: " + sumaPeso() + " toneladas." + 
                            "\nPoder de ataque: " + sumAtaque() +
                            "\nPoder de defensa: " + sumDefensa() + 
                            "\nPrecio: " + getPrecio() + " billones de USD.";

        return descripcion;
    }
    public abstract int sumaVelocidad();
    public abstract int sumaPeso();
    public abstract int sumAtaque();
    public abstract int sumDefensa();
}
