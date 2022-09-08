
public class DefensaSimpleMega implements IDefensaMeganman {
	
	@Override
	public void defiende(Meganman m){
	    m.setVida(m.getVida() + 5);
	}
}
