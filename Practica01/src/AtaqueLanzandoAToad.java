
public class AtaqueLanzandoAToad implements IAtaqueKorby {

	@Override
	public void ataca(Ditto dittu, Meganman megaman) {
		dittu.setVida(dittu.getVida() - 15);
		megaman.setVida(megaman.getVida() - 15);		
	}
	
	
	
}
