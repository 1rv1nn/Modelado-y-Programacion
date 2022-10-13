/**
 * Clase implementa el sistema de propulción viaje intergaláctico. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class ViajeIntergalactico extends SistemaDePropulacion{

    @Override
    public String getNombre() {
        return "viaje intergalactico";
    }
    
    @Override
    public double getPrecio() {
        return 10000;
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
        return 1000000000;
    }

    @Override
    public int sumaPeso() {
        return 10000;
    }
}
