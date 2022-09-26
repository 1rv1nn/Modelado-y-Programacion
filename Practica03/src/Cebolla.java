/**
 * Clase que decora al Alimento e implementa la interface Ingrediente. 
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * 
 * @version 1.0
 * 
 */
public class Cebolla extends Ingrediente{

    /**
     * Método contructor
     * @param alimento El alimento al cual se le agregará la cebolla
     */
    public Cebolla(Alimento alimento){
        this.alimento=alimento;
    }

    @Override
    public String getDescripcion(){
        return alimento.getDescripcion() + "\nCon cebolla \t$0";
    }

    @Override
    public double precio(){
        return alimento.precio() + 0;
    }
}

