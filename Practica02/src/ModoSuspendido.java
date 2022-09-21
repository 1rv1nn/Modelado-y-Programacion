 /**
 * Clase Modo suspendido que implementa de EstadoRobot 
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * 
 * @version 1.0
 * @since Modelado y Programacion 2023-1
 */ 
 
 
 class ModoSuspendido implements EstadoRobot {
   Robot walle; 


   /**
    * Crea un modoSuspendido 
    * @param walle
    */
   public ModoSuspendido(Robot walle){
    this.walle=walle;
   }


   /**Metodo que verifica si el robot esta activado */
   @Override
   public void activar(){
    if(walle.getUbicacionCorrecta() && walle.getCocinar() && walle.getCamina() && walle.getEntrega()){
        System.out.println("*** MODO SUSPENDIDO ***\n Wall-e ha terminado su servicio. Gracias");
        walle.asignarNuevoEstado(walle.getEstadoEncendido());
     } else{
            System.out.println("***MODO ENCENDIDO*** \n Wall-e esta a la espera de su orden.");
        }
   }




   /**Metodo que vefifica si el robot esta caminando*/
   @Override
   public void caminar(){
    if(walle.getUbicacionCorrecta() && walle.getCocinar() && walle.getCamina() && walle.getEntrega()){
      System.out.println("*** MODO SUSPENDIDO ***\n Wall-e ha terminado su servicio. Gracias");
      walle.asignarNuevoEstado(walle.getEstadoEncendido());
    }else{
      if(walle.getOrdenRecibida()){
        System.out.println("*** MODO ACTIVADO *** \n Wall-e camina a la mesa del cliente." );
        walle.asignarNuevoEstado(walle.getEstadoCamina());
      }else{
        if(walle.getOrdenRecibida()&&walle.getCocinar()){
          System.out.println("*** MODO ACTIVADO ***\n Wall-e NO puede caminar mientras cocina ");
          walle.asignarNuevoEstado(walle.getEstadoCamina());
        }else{
          if(walle.getOrdenRecibida() && walle.getUbicacionCorrecta()){
            System.out.println("*** MODO ACTIVADO ***\n Wall-e NO puede caminar mientras estas ordenando ");
            walle.asignarNuevoEstado(walle.getEstadoCamina());
          }else{
            System.out.println("*** MODO ACTIVADO ***\n Wall-e NO ha recibido una orden.Pasara al MODO SUSPENDIDO ");
            walle.asignarNuevoEstado(walle.getEstadoSuspendido());
          }
        }
      }
    }
    }


    /**Metodo que vefifica si el robot esta cocinado*/
    @Override
   public void cocinar(){
    if(walle.getUbicacionCorrecta() && walle.getCocinar() && walle.getCamina() && walle.getEntrega()){
      System.out.println("*** MODO SUSPENDIDO ***\n Wall-e ha terminado su servicio. Gracias");
      walle.asignarNuevoEstado(walle.getEstadoEncendido());
    }else{
      if(walle.getOrdenRecibida()){
        System.out.println("*** MODO ACTIVADO *** \n Wall-e empieza a cocinar." );
        walle.asignarNuevoEstado(walle.getEstadoCocina());
      }else{
        if(walle.getOrdenRecibida()&&walle.getCamina()){
          System.out.println("*** MODO ACTIVADO ***\n Wall-e NO puede cacinar mientras camina ");
          walle.asignarNuevoEstado(walle.getEstadoCocina());
        }else{
          if(walle.getOrdenRecibida() && walle.getUbicacionCorrecta()){
            System.out.println("*** MODO ACTIVADO ***\n Wall-e NO puede cocinar mientras esta pidiendo una orden ");
            walle.asignarNuevoEstado(walle.getEstadoCocina());
          }else{
            System.out.println("*** MODO ACTIVADO ***\n Wall-e NO ha recibido una orden.Pasara al MODO SUSPENDIDO ");
            walle.asignarNuevoEstado(walle.getEstadoSuspendido());
          }
        }
      }
    }
    }


    /**Metodo que vefifica si el robot esta tomando una orden*/
    @Override
   public void mostrarMenu(){
    if(walle.getUbicacionCorrecta() && walle.getCocinar() && walle.getCamina() && walle.getEntrega()){
      System.out.println("*** MODO SUSPENDIDO ***\n Wall-e ha terminado su servicio. Gracias");
      walle.asignarNuevoEstado(walle.getEstadoEncendido());
    }else{
      if(walle.getOrdenRecibida()){
        System.out.println("*** MODO ACTIVADO *** \n Wall-e esta tomando una orden." );
        walle.asignarNuevoEstado(walle.getEstadoLeeMenu());
      }else{
        if(walle.getOrdenRecibida()&&walle.getCocinar()){
          System.out.println("*** MODO ACTIVADO ***\n Wall-e NO puede cocinar mientras esta pidiendo una orden  ");
          walle.asignarNuevoEstado(walle.getEstadoLeeMenu());
        }else{
          if(walle.getOrdenRecibida() && walle.getCamina()){
            System.out.println("*** MODO ACTIVADO ***\n Wall-e NO puede caminar mientras estas ordenando ");
            walle.asignarNuevoEstado(walle.getEstadoLeeMenu());
          }else{
            System.out.println("*** MODO ACTIVADO ***\n Wall-e NO ha recibido una orden.Pasara al MODO SUSPENDIDO ");
            walle.asignarNuevoEstado(walle.getEstadoSuspendido());
          }
        }
      }
    }
  }

   /**Metodo que vefifica si el robot esta en suspencion*/  
   public void suspender(){
    if(walle.getUbicacionCorrecta() && walle.getCocinar() && walle.getCamina() && walle.getEntrega()){
      System.out.println("*** MODO SUSPENDIDO ***\n Wall-e ha terminado su servicio. Gracias");
      walle.asignarNuevoEstado(walle.getEstadoEncendido());
    }else{
      System.out.println("*** MODO SUSPENDIDO ***\n Wall-e esta suspendido");
      walle.asignarNuevoEstado(walle.getEstadoSuspendido());
    }
}








 }
