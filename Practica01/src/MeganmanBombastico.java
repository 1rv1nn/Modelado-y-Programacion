public class MeganmanBombastico extends Meganman {
	public MeganmanBombastico(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueConGranadas();
	    defensa = new DefensaRepeliendo();
	}
}
