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

    private int comidaPorHacer;

    /**Indica la cantidad de alimentos que tiene una orden */
    private int orden;


    /**
     * Crea un objetivo
     * @param distanciaAlaMesa 
     * @param tiempoComida 
     */
    public Objetivo(int distanciaAlaMesa,int tiempoComida){
        this.distanciaAlaMesa=distanciaAlaMesa;
        this.tiempoComida=tiempoComida;
    }

    /**getDistancia
     * @return distanciaen que camina ala mesa
     */
    public int getDistancia () {
        return distanciaAlaMesa;
    }

    /** setDistancia 
     * 
    */
    public void setDistancia(int distanciaAlaMesa){
        this.distanciaAlaMesa=distanciaAlaMesa;
    }


    /**getTiempoComida
     * @return el tiempo en que tarda en hacer la comida
     */
    public int getTiempoComida (){
        return comidaPorHacer;
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
        return comidaPorHacer;
    }

    /**getOrdenCompletada
     * @return la orden 
     */
    public int getOrden(){
        return orden;
    }

    public void setOrden(int orden){
        this.orden=orden;
    }

}