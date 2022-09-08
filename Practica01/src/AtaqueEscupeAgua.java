
public class AtaqueEscupeAgua implements IAtaqueDitto {

	@Override
	public void ataca(Korby kirby, Meganman megaman) {
		kirby.setVida(kirby.getVida() - 20);
		megaman.setVida(megaman.getVida() - 20);		
	}

}
