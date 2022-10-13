/**
 * Clase que implementa misiles de plasma como arma. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class MisilesPlasma extends Armas {

    @Override
    public String getNombre() {
        return "misiles de plasma";
    }

    @Override
    public double getPrecio() {
        return 500;
    }

    @Override
    public int sumDefensa() {
        return 0;
    }

    @Override
    public int sumaVelocidad() {
        return -1000;
    }

    @Override
    public int sumaPeso() {
        return 30000;
    }

    @Override
    public int sumAtaque() {
        return 700;
    }
    
}
