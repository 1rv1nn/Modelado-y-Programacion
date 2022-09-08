
public class DefensaDeFuego implements IDefensaMeganman {

	@Override
	public void defiende(Meganman m) {
		m.setVida(m.getVida() + 10);		
	}
}
