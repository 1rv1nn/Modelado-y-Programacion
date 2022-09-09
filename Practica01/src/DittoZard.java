
public class DittoZard extends Ditto {
	public DittoZard(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueEscupeFuego();
	    defensa = new DefensaVolando();
	}
	
	@Override
	public String getNombre() {
		return "Ditto Charizard";
	}
}
