/*
 * Clase que simula la mesa de un comensal
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * 
 * @version 1.0
 * @since Modelado y Programacion 2023-1
 */ 
public class MesaComensal{

    /*Verifica la distacia que camina el robot a un mesa */
    private int distanciaAlaMesa;
    

    public MesaComensal(int distanciaAlaMesa){
        this.distanciaAlaMesa=distanciaAlaMesa;
    }

    public int getDistancia () {
        return distanciaAlaMesa;
    }

    
}