/**
 * Clase MegaMan
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */

 public class MegaMan implements Personaje{

     /*Nombre del personaje */
     private String nombre="MeganMan";

     /**objecto especial 1 */
     private String obj1="";

      /**objecto especial 2 */
      private String obj2="";

       /**objecto especial 3 */
     private String obj3="";

     @Override
     public String mostrarInformacion(){
        return ("Nombre:"+getNombre()+ "\n");
     }

     public String getNombre() {
        return nombre;
    }
 
     public static void main(String[] args) {
         MegaMan mm=new MegaMan();
         System.out.println(mm.mostrarInformacion());
     }


 }