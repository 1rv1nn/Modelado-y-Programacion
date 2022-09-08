
public class DefensaBarril implements IDefensaKorby {

	@Override
	public void defiende(Korby kirby) {
	    kirby.setVida(kirby.getVida() + 9);		
	}

}
