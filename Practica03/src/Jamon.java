/**
 * Clase que decora al Alimento e implementa la interface Ingrediente. 
 */
public class Jamon extends Ingrediente{
    
    /**
     * Método constructor de la clase.
     * @param alimento El alimento al cual se le agregará el jamón.
     */
    public Jamon(Alimento alimento){
        this.alimento = alimento;
    }

    @Override
    public String getDescripcion(){
        return alimento.getDescripcion() + "\nCon jamón \t$10";
    }

    @Override
    public double precio(){
        return alimento.precio() + 10;
    }
}
