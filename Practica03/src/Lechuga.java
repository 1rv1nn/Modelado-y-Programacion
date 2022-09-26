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
public class Lechuga extends Ingrediente{
    
    /**
     * Método constructor de la clase.
     * @param alimento El alimento al cual se le agregará el jamón.
     */
    public Lechuga(Alimento alimento){
        this.alimento = alimento;
    }

    @Override
    public String getDescripcion(){
        return alimento.getDescripcion() + "\nCon lechuga \t$4";
    }

    @Override
    public double precio(){
        return alimento.precio() + 4;
    }
}
