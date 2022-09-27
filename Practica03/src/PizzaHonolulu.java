/**
 * Clase que implementa la pizza honolulu.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * 
 */
public class PizzaHonolulu implements Pizza{

    private final String nombre = "pizza honolulu";

    @Override
    public String getNombre(){
        return nombre;
    }

    @Override
    public String getQueso(){
        return "Queso Manchego \t\t\t$40";
    }

    @Override
    public String getCarne(){
        return "Jamón \t\t\t\t$25";
    }

    @Override
    public String getMasa(){
        return "Masa gruesa \t\t\t$100";
    }

    @Override
    public double precio(){
        return 165;
    }
} 