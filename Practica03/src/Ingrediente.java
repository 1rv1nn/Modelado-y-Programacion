/**
 * Clase abstracta que implementa la interface alimento. 
 * Se encarga de proveer de una descripción específica a cada ingrediente.
 */
public abstract class Ingrediente implements Alimento {
    protected Alimento alimento;

    @Override
    public abstract String getDescripcion();
}
