/**
 * Clase que implementa la pizza de pepperoni.
 */
public class PizzaPepperoni implements Pizza{

    private final String nombre = "pizza de pepperoni";

    @Override
    public String getNombre(){
        return nombre;
    }

    @Override
    public String getQueso(){
        return "Queso Cheddar \t\t\t$50";
    }

    @Override
    public String getCarne(){
        return "Salchicha \t\t\t\t$20";
    }

    @Override
    public String getMasa(){
        return "Masa delgada \t\t\t$75";
    }

    @Override
    public double precio(){
        return 145;
    }
}