/**
 * Clase MeganmanDeFuego que extiende de Meganman
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class  MeganmanDeFuego extends Meganman {

	/*
	 * Crea la habilidad de MeganMan.
	 * @param vida 
	 */
	public MeganmanDeFuego(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueBolasDeFuego();
	    defensa = new DefensaDeFuego();	    
	}
	
	@Override
	public String getNombre() {
		return "Meganman de Fuego";
	}
}    