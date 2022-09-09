/**
 * Clase DittoZard que extiende de Ditto 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class DittoZard extends Ditto {
	/*
	 * Crea un ataque DittoZard
	 */
	public DittoZard(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueEscupeFuego();
	    defensa = new DefensaVolando();
	}
}
