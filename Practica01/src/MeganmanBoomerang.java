
/**
 * Clase MeganManBoomerang que extiende de Meganman 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class  MeganmanBoomerang extends Meganman {
	public MeganmanBoomerang(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueBoomerang();
	    defensa = new DefensaSaltando();
	}
	
	@Override
	public String getNombre() {
		return "Meganman Boomerang";
	}
}