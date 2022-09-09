/**
 * Clase DittoSour que extiende de Ditto
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class DittoSour extends Ditto {
	/*
	 * Crea el ataque 
	 */
	public DittoSour(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueLanzaPolen();
	    defensa = new DefensaDeFlores();
	}
	
	@Override
	public String getNombre() {
		return "Ditto Bolbasor";
	}
}
