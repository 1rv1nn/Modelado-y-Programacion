/**
 * Clase KorbyDaisy que extiende de Korby 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class KorbyDaisy extends Korby {
	public KorbyDaisy(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueLanzandoAToad();
	    defensa = new DefensaEscudoDeToad();
	}
}
