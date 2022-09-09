
public class DittoBasico extends Ditto{
	public DittoBasico() {
	    this.vida = 100;
	    ataque = new AtaqueSimpleDitto();
	    defensa = new DefensaSimpleDitto();
	}
	
	@Override
	public String getNombre() {
		return "Ditto Basico";
	}
}
