
public class DefensaDeFlores implements IDefensaDitto{

	@Override
	public void defiende(Ditto dittu) {
		dittu.setVida(dittu.getVida() + 7);		
	}

}
