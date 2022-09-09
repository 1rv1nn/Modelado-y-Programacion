/**
 * Interface Sujeto
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
interface Sujeto {
    void registrar(Espectador viewer);
    void remover(Espectador viewer);
    void notificar();
}
