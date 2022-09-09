/**
 * Clase MeganManBasico que extiende de Meganman 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class  MeganmanBasico extends Meganman {
	public MeganmanBasico() {
	    this.vida = 100;
	    ataque = new AtaqueSimpleMega();
	    defensa = new DefensaSimpleMega();
	}
}
