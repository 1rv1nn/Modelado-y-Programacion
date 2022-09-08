public class AtaqueSimpleMeganman implements IAtaqueMeganman {
    public void ataca(Korby kirby, Ditto dittu){
	kirby.setVida(kirby.getVida() - 10);
	dittu.setVida(dittu.getVida() - 10);
    }
}
