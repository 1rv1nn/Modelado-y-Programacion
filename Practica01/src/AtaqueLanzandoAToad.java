/**
 * Clase AtaqueLanzandoAToad que implementa de la interfaz IAtaqueKorby
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class AtaqueLanzandoAToad implements IAtaqueKorby {

	@Override
	public void ataca(Ditto dittu, Meganman megaman) {
		dittu.setVida(dittu.getVida() - 15);
		megaman.setVida(megaman.getVida() - 15);		
	}
	
	
	
}
