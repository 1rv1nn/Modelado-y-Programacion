/**
 * Clase DittoBasico que extiende de Ditto
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class DittoBasico extends Ditto{
	/*
	 * Crea el ataque basico de Ditto
	 */
	public DittoBasico() {
	    this.vida = 100;
	    ataque = new AtaqueSimpleDitto();
	    defensa = new DefensaSimpleDitto();
	}
	
	@Override
	public String getNombre() {
		return "Ditto Basico";
	}
}
