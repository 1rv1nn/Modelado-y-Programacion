/**
 * Clase que simula los comportamientos de un robot mesero
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * 
 * @version 1.0
 * @since Modelado y Programacion 2023-1
 */ 

 /*
  * EstadoRobot
  * 
  */
   
 public interface EstadoRobot{
    public void activar();
    public void caminar(); 
    public void cocinar();
    public void mostrarMenu();
    public void suspender();
 }