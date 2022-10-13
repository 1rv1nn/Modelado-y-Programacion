/**
 * Clase que implementa el sistema de propulción viaje intercontinental. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class ViajeIntercontinental extends SistemaDePropulacion{

    @Override
    public String getNombre() {
        return "viaje intercontinental";
    }

    @Override
    public double getPrecio() {
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

    @Override
    public int sumaVelocidad() {
        return 95000;
    }

    @Override
    public int sumaPeso() {
        return 1000;
    }
    
}
