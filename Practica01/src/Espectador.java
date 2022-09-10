import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

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
    public Espectador(String idViewer, String peleadorFavorito, String username, CampoDeBatalla stream) {
    	this.idViewer = idViewer;
    	this.peleadorFavorito = peleadorFavorito;
    	this.username = username;
    	this.stream = stream;
    }
    
    public String getUser() {
    	return username;
    }

    /*
     * actualizar
     */
    public void actualizar() {
    	resumen = stream.getMensaje();
    	verDirecto();
    }

    /*
     * desconectarse
     */
    public void desconectarse() {
    	stream.remover(this);
    }
    
    public void creaTXT() {
    	String archivo = "";
    	String nombreArchivo = "stream--" + username + ".txt";
    	try {
    		
    		File f = new File(nombreArchivo);
    		if(f.exists() && !f.isDirectory()) {
    			BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo)); 
    			String line = "";
    			while((line = reader.readLine()) != null) {
    				archivo += (line + "\n");
    			}
    			reader.close();
    		}
    		archivo += (resumen + "\n");
    		BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
			writer.write(archivo);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void verDirecto() {
    	System.out.println("ID: " + idViewer
    			+ "\nPeleador favorito: " + peleadorFavorito
    			+ "\nHola " + username 
    			+ "\nLo que ha pasado es: \n" + resumen);
    }
}
