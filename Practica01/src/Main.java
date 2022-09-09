import java.util.Random;

/**
 * Clase main
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class Main {
	
	public static void main(String [] args) {
		CampoDeBatalla batalla = new CampoDeBatalla();

		Espectador a101 = new Espectador("a101", "Megaman", "Cameras", batalla);
		Espectador b202 = new Espectador("b202", "Korby", "House", batalla);
		Espectador c303 = new Espectador("c303", "Dittu", "Willson", batalla);
		Espectador d404 = new Espectador("d404", "Megaman", "foreman", batalla);
		
		batalla.registrar(a101);
		
		Random rand = new Random();
		
		int personajesEstado[] = {0, 0, 0};
		
		int opcion = rand.nextInt(2) + 1;
		
		int i = 1;
		switch(opcion) {
		case 1:
			while(batalla.dittu.getVida() > 0 || batalla.kirby.getVida() > 0 || batalla.megaman.getVida() > 0) {
				int ran = rand.nextInt(3);
				
				if(batalla.dittu.getVida() > 0) {
					batalla.dittu.realizaAtaque(batalla.kirby, batalla.megaman);
					batalla.kirby.realizaDefensa(batalla.kirby);
					batalla.megaman.realizaDefensa(batalla.megaman);
					batalla.setMensaje("Ronda " + i + "." + " Dittu ataca.");
					batalla.notificar();				
				} else {
					personajesEstado[0] = 1;
				}
				
				if(batalla.megaman.getVida() > 0) {
					batalla.megaman.realizaAtaque(batalla.kirby, batalla.dittu);
					batalla.kirby.realizaDefensa(batalla.kirby);
					batalla.dittu.realizaDefensa(batalla.dittu);
					batalla.setMensaje("Ronda " + (++i) + "." + " Megaman ataca.");
					batalla.notificar();
				} else {
					personajesEstado[1] = 1;
				}
				
				if(batalla.kirby.getVida() > 0) {
					batalla.kirby.realizaAtaque(batalla.dittu, batalla.megaman);
					batalla.megaman.realizaDefensa(batalla.megaman);
					batalla.dittu.realizaDefensa(batalla.dittu);
					batalla.setMensaje("Ronda " + (++i) + "." + " Kirby ataca.");
					batalla.notificar();
				} else {
					personajesEstado[2] = 1;
				}
				
				if(ran == 0 && batalla.kirby.getVida() > 0 && batalla.kirby.getNombre() != "Korby Kong") {
					batalla.transformaciones(new KorbyKong(batalla.kirby.getVida()));
					batalla.setMensaje("Kirby absorbe el poder de DK");
					batalla.notificar();
				} else if(ran == 1 && batalla.megaman.getVida() > 0 && batalla.megaman.getNombre() != "Meganman Boomerang") {
					batalla.transformaciones(new MeganmanBoomerang(batalla.megaman.getVida()));
					batalla.setMensaje("Megaman absorbe el poder del Boomerang.");
					batalla.notificar();
				} else if(ran == 2 && batalla.dittu.getVida() > 0 && batalla.dittu.getNombre() != "Ditto Bolbasor") {
					batalla.transformaciones(new DittoSour(batalla.dittu.getVida()));
					batalla.setMensaje("Dittu absorbe el poder de Bulbasaour.");
					batalla.notificar();
				}
				
				int verificacion = 0;
				for(int a : personajesEstado) {
					verificacion += a;
				}
				
				if(verificacion >= 2) {
					break;
				} else {
					verificacion = 0;
				}
			}
			break;
		case 2:
			while(batalla.dittu.getVida() > 0 || batalla.kirby.getVida() > 0 || batalla.megaman.getVida() > 0) {
				int ran = rand.nextInt(3);
				
				if(batalla.dittu.getVida() > 0) {
					batalla.dittu.realizaAtaque(batalla.kirby, batalla.megaman);
					batalla.kirby.realizaDefensa(batalla.kirby);
					batalla.megaman.realizaDefensa(batalla.megaman);
					batalla.setMensaje("Ronda " + i + "." + " Dittu ataca.");
					batalla.notificar();				
				} else {
					personajesEstado[0] = 1;
				}
				
				if(batalla.megaman.getVida() > 0) {
					batalla.megaman.realizaAtaque(batalla.kirby, batalla.dittu);
					batalla.kirby.realizaDefensa(batalla.kirby);
					batalla.dittu.realizaDefensa(batalla.dittu);
					batalla.setMensaje("Ronda " + (++i) + "." + " Megaman ataca.");
					batalla.notificar();
				} else {
					personajesEstado[1] = 1;
				}
				
				if(batalla.kirby.getVida() > 0) {
					batalla.kirby.realizaAtaque(batalla.dittu, batalla.megaman);
					batalla.megaman.realizaDefensa(batalla.megaman);
					batalla.dittu.realizaDefensa(batalla.dittu);
					batalla.setMensaje("Ronda " + (++i) + "." + " Kirby ataca.");
					batalla.notificar();
				} else {
					personajesEstado[2] = 1;
				}
				
				if(ran == 0 && batalla.kirby.getVida() > 0 && batalla.kirby.getNombre() != "Korby Daisy") {
					batalla.transformaciones(new KorbyDaisy(batalla.kirby.getVida()));
					batalla.setMensaje("Kirby absorbe el poder de la princesa Daisy");
					batalla.notificar();
				} else if(ran == 1 && batalla.megaman.getVida() > 0 && batalla.megaman.getNombre() != "Meganman Bombastico") {
					batalla.transformaciones(new MeganmanBombastico(batalla.megaman.getVida()));
					batalla.setMensaje("Megaman absorbe el poder del lanzar bombas.");
					batalla.notificar();
				} else if(ran == 2 && batalla.dittu.getVida() > 0 && batalla.dittu.getNombre() != "Ditto Charizard") {
					batalla.transformaciones(new DittoZard(batalla.dittu.getVida()));
					batalla.setMensaje("Dittu absorbe el poder de Charizard.");
					batalla.notificar();
				}
				
				int verificacion = 0;
				for(int a : personajesEstado) {
					verificacion += a;
				}
				
				if(verificacion >= 2) {
					break;
				} else {
					verificacion = 0;
				}
			}
			break;
			
		case 3:
			while(batalla.dittu.getVida() > 0 || batalla.kirby.getVida() > 0 || batalla.megaman.getVida() > 0) {
				int ran = rand.nextInt(3);
				
				if(batalla.dittu.getVida() > 0) {
					batalla.dittu.realizaAtaque(batalla.kirby, batalla.megaman);
					batalla.kirby.realizaDefensa(batalla.kirby);
					batalla.megaman.realizaDefensa(batalla.megaman);
					batalla.setMensaje("Ronda " + i + "." + " Dittu ataca.");
					batalla.notificar();				
				} else {
					personajesEstado[0] = 1;
				}
				
				if(batalla.megaman.getVida() > 0) {
					batalla.megaman.realizaAtaque(batalla.kirby, batalla.dittu);
					batalla.kirby.realizaDefensa(batalla.kirby);
					batalla.dittu.realizaDefensa(batalla.dittu);
					batalla.setMensaje("Ronda " + (++i) + "." + " Megaman ataca.");
					batalla.notificar();
				} else {
					personajesEstado[1] = 1;
				}
				
				if(batalla.kirby.getVida() > 0) {
					batalla.kirby.realizaAtaque(batalla.dittu, batalla.megaman);
					batalla.megaman.realizaDefensa(batalla.megaman);
					batalla.dittu.realizaDefensa(batalla.dittu);
					batalla.setMensaje("Ronda " + (++i) + "." + " Kirby ataca.");
					batalla.notificar();
				} else {
					personajesEstado[2] = 1;
				}
				
				if(ran == 0 && batalla.kirby.getVida() > 0 && batalla.kirby.getNombre() != "Korby Link") {
					batalla.transformaciones(new KorbyKong(batalla.kirby.getVida()));
					batalla.setMensaje("Kirby absorbe el poder de Link");
					batalla.notificar();
				} else if(ran == 1 && batalla.megaman.getVida() > 0 && batalla.megaman.getNombre() != "Meganman de Fuego") {
					batalla.transformaciones(new MeganmanDeFuego(batalla.megaman.getVida()));
					batalla.setMensaje("Megaman absorbe el poder del Fuego.");
					batalla.notificar();
				} else if(ran == 2 && batalla.dittu.getVida() > 0 && batalla.dittu.getNombre() != "Ditto Escuirol") {
					batalla.transformaciones(new DittoSquirtle(batalla.dittu.getVida()));
					batalla.setMensaje("Dittu absorbe el poder de Squirtle.");
					batalla.notificar();
				}
				
				int verificacion = 0;
				for(int a : personajesEstado) {
					verificacion += a;
				}
				
				if(verificacion >= 2) {
					break;
				} else {
					verificacion = 0;
				}
				break;
			}
		}
	}
}
