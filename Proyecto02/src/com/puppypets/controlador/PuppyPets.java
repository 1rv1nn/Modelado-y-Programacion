package com.puppypets.controlador;

import com.puppypets.controlador.singleton.CtrlLogIn;

public class PuppyPets {
    public static void main(String[] args) {
    	CtrlLogIn.getInstancia().iniciaFrame();
    }
}
