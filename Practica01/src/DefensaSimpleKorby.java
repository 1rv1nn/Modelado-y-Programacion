
public class DefensaSimpleKorby implements IDefensaKorby {

	@Override
	public void defiende(Korby kirby) {
	    kirby.setVida(kirby.getVida() + 5);
	}

}