
public class KorbyBasico extends Korby {
	public KorbyBasico() {
	    this.vida = 100;
	    ataque = new AtaqueSimpleKorby();
	    defensa = new DefensaSimpleKorby();
	}
	
	@Override
	public String getNombre() {
		return "Korby Basico";
	}
}
