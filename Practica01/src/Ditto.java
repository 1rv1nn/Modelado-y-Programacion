/**
 * Define las acciones de Ditto. 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public abstract class Ditto {
    /*Vida. */
	int vida;

    /*ataque */
	IAtaqueDitto ataque;

    /*defensa */
	IDefensaDitto defensa;
	
	
    /*
     * realiza Ataque
     * @param dittu meganman
     */
    public void realizaAtaque(Korby kirby, Meganman megaman) {
    	ataque.ataca(kirby, megaman);
    }
    
    public void realizaDefensa(Ditto dittu) {
    	defensa.defiende(dittu);
    }
    
    public void setVida(int vida) {
    	this.vida = vida;
    }
    
    public int getVida() {
    	return vida;
    }
    
	public String getNombre() {
		return "Ditto";
	}
}
