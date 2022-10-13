/**
 * Clase que implementa la cabina con un ejército. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class Ejercito extends Cabina{

    @Override
    public String getNombre() {
        return "un ejercito";
    }

    @Override
    public double getPrecio() {
        return 100;
    }

    @Override
    public int sumaVelocidad() {
        return -500000;
    }

    @Override
    public int sumaPeso() {
        return 1000000;
    }

    @Override
    public int sumAtaque() {
        return 500;
    }

    @Override
    public int sumDefensa() {
        return 200;
    }
    
}
