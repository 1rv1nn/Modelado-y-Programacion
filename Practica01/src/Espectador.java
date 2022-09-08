public class Espectador implements Observador {
    String idViewer;
    String peleadorFavorito;
    String resumen;
    CampoDeBatalla stream;
    
    public Espectador(String idViewer, String peleadorFavorito) {
	this.idViewer = idViewer;
	this.peleadorFavorito = peleadorFavorito;
    }

    public void actualizar() {
	resumen = stream.getMensaje();
    }

    public void desconectarse() {
	stream.remover();
    }
}