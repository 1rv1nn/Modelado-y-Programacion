import java.util.ArrayList;

/**
 * Clase que implementa una nave espacial. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class NaveEspacial {
    private final SistemaDePropulacion sistemaDePropulacion;
    private final Blindaje blindaje;
    private final Cabina cabina;
    private final Armas armas;
    private ArrayList<Componente> componentes = new ArrayList<>();

    /**
     * Método constructor de la clase.
     * @param ingenierosGS El builder la nave espacial.
     */
    public NaveEspacial(IngenierosGS ingenierosGS){
        this.sistemaDePropulacion = ingenierosGS.sistemaDePropulacion;
        this.blindaje = ingenierosGS.blindaje;
        this.cabina = ingenierosGS.cabina; 
        this.armas = ingenierosGS.armas;
        componentes.add(sistemaDePropulacion);
        componentes.add(blindaje);
        componentes.add(cabina);
        componentes.add(armas);
    }

    /**
     * Método para obtener el precio total de la nave.
     * @return int Precio total en billones de dólares
     */
    public int getPrecio(){
        int precio = 0;

        for (Componente componente : componentes) {
            if(componente == null){
                continue;
            }
            precio += componente.getPrecio();
        }
        return precio;
    }

    /**
     * Método para obtener el poder de ataque de la nave.
     * @return int Poder de ataque.
     */
    public int getAtaque(){
        int ataque = 0;

        for (Componente componente : componentes) {
            if(componente == null){
                continue;
            }
            ataque += componente.sumAtaque();
        }
        return ataque;
    }

    /**
     * Método para obtener el poder de defensa de la nave.
     * @return int Poder de defensa
     */
    public int getDefensa(){
        int defensa = 0;

        for (Componente componente : componentes) {
            if(componente == null){
                continue;
            }
            defensa += componente.sumDefensa();
        }
        return defensa;
    }


    /**
     * Método para obtener la velocidad de la nave.
     * @return int Velocidad de la nave en km/min.
     */
    public int getVelocidad(){
        int velocidad= 0;

        for (Componente componente : componentes) {
            if(componente == null){
                continue;
            }
            velocidad += componente.sumaVelocidad();
        }
        return velocidad;
    }

    /**
     * Método para obtener el peso total de la nave.
     * @return int Peso total en toneladas.
     */
    public int getPeso(){
        int peso = 0;

        for (Componente componente : componentes) {
            if(componente == null){
                continue;
            }
            peso += componente.sumaPeso();
        }
        return peso;
    }

    @Override
    public String toString() {
        String descripcion = "La nave tiene las siguiente propiedades" +
                            "\nVelocidad: " + getVelocidad() + " km/min." +  
                            "\nPeso: " + getPeso() + " toneladas." + 
                            "\nPoder de ataque: " + getAtaque() + 
                            "\nPoder de defensa: " + getDefensa() + 
                            "\nPrecio total: $" + getPrecio() + " billones de USD.";
        return descripcion;
    }
}
