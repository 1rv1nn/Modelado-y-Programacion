/**
 * Clase AtaqueEscupeAgua que implementa de la interfaz IAtaqueDitto 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class AtaqueEscupeAgua implements IAtaqueDitto {

	@Override
	public void ataca(Korby kirby, Meganman megaman) {
		if(kirby.getVida() > 0) {
			kirby.setVida(kirby.getVida() - 20);			
		}
		if(megaman.getVida() > 0) {			
			megaman.setVida(megaman.getVida() - 20);
		}		
	}

}
