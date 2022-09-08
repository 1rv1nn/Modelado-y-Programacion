public class AtaqueBolasDeFuego implements IAtaqueMeganman {
    public void ataca(Korby kirby, Ditto dittu){
	kirby.setVida(kirby.getVida() - 20);
	dittu.setVida(dittu.getVida() - 20);
    }
}
