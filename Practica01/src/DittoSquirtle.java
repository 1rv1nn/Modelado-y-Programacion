/**
 * Clase DittoSquirtle que extiende de Ditto 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class DittoSquirtle extends Ditto {

	/*
	 * Crea el ataque 
	 */
	public DittoSquirtle(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueEscupeAgua();
	    defensa = new DefensaDeAgua();
	}
}
