/**
 * Clase DefensaBarril que implementa de la interfaz IDefensaKorby 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class DefensaBarril implements IDefensaKorby {

	@Override
	public void defiende(Korby kirby) {
	    kirby.setVida(kirby.getVida() + 9);		
	}

}
