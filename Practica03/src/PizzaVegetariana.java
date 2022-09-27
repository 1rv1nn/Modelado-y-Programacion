/**
 * Clase que implementa la pizza hawaiana.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * 
 */
public class PizzaVegetariana implements Pizza{

    private final String nombre = "pizza vegetariana"; 

    @Override
    public String getNombre(){
        return nombre;
    }

    @Override
    public String getQueso() {
        return "Queso manchego \t\t\t$40";
    }

    @Override
    public String getCarne() {
        return "pollo \t\t\t\t$40";
    }

    @Override
    public String getMasa() {
        return "Masa gruesa \t\t\t$100";
    }

    @Override
    public double precio() {
        return 180;
    }
    
}