
public class DefensaDeAgua implements IDefensaDitto {

	@Override
	public void defiende(Ditto dittu) {
		dittu.setVida(dittu.getVida() + 10);		
	}

}
