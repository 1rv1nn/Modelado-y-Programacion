/**
 * Define las acciones de Meganman. 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public abstract class Meganman {
	int vida;
	IAtaqueMeganman ataque;
	IDefensaMeganman defensa;
	
	
    /*
     * realiza Ataque
     * @param dittu meganman
     */
    public void realizaAtaque(Korby kirby, Ditto dittu) {
    	ataque.ataca(kirby, dittu);
    }
    
    public void realizaDefensa(Meganman megaman) {
    	defensa.defiende(megaman);
    }
    
    public void setVida(int vida) {
    	this.vida = vida;
    }
    
    public int getVida() {
    	return vida;
    }
    
    
	public String getNombre() {
		return "Meganman";
	}
} 
