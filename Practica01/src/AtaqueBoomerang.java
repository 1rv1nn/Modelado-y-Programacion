/**
 * Clase AtaqueBoomerang que implementa de la interfaz IAtaqueMeganman 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class AtaqueBoomerang implements IAtaqueMeganman {
    public void ataca(Korby kirby, Ditto dittu){
    	kirby.setVida(kirby.getVida() - 15);
    	dittu.setVida(dittu.getVida() - 15);
    }
}
