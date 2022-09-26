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
public class Pollo extends Ingrediente{
    
    /**
     * Método constructor de la clase.
     * @param alimento El alimento al cual se le agregará el jamón.
     */
    public Pollo(Alimento alimento){
        this.alimento = alimento;
    }

    @Override
    public String getDescripcion(){
        return alimento.getDescripcion() + "\nCon pollo \t\t\t$25";
    }

    @Override
    public double precio(){
        return alimento.precio() + 25;
    }
}
