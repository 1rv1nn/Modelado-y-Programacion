
/**
 * Clase AtaqueBolasDeFuego que implementa de la interfaz IAtaqueMeganman 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class AtaqueBolasDeFuego implements IAtaqueMeganman {
    public void ataca(Korby kirby, Ditto dittu){
    	if(kirby.getVida() > 0) {
			kirby.setVida(dittu.getVida() - 20);			
		}
		if(dittu.getVida() > 0) {			
			dittu.setVida(dittu.getVida() - 20);
		}
    }
}
