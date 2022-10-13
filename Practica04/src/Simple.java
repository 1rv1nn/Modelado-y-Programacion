/**
 * Clase que implementa el blindaje simple. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class Simple extends Blindaje{

    @Override
    public String getNombre() {
        return "simple";
    }

    @Override
    public double getPrecio() {
        return 100;
    }

    @Override
    public int sumaVelocidad() {
        return -10;
    }

    @Override
    public int sumaPeso() {
        return 1000;
    }

    @Override
    public int sumAtaque() {
        return 0;
    }

    @Override
    public int sumDefensa() {
        return 100;
    }
    
}
