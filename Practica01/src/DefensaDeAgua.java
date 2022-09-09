/**
 * Clase DefensaDeAgua que implementa de la interfaz IDefensaDitto
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class DefensaDeAgua implements IDefensaDitto {

	@Override
	public void defiende(Ditto dittu) {
		dittu.setVida(dittu.getVida() + 10);		
	}

}
