/**
 * Clase que implementa un láser simple como arma. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class LaserSimple extends Armas {

    @Override
    public String getNombre() {
        return "laser simple";
    }

    @Override
    public double getPrecio() {
        return 100;
    }

    @Override
    public int sumDefensa() {
        return 0;
    }

    @Override
    public int sumaVelocidad() {
        return -10;
    }

    @Override
    public int sumaPeso() {
        return 400;
    }

    @Override
    public int sumAtaque() {
        return 500;
    }
    
}
