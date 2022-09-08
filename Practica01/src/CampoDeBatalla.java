import java.util.Random;

public class CampoDeBatalla implements Sujeto {
    Meganman megaman;
    Korby kirby;
    Dittu ditto;
    List<Espectador> espectadoresActuales;
    String mensaje;

    void transformaciones(Meganman megaman){
	this.megaman = megaman;
    }

    void transformaciones(Korby kirby) {
	this.kirby = kirby;
    }

    void transformaciones(Dittu ditto) {
	this.ditto = ditto;
    }

    Random rand = new Random();

    // If random = 0 then megaman, else random = 1 then kirby else ditto;
    int random = rand.nextInt(2 - 0 + 1) + 0;
    
    while(ditto.getVida() != 0 && kirby.getVida() != 0 && megaman.getVida() != 0) {
	
    }
}
