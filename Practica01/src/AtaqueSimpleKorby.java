
public class AtaqueSimpleKorby implements IAtaqueKorby {

	@Override
	public void ataca(Ditto dittu, Meganman megaman) {
		dittu.setVida(dittu.getVida() - 10);
		megaman.setVida(megaman.getVida() - 10);
	}
	
}
