/**
* Clase ModoCocinar que implementa de EstadoRobot 
* 
* @author Cruz González Irvin Javier
* @author Ugalde Flores Jimena
* @author Ugalde Ubaldo Fernando
* 
* @version 1.0
* @since Modelado y Programacion 2023-1
*/ 

class ModoCocinar implements EstadoRobot{


    Robot walle; 

    /**
     * Crea el modoCocinar
     * @param walle
     */
    public ModoCocinar(Robot walle){
        this.walle=walle;
       }


  /*Metodo que verifica si el robot esta activado */
  @Override
  public void activar(){
    System.out.println("***MODO COCINAR***\nWall-e esta activado");
  }

  /*Metodo que verifica si el robot esta en movimiento */
  @Override
  public void caminar(){
    System.out.println("***MODO COCINAR***\nWall-e NO puede caminar mientras cocina");
 
  }

   /** Metodo que verifica si el robot esta cocinando */
   @Override
   public void cocinar(){
    if(!walle.getComidaAcabada()){
      walle.reducirComida();
      System.out.println("***MODO COCINAR***\nWall-e esta cocinando.");
    }else{
      System.out.println("***MODO COCINAR***\nWall-e ha terminado de cocinar");
    }
   }

    /** Metodo que verifica si el robot esta tomando una orden*/
  @Override
  public void mostrarMenu(){
    if(!walle.getComidaAcabada()){
      System.out.println("***MODO COCINAR***\nWall-e NO ha terminado de cocinar");
    }else{
      System.out.println("***MODO COCINAR***\nWall-e tomará una orden");
      walle.asignarNuevoEstado(walle.getEstadoLeeMenu());
    }
  }

   /** Metodo que verifica si el robot esta en suspencion */
   @Override
   public void suspender(){
    if(!walle.getComidaAcabada()){
      System.out.println("***MODO COCINAR***\nWall-e NO se puede suspender mientras cocina");
    }else{
      System.out.println("***MODO COCINAR***\nWall-e termino de cocinar pasará al MODO SUSPENDIDO");
      walle.asignarNuevoEstado(walle.getEstadoSuspendido());
    }
    
   }


}