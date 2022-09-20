 /*
 * Clase Modo Encendido que implementa de EstadoRobot 
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * 
 * @version 1.0
 * @since Modelado y Programacion 2023-1
 */ 

class ModoEncendido implements EstadoRobot{

    Robot walle; 

    public ModoEncendido(Robot walle){
        this.walle=walle;
       }


   /*Metodo que verifica si el robot esta activado */
   @Override
   public void activar(){
    if(walle.getOrdenRecibida() && walle.getUbicacionCorrecta() && walle.getComidaAcabada() && walle.getEntrega()){
        System.out.println("***MODO ENCENDIDO***\nWall-e esta encendido");
    }else{
        System.out.println("***MODO ENCENDIDO***\nWall-e esta suspendido");
        walle.ingresaOrden();
        walle.asignarNuevoEstado(walle.getEstadoSuspendido());
    }
   }

   /*Metodo que verifica si el robot esta en movimiento */
   @Override
   public void caminar(){
    if(walle.getOrdenRecibida() && walle.getUbicacionCorrecta() && walle.getComidaAcabada() && walle.getEntrega())
        if(walle.getOrdenRecibida() && walle.getUbicacionCorrecta() && walle.getComidaAcabada() && walle.getEntrega())
            System.out.println("***MODO ENCENDIDO***\nWall-e ha terminado su trabajo");
        else{
            System.out.println("***MODO ENCENDIDO***\nWall-e no puede caminar si esta prendido,debe ser activado");  
        }        
   }

    /*Metodo que verifica si el robot esta cocinando */
    @Override
    public void cocinar(){
        if(walle.getOrdenRecibida() && walle.getUbicacionCorrecta() && walle.getComidaAcabada() && walle.getEntrega())
        System.out.println("***MODO ENCENDIDO***\nWall-e ha terminado su trabajo");
        else{
            System.out.println("***MODO ENCENDIDO***\nWall-e no puede cocinar si esta prendido,debe ser activado");  
        }  
    }

     /*Metodo que verifica si el robot esta tomando una orden*/
   @Override
   public void mostrarMenu(){
    if(walle.getOrdenRecibida() && walle.getUbicacionCorrecta() && walle.getComidaAcabada() && walle.getEntrega())
    System.out.println("***MODO ENCENDIDO***\nWall-e ha terminado su trabajo");
    else{
    System.out.println("***MODO ENCENDIDO***\nWall-e no puede mostrar el menú si esta prendido,debe ser activado");  
   }
}

    /*Metodo que verifica si el robot esta en suspencion */
    @Override
    public void suspender(){
        System.out.println("***MODO ENCENDIDO***\nWall-e esta suspendido");  
    }


}