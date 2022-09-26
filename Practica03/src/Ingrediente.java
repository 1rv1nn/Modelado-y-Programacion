/**
 * Clase abstracta que implementa la interface alimento. 
 * Se encarga de proveer de una descripción específica a cada ingrediente.
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * 
 */
public abstract class Ingrediente implements Alimento {
    protected Alimento alimento;

    @Override
    public abstract String getDescripcion();
}
