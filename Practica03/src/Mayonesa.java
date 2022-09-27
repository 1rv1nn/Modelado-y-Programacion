/**
 * Clase que cecora al Alimento e implementa la interface Ingrediente.
 *
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 *
 * @version 1.0
 *
 */
public class Mayonesa extends Ingrediente{

    /**
     * Método constructor de la clase.
     * @param alimento El alimento al cual se le agregará el jamón.
     */
    public Mayonesa(Alimento alimento){
        this.alimento = alimento;
    }

    @Override
    public String getDescripcion(){
        return alimento.getDescripcion() + "\nCon mayonesa \t$7";
    }

    @Override
    public double precio(){
        return alimento.precio() + 7;
    }
}