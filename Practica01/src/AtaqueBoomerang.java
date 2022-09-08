public class AtaqueBoomerang implements IAtaqueMeganman {
    public void ataca(Korby kirby, Ditto dittu){
    	kirby.setVida(kirby.getVida() - 15);
    	dittu.setVida(dittu.getVida() - 15);
    }
}
