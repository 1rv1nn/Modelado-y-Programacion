/*
* Clase Modo suspendido que implementa de EstadoRobot 
* 
* @author Cruz González Irvin Javier
* @author Ugalde Flores Jimena
* @author Ugalde Ubaldo Fernando
* 
* @version 1.0
* @since Modelado y Programacion 2023-1
*/ 

class ModoMovimiento implements EstadoRobot{

    Robot walle; 

    /**
     * Crea un modoMovimiento
     * @param walle
     */
    public ModoMovimiento(Robot walle){
        this.walle=walle;
       }


  /*Metodo que verifica si el robot esta activado */
  @Override
  public void activar(){
   System.out.println("***MODO MOVIMIENTO***\n Wall-e esta activado");
  }

  /*Metodo que verifica si el robot esta en movimiento */
  @Override
  public void caminar(){
    if(!walle.getUbicacionCorrecta()){
      walle.reducirDistancia();
      System.out.println("***MODO MOVIMIENTO***\n Wall-e camina a un una mesa del cliente");
    }else{
      System.out.println("***MODO MOVIMIENTO***\n Wall-e ha llegado a la mesa del cliente");
    }
 
  }

   /*Metodo que verifica si el robot esta cocinando */
   @Override
   public void cocinar(){
    if(!walle.getUbicacionCorrecta()){
      System.out.println("***MODO MOVIMIENTO***\n Wall-e aún no puede cocinar");
    }else{
      System.out.println("***MODO MOVIMIENTO***\n Wall-e esta cocinando");
      walle.asignarNuevoEstado(walle.getEstadoCocina());
    }
   }

    /*Metodo que verifica si el robot esta tomando una orden*/
  @Override
  public void mostrarMenu(){
    if(!walle.getUbicacionCorrecta()){
      System.out.println("***MODO MOVIMIENTO***\n Wall-e no puede mostar el menú al cliente");
    }else{
      System.out.println("***MODO MOVIMIENTO***\n Wall-e esta tomando una orden");
      walle.asignarNuevoEstado(walle.getEstadoLeeMenu());
    }
  }

   /*Metodo que verifica si el robot esta en suspencion */
   @Override
   public void suspender(){
    System.out.println("***MODO MOVIMIENTO***\n Wall-e esta en modo suspendido");
    walle.asignarNuevoEstado(walle.getEstadoSuspendido());
   }


}