/**
 * Clase que implementa el blindaje reforzado. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class Reforzado extends Blindaje{

    @Override
    public String getNombre() {
        return "reforzada";
    }

    @Override
    public double getPrecio() {
        return 1000;
    }

    @Override
    public int sumaVelocidad() {
        return -1000;
    }

    @Override
    public int sumaPeso() {
        return 500000;
    }

    @Override
    public int sumAtaque() {
        return 0;
    }

    @Override
    public int sumDefensa() {
        return 200;
    }
}
