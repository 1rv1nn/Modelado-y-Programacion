

public class  MeganmanBoomerang extends Meganman {
	public MeganmanBoomerang(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueBoomerang();
	    defensa = new DefensaSaltando();
	}
}