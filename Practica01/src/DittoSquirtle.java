
public class DittoSquirtle extends Ditto {
	public DittoSquirtle(int vida) {
	    this.vida = vida;
	    ataque = new AtaqueEscupeAgua();
	    defensa = new DefensaDeAgua();
	}
	
	@Override
	public String getNombre() {
		return "Ditto Escuirol";
	}
}
