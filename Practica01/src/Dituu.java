/**
 * Clase Dituu
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */

 public class Dituu implements Personaje{
     /*Nombre del personaje */
     private String nombre="Dittu";





    
     public String getNombre() {
         return nombre;
     }

     
     @Override
     public String mostrarInformacion(){
        return ("Nombre:"+getNombre()+ "\n");
     }

    


     public static void main(String[] args) {
        Dituu dt=new Dituu();
        System.out.println(dt.mostrarInformacion());
    }
    
 }