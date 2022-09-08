
public class DefensaConFlechas implements IDefensaKorby {

	@Override
	public void defiende(Korby kirby) {
	    kirby.setVida(kirby.getVida() + 7);		
	}

}
