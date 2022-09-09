
public class KorbyLink extends Korby {
	public KorbyLink(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueConArco();
	    defensa = new DefensaConFlechas();
	}
	
	@Override
	public String getNombre() {
		return "Korby Link";
	}
}
