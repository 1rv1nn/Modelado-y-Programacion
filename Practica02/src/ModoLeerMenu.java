/**
* Clase ModoLeerMenu que implementa de EstadoRobot 
* 
* @author Cruz González Irvin Javier
* @author Ugalde Flores Jimena
* @author Ugalde Ubaldo Fernando
* 
* @version 1.0
* @since Modelado y Programacion 2023-1
*/ 

class ModoLeerMenu implements EstadoRobot{

    Robot walle; 

    public ModoLeerMenu(Robot walle){
        this.walle=walle;
       }



  /**
   * Metodo que verifica si el robot esta activado 
   */
  @Override
  public void activar(){
    System.out.println("***MODO Cocinar***\nWall-e ya esta activado");
  }

  /**
   * Metodo que verifica si el robot esta en movimiento 
   */
  @Override
  public void caminar(){
    System.out.println("***MODO Cocinar***\nWall-e NO puede caminar mientras tomo una orden");
  }

   /**
    * Metodo que verifica si el robot esta cocinando 
    */
   @Override
   public void cocinar(){
    System.out.println("***MODO Cocinar***\nWall-e NO puede cocinar mientras toma una orden");
   }

   /**
    * Metodo que verifica si el robot esta tomando una orden
    */
  @Override
  public void mostrarMenu(){
    if(!walle.getOrdenCompleta()){
      walle.ordenCompletada();
      System.out.println("***MODO Cocinar***\nWall-e Esta tomando una orden");
    }else{
      System.out.println("***MODO Cocinar***\nWall-e ha acabado de tomar la orden");
    }
  }

   /** 
    * Metodo que verifica si el robot esta en suspencion 
    */
   @Override
   public void suspender(){
    if(!walle.getOrdenCompleta()){
      System.out.println("***MODO Cocinar***\nWall-e NO ha acabado de tomar la orden");
    }else{
      System.out.println("***MODO Cocinar***\nWall-e esta suspendido");
      walle.asignarNuevoEstado(walle.getEstadoSuspendido());
    }
   }
}