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
public class Catsup extends Ingrediente{

    /**
     * Método contructor
     * @param alimento El alimento al cual se le agregará la cebolla
     */
    public Catsup(Alimento alimento){
        this.alimento=alimento;
    }

    @Override
    public String getDescripcion(){
        return alimento.getDescripcion() + "\nCon catsup \t\t\t$2.5";
    }

    @Override
    public double precio(){
        return alimento.precio() + 2.5;
    }
}

