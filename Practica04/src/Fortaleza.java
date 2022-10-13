/**
 * Clase que implementa el blindaje fortaleza. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class Fortaleza extends Blindaje{

    @Override
    public String getNombre() {
        return "fortaleza";
    }

    @Override
    public double getPrecio() {
        return 100000.00;
    }

    @Override
    public int sumaVelocidad() {
        return -1000000;
    }

    @Override
    public int sumaPeso() {
        return 100000000;
    }

    @Override
    public int sumAtaque() {
        return 0;
    }

    @Override
    public int sumDefensa() {
        return 500;
    }

    
}
