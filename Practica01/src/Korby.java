/**
 * Define las acciones de Korby. 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public abstract class Korby {
	
    /*Vida. */
	int vida;

    /*Intensidad del ataque */
	IAtaqueKorby ataque;

    /*Intensidad de la defensa */
	IDefensaKorby defensa;
	
	
    /*
     * realiza Ataque
     * @param dittu meganman
     */
    public void realizaAtaque(Ditto dittu, Meganman megaman) {
    	ataque.ataca(dittu, megaman);
    }
    
    /*
     * realiza Defensa
     * @param kirby
     */
    public void realizaDefensa(Korby kirby) {
    	defensa.defiende(kirby);
    }
    
    /*
     * modifica la vida del personaje.
     * @param vida
     */
    public void setVida(int vida) {
    	this.vida = vida;
    }
    
    /*
     * obtiene la vida del personaje. 
     */
    public int getVida() {
    	return vida;
    }
}
