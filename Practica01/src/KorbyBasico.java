/**
 * Clase KorbyBasico que extiende de Korby 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class KorbyBasico extends Korby {

	/*Crea una ataque basica*/
	public KorbyBasico() {
	    this.vida = 100;
	    ataque = new AtaqueSimpleKorby();
	    defensa = new DefensaSimpleKorby();
	}
	
	@Override
	public String getNombre() {
		return "Korby Basico";
	}
}
