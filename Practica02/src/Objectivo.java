/*
 * Clase que simula el objectivo de un robot
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * 
 * @version 1.0
 * @since Modelado y Programacion 2023-1
 */ 
public class Objectivo{

    /* Indica la distacia que camina el robot a un mesa */
    private int distanciaAlaMesa;

    /* Indica el tiempo que faltar para concluir el alimento*/
    private int tiempoComida;

    /*Indica la distacia del robot */
    private int distaciaActual;

    private int comidaLista;


    public Objectivo(int distanciaAlaMesa,int tiempoComida){
        this.distanciaAlaMesa=distanciaAlaMesa;
        this.tiempoComida=tiempoComida;
    }

    public int getDistancia () {
        return distanciaAlaMesa;
    }


    public int getTiempoComida (){
        return tiempoComida;
    }

    public int getDistanciaActual(){
        return distaciaActual;
    }

    public int getComida(){
        return comidaLista;
    }
}