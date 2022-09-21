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

 class Robot{

   /**Verifica si una orden */
   private boolean ordenRecibida;

    /**Verifica si ya se tomo la orden */
    private boolean ordenMenu;

    /**Verifica si ya cocinó el robot */
    private boolean cocinar;

    /**Verifica si el robot esta en movimiento */
    private boolean camina;

    /**Verifica si entrego la comida */
    private boolean entrega;

 


    /**Indica la ubicacion del robot */
    private boolean ubicacionCorrecta;

    /**Indica la mesa objectivo del comensal a la que irá el robot */
    private Objetivo mesaC;

    /** Verifica el estado del robot */
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

    

    /**
     * Crea un Robot
     */
    public Robot(){

        modoSuspendido=new ModoSuspendido(this);
        modoMovimiento=new ModoMovimiento(this);
        modoCocinar=new ModoCocinar(this);
        modoLeerMenu= new ModoLeerMenu(this);
        modoEncendido=new ModoEncendido(this);
        
        estadoActual=modoEncendido;
    }

     /*
     * getOrdenMenu
     * 
     * @return la ubicacion correcta del robot
     */
    public boolean getUbicacionCorrecta(){
        if(mesaC.getDistancia()>0){
            return ubicacionCorrecta;
        }else{
            ubicacionCorrecta=true;
            return ubicacionCorrecta;
        }
    }

    public boolean getOrdenRecibida(){
        return ordenRecibida;
    }

    /*getCocinar
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

    /**
     * asignarNuevoEstado
     * @param nuevoEstado estado 
     */
    public void asignarNuevoEstado(EstadoRobot nuevoEstado){
        estadoActual=nuevoEstado;
    }

     /**getEstadoEncendido
     * 
     * @return regresa si el robot esta encendido
     */
    public EstadoRobot getEstadoEncendido(){
        return modoEncendido;
    }

    /**getEstadoCamina
     * 
     * @return regresa si el robot esta en movimiento
     */
    public EstadoRobot getEstadoCamina(){
        return modoMovimiento;
    }

    /**getEstadoLeeMenu
     * 
     * @return regresa si el robot lee el menu
     */
    public EstadoRobot getEstadoLeeMenu(){
        return modoLeerMenu;
    }

    /**getEstadoCocina
     * 
     * @return regresa si el robot esta en movimiento
     */
    public EstadoRobot getEstadoCocina(){
        return modoCocinar;
    }

    /*getEstadoSuspendio
     * 
     * @return regresa si el robot esta en suspencion
     */
    public EstadoRobot getEstadoSuspendido(){
        return modoSuspendido;
    }


    /**reducirDistancia 
    *
    * Método que indica cuanta distancia recorrio    
    */

    public void reducirDistancia(){
        mesaC.setTiempoComida(mesaC.getDistancia()-1);
    }


    /**
     * 
     * @return
     */

    /**getComidaAcabada
     * 
     * Método que indica que el robot termino de hacer la comida
     */

     public boolean getComidaAcabada(){
        if(mesaC.getTiempoComida()>0){
            return cocinar;
        }else{
            cocinar=true;
            return cocinar;
        }
     }

     /**
      * reducirComida()
      */
      public void reducirComida(){
        mesaC.setTiempoComida(mesaC.getTiempoComida()-1);
      }

      /*
       * getOrdenCompleta 
       */

       public boolean getOrdenCompleta(){
        if(mesaC.getOrden()==true){
            return ordenMenu;
        }else{
            ordenMenu=true;
            return ordenMenu;
        }
       }

       public void ordenCompletada(){
        mesaC.setOrden(mesaC.getOrden());
       }


       /**
        * 
        * ingresaOrden
        */
        public void ingresaOrden(){
            System.out.println("OrdenAceptada ");
            Objetivo mesa=new Objetivo(3, 5);
            recibirOrdenObjetivo(mesa);
            System.out.println("Orden recibida");
        }

        /**
         * recibitOrdenObjetivo
         */
        public void recibirOrdenObjetivo(Objetivo mesa){
            mesaC=mesa;
            ordenRecibida=true;

        }

        /**
         * Activa al robot
         */
        public void activar(){
            estadoActual.activar();
        }

        /**
         * Camina el robot
         */
        public void caminar(){
            estadoActual.caminar();
        }

        /**
         * Toma una orden el robot
         */
        public void tomarOrden(){
            estadoActual.mostrarMenu();
        }

        /**
         * Cocina el robot
         */
        public void cocinar(){
            estadoActual.cocinar();
        }

        /**
         * Entra en modoS Suspencion
         */
        public void suspender(){
            estadoActual.suspender();
        }



 }