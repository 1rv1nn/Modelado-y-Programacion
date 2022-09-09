/**
 * Clase DefensaDeFlores que implementa de la interfaz IDefensaDitto
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class DefensaDeFlores implements IDefensaDitto{

	@Override
	public void defiende(Ditto dittu) {
		if(dittu.getVida() > 0)
			dittu.setVida(dittu.getVida() + 7);		
	}

}
