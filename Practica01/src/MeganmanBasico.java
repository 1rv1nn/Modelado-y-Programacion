public class  MeganmanBasico extends Meganman {
	public MeganmanBasico() {
	    this.vida = 100;
	    ataque = new AtaqueSimpleMega();
	    defensa = new DefensaSimpleMega();
	}
	
	@Override
	public String getNombre() {
		return "Meganman Basico";
	}
}
