
public class DefensaSimpleDitto implements IDefensaDitto {

	@Override
	public void defiende(Ditto dittu) {
		if(dittu.getVida() > 0)
			dittu.setVida(dittu.getVida() + 5);		
	}
	
}
