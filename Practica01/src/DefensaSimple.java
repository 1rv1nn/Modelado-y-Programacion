
public class DefensaSimple implements IDefensaDitto {

	@Override
	public void defiende(Ditto dittu) {
	    dittu.setVida(dittu.getVida() + 5);		
	}
	
}
