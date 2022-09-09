
public class DittoSour extends Ditto {
	public DittoSour(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueLanzaPolen();
	    defensa = new DefensaDeFlores();
	}
	
	@Override
	public String getNombre() {
		return "Ditto Bolbasor";
	}
}
