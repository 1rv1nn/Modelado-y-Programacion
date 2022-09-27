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
public class PizzaMexicana implements Pizza{

    private final String nombre = "pizza mexicana"; 

    @Override
    public String getNombre(){
        return nombre;
    }

    @Override
    public String getQueso() {
        return "Queso Cheddar \t\t\t$50";
    }

    @Override
    public String getCarne() {
        return "pollo \t\t\t\t$40";
    }

    @Override
    public String getMasa() {
        return "Masa delgada \t\t\t$75";
    }

    @Override
    public double precio() {
        return 165;
    }
    
}