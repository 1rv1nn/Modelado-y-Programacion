import java.util.ArrayList;
import java.util.Random;

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
		mensaje = nuevaRonda;
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
