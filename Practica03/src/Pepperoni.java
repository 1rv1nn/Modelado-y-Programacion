/**
 * Clase que decora al Alimento e implementa la interface Ingrediente.
 *
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 *
 * @version 1.0
 *
 */
public class Pepperoni extends Ingrediente{

    /**
     * Método constructor de la clase.
     * @param alimento El alimento al cual se le agregara el jamón.
     */
    public Pepperoni(Alimento alimento){
        this.alimento = alimento;
    }

    @Override
    public String getDescripcion(){
        return alimento.getDescripcion() + "\nCon Pepperoni \t$12";
    }

    @Override
    public double precio(){
        return alimento.precio() + 12;
    }
}