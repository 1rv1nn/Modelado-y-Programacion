/**
 * Clase que implementa la pizza hawaiana.
 */
public class PizzaHawaiana implements Pizza{

    private final String nombre = "pizza hawaiana"; 

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
        return "Jamón \t\t\t\t$25";
    }

    @Override
    public String getMasa() {
        return "Masa delgada \t\t\t$75";
    }

    @Override
    public double precio() {
        return 150;
    }
    
}
