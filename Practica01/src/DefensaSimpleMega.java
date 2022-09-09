
public class DefensaSimpleMega implements IDefensaMeganman {
	
	@Override
	public void defiende(Meganman m){
		if(m.getVida() > 0)
			m.setVida(m.getVida() + 5);
	}
}
