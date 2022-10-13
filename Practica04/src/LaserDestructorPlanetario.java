/**
 * Clase que implementa un láser destructor de planetas como arma. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class LaserDestructorPlanetario extends Armas {

    @Override
    public String getNombre() {
        return "laser destructor de planetas";
    }

    @Override
    public double getPrecio() {
        return 100000.00;
    }

    @Override
    public int sumDefensa() {
        return 0;
    }

    @Override
    public int sumaVelocidad() {
        return -500000;
    }

    @Override
    public int sumaPeso() {
        return 100000;
    }

    @Override
    public int sumAtaque() {
        return 1000;
    }
    
}
