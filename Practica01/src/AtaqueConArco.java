
public class AtaqueConArco implements IAtaqueKorby {

	@Override
	public void ataca(Ditto dittu, Meganman megaman) {
		dittu.setVida(dittu.getVida() - 20);
		megaman.setVida(megaman.getVida() - 20);
	}
	
	
}
