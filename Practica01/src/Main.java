
public class Main {
	
	public static void main(String [] args) {
		CampoDeBatalla batalla1 = new CampoDeBatalla();

		Espectador a101 = new Espectador("a101", "Fulanos", "a");
		Espectador b202 = new Espectador("b202", "Menganos", "a");
		Espectador c303 = new Espectador("c303", "Zutanos", "a");
		Espectador d404 = new Espectador("d404", "Policarpios", "a");
		
		batalla1.registrar(a101);
		batalla1.registrar(b202);
		batalla1.registrar(c303);
		batalla1.registrar(d404);
		
		batalla1.setMensaje("Empieza el combate 1er ronda");
		batalla1.notificar();
		
		batalla1.dittu.realizaAtaque(batalla1.kirby, batalla1.megaman);
		batalla1.kirby.realizaDefensa(batalla1.kirby);
		batalla1.megaman.realizaDefensa(batalla1.megaman);
		
		batalla1.notificar();
		
		batalla1.setMensaje("Cae un poder y dittu lo Korby lo agarra");
		batalla1.transformaciones(new KorbyKong(batalla1.kirby.getVida()));
			
		
		batalla1.actualidad();
		
	}
	
	

}
