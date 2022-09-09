/**
 * Clase KorbyLink que extiende de Korby 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class KorbyLink extends Korby {
	public KorbyLink(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueConArco();
	    defensa = new DefensaConFlechas();
	}
	
	@Override
	public String getNombre() {
		return "Korby Link";
	}
}
