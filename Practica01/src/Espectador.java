public class Espectador implements Observador {
    String idViewer;
    String peleadorFavorito;
    String resumen;
    String username;
    CampoDeBatalla stream;
    
    public Espectador(String idViewer, String peleadorFavorito, String username) {
    	this.idViewer = idViewer;
    	this.peleadorFavorito = peleadorFavorito;
    	this.username = username;
    	stream = new CampoDeBatalla();
    }

    public void actualizar() {
    	resumen = stream.getMensaje();
    }

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
