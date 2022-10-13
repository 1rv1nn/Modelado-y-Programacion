/**
 * Clase que implementa el sistema de propulción viaje interplanetario. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class ViajeInterplanetario extends SistemaDePropulacion{

    @Override
    public String getNombre() {
        return "viaje interplanetario";
    }

    @Override
    public double getPrecio() {
        return  500;
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
        return 10000000;
    }

    @Override
    public int sumaPeso() {
        return 10000;
    }
}
