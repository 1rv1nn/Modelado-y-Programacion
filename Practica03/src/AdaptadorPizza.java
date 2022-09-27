/**
 * Clase que adapta las pizzas para imprimir en el ticket la información general e implementa la interface alimento.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * 
 */
public class AdaptadorPizza implements Alimento{

    private Pizza pizza;

    /**
     * Método constructor de AdaptadorPizza.
     * @param pizza Pizza que será adaptada a la cadena WaySub.
     */
    public AdaptadorPizza(Pizza pizza){
        this.pizza = pizza;
    }
    
    @Override
    public String getDescripcion() {
        return "La " + pizza.getNombre() + " tiene los siguientes ingredientes: " + 
                "\n" + pizza.getQueso() + 
                "\n" + pizza.getCarne() + 
                "\n" + pizza.getMasa();
    }

    @Override
    public double precio() {
        return pizza.precio();
    }
}
