public class  MeganmanDeFuego extends Meganman {

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