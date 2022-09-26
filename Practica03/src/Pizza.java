/**
 * Interface que implementa el sistema de pizzas de “Las pizzas de don cangrejo”
 */
public interface Pizza {

    /**
     * Método que regresa el nombre de la pizza.
     * @return String Nombre de la pizza.
     */
    String getNombre();

    /**
     * Método que regresa que tipo de queso tiene.
     * @return String que indica que tipo de queso tiene la pizza.
     */
    String getQueso();

    /**
     * Método que regresa el tipo de carne que tiene.
     * @return String que indica el tipo de carne que tiene la pizza.
     */
    String getCarne();

    /**
     * Método que regresa el tipo de masa que tiene.
     * @return String que indica el tipo de masa que tiene la pizza.
     */
    String getMasa();

    /**
     * Método que regresa el precio de la pizza.
     * @return double que equivale al precio de la pizza.
     */
    double precio();
}
