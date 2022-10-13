/**
 * Clase abstracta que simula el <componente> armas. 
 * Se encarga de  establecer los métodos que afectan a las armas. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public abstract class Armas implements Componente{
    public String getDescripcion() {
        String descripcion = "El principal ataque de la nave es con " + getNombre() + " y modifica los siguientes aspectos de la nave:" +
                            "\nVelocidad: " + sumaVelocidad() + " km/min." +  
                            "\nPeso: " + sumaPeso() + " toneladas." + 
                            "\nPoder de ataque: " + sumAtaque() + 
                            "\nPrecio: " + getPrecio() + " billones de USD.";

        return descripcion;
    }
    public abstract int sumaVelocidad();
    public abstract int sumaPeso();
    public abstract int sumAtaque();
}
