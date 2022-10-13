/**
 * Clase abstracta que simula el <componente> sistema de propulción. 
 * Se encarga de  establecer los métodos que afectan al sistema de propulación. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public abstract class SistemaDePropulacion implements Componente{
    public String getDescripcion() {
        String descripcion = "El sistema de propulcion " + getNombre() + " modifica los siguientes aspectos de la nave:" +
                            "\nVelocidad: " + sumaVelocidad() + " km/min." +  
                            "\nPeso: " + sumaPeso() + " toneladas." + 
                            "\nPrecio: " + getPrecio() + " billones de USD.";

        return descripcion;
    }
    public abstract int sumaVelocidad();
    public abstract int sumaPeso();
}
