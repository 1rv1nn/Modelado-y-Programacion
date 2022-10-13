/**
 * Interfaz componente. Se encarga de  establecer los métodos de todo componente. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public interface Componente {
    /**
     * Método que devuleve el nombre del componente.
     * @return String El nombre del componente.
     */
    String getNombre();

    /**
     * Método que devuelve una breve descripción sobre el componente;
     * es decir, como afecta a la nave espacial.
     * @return String Breve descripción del componente.
     */
    String getDescripcion();

    /**
     * Método que devuelve el precio del componente.
     * @return int Precio del componente.
     */
    double getPrecio();

    /**
     * Método que suma o resta velocidad a la nave espacial debido al peso del componente.
     * Se le llama suma pues entendemos, como matemáticos, que la resta es sumar el inverso.
     *  
     * @return int Valor que se le suma o resta a la nave.
     */
    int sumaVelocidad();

    /**
     * Método que suma o resta el peso a la nave. 
     * Se llama suma pues entendemos, como matemáticos, que la resta es sumar el inverso.
     * 
     * @return int Valor que se le suma o resta a la nave.
     */
    int sumaPeso();


    /**
     * Método que suma o resta el poder de ataque a la nave. 
     * Se llama suma pues entendemos, como matemáticos, que la resta es sumar el inverso.
     * 
     * @return int Valorq ue se le suma o resta a la nave.
     */
    int sumAtaque();

    /**
     * Método que suma o resta el poder de defensa a la nave. 
     * Se llama suma pues entendemos, como matemáticos, que la resta es sumar el inverso.
     * 
     * @return int Valor que se le suma o resta a la nave.
     */
    int sumDefensa();

}
