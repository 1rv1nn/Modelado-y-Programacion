/**
 * Clase AtaqueLanzaPolen que implementa de la interfaz IAtaqueDitto 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class AtaqueLanzaPolen implements IAtaqueDitto {

	@Override
	public void ataca(Korby kirby, Meganman megaman) {
		kirby.setVida(kirby.getVida() - 15);
		megaman.setVida(megaman.getVida() - 15);		
	}

}
