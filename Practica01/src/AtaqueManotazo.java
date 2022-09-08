
public class AtaqueManotazo implements IAtaqueKorby {

	@Override
	public void ataca(Ditto dittu, Meganman megaman) {
		dittu.setVida(dittu.getVida() - 25);
		megaman.setVida(megaman.getVida() - 25);
	}

}
