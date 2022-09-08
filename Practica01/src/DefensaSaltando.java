public class DefensaSaltando implements IDefensaMeganman {
	@Override
	public void defiende(Meganman m) {
		m.setVida(m.getVida() + 7);
	}
}
