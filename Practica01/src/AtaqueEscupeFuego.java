
public class AtaqueEscupeFuego implements IAtaqueDitto {

	@Override
	public void ataca(Korby kirby, Meganman megaman) {
		kirby.setVida(kirby.getVida() - 25);
		megaman.setVida(megaman.getVida() - 25);		
	}

}
