/**
 * Clase AtaqueSimpleMega que implementa de la interfaz IAtaqueMeganman 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */

public class AtaqueSimpleMega implements IAtaqueMeganman {
    
	@Override
	public void ataca(Korby kirby, Ditto dittu){
	kirby.setVida(kirby.getVida() - 10);
	dittu.setVida(dittu.getVida() - 10);
    }
}
