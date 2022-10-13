/**
 * Clase que implementa la cabina con un solo piloto. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class UnPiloto extends Cabina{

    @Override
    public String getNombre() {
        return "un piloto";
    }

    @Override
    public double getPrecio() {
        return 1;
    }

    @Override
    public int sumaVelocidad() {
        return -1;
    }

    @Override
    public int sumaPeso() {
        return 100;
    }

    @Override
    public int sumAtaque() {
        return 0;
    }

    @Override
    public int sumDefensa() {
        return 0;
    }
    
}
