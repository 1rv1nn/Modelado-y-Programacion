
public class DefensaSimpleKorby implements IDefensaKorby {

	@Override
	public void defiende(Korby kirby) {
		if(kirby.getVida() > 0)	
			kirby.setVida(kirby.getVida() + 5);
	}

}
