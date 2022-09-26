/**
 * Interface de alimento que contiene los métodos de cada alimento.
 */
public interface Alimento {
    /**
     * Método para obtener la descripción del alimento.
     * 
     * @return Información de los ingredientes (con su precio) del alimento seleccionado. 
     */
    String getDescripcion();

    /**
     * Método para obtener el precio del alimento.
     * 
     * @return Precio del alimento.
     */
    double precio();
}
