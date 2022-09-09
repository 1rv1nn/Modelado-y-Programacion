/**
 * Clase DefensaDeFuego que implementa de la interfaz IDEfensaMeganman 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class DefensaDeFuego implements IDefensaMeganman {

	@Override
	public void defiende(Meganman m) {
		m.setVida(m.getVida() + 10);		
	}
}
