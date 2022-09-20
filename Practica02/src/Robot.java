/*
 * Clase que simula los comportamientos de un robot mesero
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * 
 * @version 1.0
 * @since Modelado y Programacion 2023-1
 */ 

 class Robot{

    /*Verifica si ya se tomo la orden */
    private boolean ordenMenu;

    /*Verifica si ya cocinó el robot */
    private boolean cocinar;

    /*Verifica si el robot esta en movimiento */
    private boolean camina;

    /*Verifica si entrego la comida */
    private boolean entrega;

 

    /*Activación del Robot por parte de un cliente */
    //private boolean activarCliente;

    /*Indica la ubicacion del robot */
    private boolean ubicacionCorrecta;

    /*Indica la mesa objectivo del comensal a la que irá el robot */
    private Objectivo mesaC;

    /*Verifica el estado del robot */
    private EstadoRobot estadoActual;
    
    /*Indica si el robot esta encendido */
    private EstadoRobot modoEncendido;

    /*Indica si el robot esta en un modo suspendido */
    private EstadoRobot modoSuspendido;

    /*Indica si el robot esta caminando */
    private EstadoRobot modoMovimiento;

    /*Indica si el robot esta cocinando */
    private EstadoRobot modoCocinar;

    /*Indica si el robo esta tomando una orden */
    private EstadoRobot modoLeerMenu;

    
    public Robot(){

        modoSuspendido=new ModoSuspendido(this);
        //modoMovimiento=new ModoMovimiento(this);
        //modoCocinar=new ModoCocinar(this);
        //modoLeerMenu= new ModoLeerMenu(this);
        
        estadoActual=modoEncendido;
    }

     /*
     * getOrdenMenu
     * 
     * @return la ubicacion correcta del robot
     */
    public boolean getOrdenMenu(){
        if(mesaC.getDistancia()>0){
            return ubicacionCorrecta;
        }else{
            ubicacionCorrecta=true;
            return ubicacionCorrecta;
        }
    }

    /*getCocino 
     * 
     * @return 
    */

    public boolean getCocinar(){
        if(mesaC.getTiempoComida()> 0){
            return cocinar;
        }
        else{
            cocinar=true;
            return cocinar;
        }
    }

    public boolean getCamina(){
       if(mesaC.getDistanciaActual()>0)
            return true;
      else{
        return false;
      }      
    }


    public boolean getEntrega(){
        if(mesaC.getComida()>0)
            return entrega;
        else{
            entrega =true;
            return entrega;
        }
    }

    /*
     * asignarNuevoEstado
     * @param nuevo estado 
     */
    public void asignarNuevoEstado(EstadoRobot nuevoEstado){
        estadoActual=nuevoEstado;
    }

    public EstadoRobot getEstadoEncendido(){
        return modoEncendido;
    }


 }