/**
 * Clase que implementa un Baguette con pan Blanco y implementa la interface Alimento.
 */
public class BaguetteBlanco implements Alimento{

    @Override
    public String getDescripcion() {
        return "Una baguete de pan blanco \t$5";
    }

    @Override
    public double precio() {
        return 5;
    }
    
}
