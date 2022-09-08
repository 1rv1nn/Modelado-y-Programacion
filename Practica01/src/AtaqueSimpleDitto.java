
public class AtaqueSimpleDitto implements IAtaqueDitto {

	@Override
	public void ataca(Korby kirby, Meganman megaman) {
		kirby.setVida(kirby.getVida() - 10);
		megaman.setVida(megaman.getVida() - 10);
	}

}
