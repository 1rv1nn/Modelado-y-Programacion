/**
 * Clase Espectador que extiende de Korby
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class KorbyKong extends Korby {
	
	public KorbyKong(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueManotazo();
	    defensa = new DefensaBarril();
	}
	
	@Override
	public String getNombre() {
		return "Korby Kong";
	}
}
