
public class DefensaVolando implements IDefensaDitto {

	@Override
	public void defiende(Ditto dittu) {
		if(dittu.getVida() > 0)
			dittu.setVida(dittu.getVida() + 10);		
	}

}
