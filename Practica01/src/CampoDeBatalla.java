/**
 * Clase CampoDeBatalla 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
import java.util.ArrayList;

public class CampoDeBatalla implements Sujeto {
    Meganman megaman;
    Korby kirby;
    Ditto dittu;
    ArrayList<Espectador> espectadoresActuales;
    String mensaje;
    
    public CampoDeBatalla() {
    	megaman = new MeganmanBasico();
    	kirby = new KorbyBasico();
    	dittu = new DittoBasico();
    	espectadoresActuales = new ArrayList<>();
    	mensaje = new String();
    }

    public void transformaciones(Meganman megaman){
    	this.megaman = megaman;
    }

    public void transformaciones(Korby kirby) {
    	this.kirby = kirby;
    }

    public void transformaciones(Ditto dittu) {
    	this.dittu = dittu;
    }

    public String getMensaje(){
		return mensaje;
	}

	public void setMensaje(String nuevaRonda){
		mensaje = nuevaRonda + actualidad();
	}
	
	public String actualidad() {
		String infoKirby = new String();
		String infoDittu = new String();
		String infoMega = new String();
		if(kirby.getVida() > 0) {
			infoKirby = " tiene " + kirby.getVida() + " puntos de vida.";
		} else {
			infoKirby = "Kirby ha muerto";
		}
		if(dittu.getVida() > 0) {
			infoDittu = " tiene " + dittu.getVida() + " puntos de vida.";
		} else {
			infoDittu = "Dittu ha muerto";
		}
		if(megaman.getVida() > 0) {
			infoMega = " tiene " + megaman.getVida() + " puntos de vida.";
		} else {
			infoMega = "Megaman ha muerto.";
		}
		
		return "\nVida al momento:  " 
				+ "\n" + kirby.getNombre() + infoKirby
				+ "\n" + dittu.getNombre() + infoDittu
				+ "\n" + megaman.getNombre() + infoMega + "\n";
	}


	@Override
	public void registrar(Espectador viewer) {
		espectadoresActuales.add(viewer);
	}

	@Override
	public void remover(Espectador viewer) {
		espectadoresActuales.remove(viewer);
	}

	@Override
	public void notificar() {
		if(espectadoresActuales.size() > 0){
			System.out.println("****************************************"
				+ "\n********Pantallas de espectadores.********\n"
				+ "****************************************");
			for(Espectador c : espectadoresActuales){
				c.actualizar();
			}
		}		
	}
    
}
