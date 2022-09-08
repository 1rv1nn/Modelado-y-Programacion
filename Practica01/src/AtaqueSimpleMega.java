

public class AtaqueSimpleMega implements IAtaqueMeganman {
    
	@Override
	public void ataca(Korby kirby, Ditto dittu){
	kirby.setVida(kirby.getVida() - 10);
	dittu.setVida(dittu.getVida() - 10);
    }
}
