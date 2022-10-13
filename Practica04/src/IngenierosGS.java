/**
 * Clase que implementa builder; es decir, quién crea la nave especial. 
 * 
 * @author Cruz González, Irvin Javier
 * @author Ugalde Flores, Jimena
 * @author Ugalde Ubaldo, Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
public class IngenierosGS {
    protected SistemaDePropulacion sistemaDePropulacion;
    protected Blindaje blindaje;
    protected Cabina cabina;
    protected Armas armas;

    /**
     * Método para establecer el sistem de propulción de la nave.
     * @param sistemaDePropulacion Sistema de propulción de la nave.
     */
    public IngenierosGS setSistemaDePropulcion(final SistemaDePropulacion sistemaDePropulacion){
        this.sistemaDePropulacion = sistemaDePropulacion;
        return this;
    }

    /**
     * Método para establecer el blindaje de la nave.
     * @param blindaje Blindaje de la nave.
     */
    public IngenierosGS setBlindaje(final Blindaje blindaje){
        this.blindaje = blindaje;
        return this;
    }

    /**
     * Método para estabelcer el tipo de cabina de la nave.
     * @param cabina Tipo de cabina de la nave.
     */
    public IngenierosGS setCabina(final Cabina cabina){
        this.cabina = cabina;
        return this;
    }

    /**
     * Método para establecer el tipo de armas que usa la nave.
     * @param armas Armas que usa la nave.
     */
    public IngenierosGS setArmas(final Armas armas){
        this.armas = armas;
        return this;
    }

    /**
     * Método que construye la nave espacial.
     * @return NaveEspacial La nave espacial construida con las específicaciones requeridas.
     */
    public NaveEspacial construye(){
        return new NaveEspacial(this);
    }
}
