import java.util.List;
import java.util.Random;

public class CampoDeBatalla implements Sujeto {
    Meganman megaman;
    Korby kirby;
    Ditto dittu;
    List<Espectador> espectadoresActuales;
    String mensaje;

    void transformaciones(Meganman megaman){
	this.megaman = megaman;
    }

    void transformaciones(Korby kirby) {
	this.kirby = kirby;
    }

    void transformaciones(Ditto dittu) {
	this.dittu = dittu;
    }

    Random rand = new Random();

    // If random = 0 then megaman, else random = 1 then kirby else ditto;
    int random = rand.nextInt(2 - 0 + 1) + 0;
    
}
