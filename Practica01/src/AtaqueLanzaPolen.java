
public class AtaqueLanzaPolen implements IAtaqueDitto {

	@Override
	public void ataca(Korby kirby, Meganman megaman) {
		kirby.setVida(kirby.getVida() - 15);
		megaman.setVida(megaman.getVida() - 15);		
	}

}
