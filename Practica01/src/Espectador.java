/**
 * Clase Espectador que implements de Observador 
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */
public class Espectador implements Observador {

    /*id */
    String idViewer;
    /*peleador favorito */
    String peleadorFavorito;
    /*resumen */
    String resumen;
    /*usuario */
    String username;
    CampoDeBatalla stream;
    
    /*
     * Crea un espectador
     * @param idViewer
     * @param peleadorFavorito
     * @param username
     */
    public Espectador(String idViewer, String peleadorFavorito, String username) {
    	this.idViewer = idViewer;
    	this.peleadorFavorito = peleadorFavorito;
    	this.username = username;
    	stream = new CampoDeBatalla();
    }

    /*
     * actualizar
     */
    public void actualizar() {
    	resumen = stream.getMensaje();
    }

    /*
     * desconectarse
     */
    public void desconectarse() {
    	stream.remover(this);
    }
    
    public void verDirecto() {
    	System.out.println("Username: " + username
    			+ "\nID: " + idViewer
    			+ "\nPeleador favorito: " + peleadorFavorito 
    			+ "\n Lo que ha pasado es: " + resumen);
    }
}
