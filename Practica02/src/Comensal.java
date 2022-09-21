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
public class Comensal{

    /*Verifica la distacia que camina el robot a un mesa */
    private int distanciaAlaMesa;
    

    public Comensal(int distanciaAlaMesa){
        this.distanciaAlaMesa=distanciaAlaMesa;
    }

    public int getDistancia () {
        return distanciaAlaMesa;
    }
}