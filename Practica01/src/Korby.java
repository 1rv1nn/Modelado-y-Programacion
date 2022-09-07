/**
 * Clase Korby
 * 
 * @author Cruz Gonzalez Irvin Javier
 * @author Ugalde Ubaldo Fernando
 * @author Ugalde Flores Jimena
 * @since Modelado y Programacion 2023-3
 * @version 1.0
 * 
 */

 public class Korby implements Personaje{

    /*Nombre del personaje */
    private String nombre="Korby";


      /**objecto especial 1 */
      private String obj1="guante";

      /**objecto especial 2 */
      private String obj2="sombrero";

       /**objecto especial 3 */
     private String obj3="Espada";


    public String getNombre() {
        return nombre;
    }

    @Override
    public String mostrarInformacion(){
       return ("Nombre:"+getNombre()+ "\n");
    }

    public static void main(String[] args) {
        Korby kb=new Korby();
        System.out.println(kb.mostrarInformacion());
    }
 }