/**
 * Clase AtaqueConArco que implementa de la interfaz IAtaqueKorby 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class AtaqueConArco implements IAtaqueKorby {

	@Override
	public void ataca(Ditto dittu, Meganman megaman) {
		if(dittu.getVida() > 0) {
			dittu.setVida(dittu.getVida() - 20);			
		}
		if(megaman.getVida() > 0) {			
			megaman.setVida(megaman.getVida() - 20);
		}
	}
	
	
}
