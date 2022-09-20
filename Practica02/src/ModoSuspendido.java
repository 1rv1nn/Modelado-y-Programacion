 class ModoSuspendido implements EstadoRobot {
   Robot walle; 


   public ModoSuspendido(Robot walle){
    this.walle=walle;
   }

   @Override
   public void activar(){
    if(walle.getOrdenMenu() && walle.getCocinar() && walle.getCamina() && walle.getEntrega()){
        System.out.println("*** MODO SUSPENDIDO ***\n Wall-e ha terminado su servicio gracias");
        walle.asignarNuevoEstado(walle.getEstadoEncendido());
        else{
            System.out.println("***MODO ENCENDIDO*** \n Wall-e esta a la espera de su orden.");
        }
   }




   public void caminar(){

    }



   public void cocinar(){

    }


   public void MostrarMenu(){

     }



   public void suspender(){

    }


}
