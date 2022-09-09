
public class DefensaRepeliendo implements IDefensaMeganman {

	@Override
	public void defiende(Meganman m){
		if(m.getVida() > 0)
			m.setVida(m.getVida() + 8);
	}
}
