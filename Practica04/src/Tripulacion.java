/**
 * Clase que implementa la cabina con una tripulación. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class Tripulacion extends Cabina{

    @Override
    public String getNombre() {
        return "una tripulacion";
    }

    @Override
    public double getPrecio() {
        return 10;
    }

    @Override
    public int sumaVelocidad() {
        return -2000;
    }

    @Override
    public int sumaPeso() {
        return 200000;
    }

    @Override
    public int sumAtaque() {
        return 100;
    }

    @Override
    public int sumDefensa() {
        return 50;
    }
    
}
