
public class KorbyDaisy extends Korby {
	public KorbyDaisy(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueLanzandoAToad();
	    defensa = new DefensaEscudoDeToad();
	}
	
	@Override
	public String getNombre() {
		return "Korby Daisy";
	}
}
