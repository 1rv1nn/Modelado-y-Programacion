/**
 * Clase que simula el objectivo de un robot
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * 
 * @version 1.0
 * @since Modelado y Programacion 2023-1
 */ 
public class Objetivo{

    /* Indica la distacia que camina el robot a un mesa */
    private int distanciaAlaMesa;

    /* Indica el tiempo que faltar para concluir el alimento*/
    private int tiempoComida;

    /*Indica la distacia del robot */
    private int distaciaActual;

    private int comidaLista;

    /**Indica si ya se tomo la orden del menú */
    private boolean orden;


    public Objetivo(int distanciaAlaMesa,int tiempoComida){
        this.distanciaAlaMesa=distanciaAlaMesa;
        this.tiempoComida=tiempoComida;
    }

    /*getDistancia
     * @return distanciaAlaMesa
     */
    public int getDistancia () {
        return distanciaAlaMesa;
    }


    /**getTiempoComida
     * @return el tiempo en que tarda en hacer la comida
     */
    public int getTiempoComida (){
        return tiempoComida;
    }

    public void setTiempoComida(int tiempoComida){
        this.tiempoComida=tiempoComida;
    }

    /*getDistanciaActual
     * @return distanciaActual
     */
    public int getDistanciaActual(){
        return distaciaActual;
    }

    /*getComida
     * @return comidaLista
     */
    public int getComida(){
        return comidaLista;
    }

    /**getOrdenCompletada
     * @return la orden 
     */
    public boolean getOrden(){
        return orden;
    }

    public void setOrden(boolean orden){
        this.orden=orden;
    }

}