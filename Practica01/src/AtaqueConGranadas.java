public class AtaqueConGranadas implements IAtaqueMeganman {
    public void ataca(Korby kirby, Ditto dittu){
	kirby.setVida(kirby.getVida() - 25);
	dittu.setVida(dittu.getVida() - 25);
    }
}
