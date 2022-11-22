package com.puppypets.vista.menu_clientes.strategy;



/**
 * Clase PanelCirugia que hereda de la clase OpcionActual.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * 
 * @version 1.0
 * @since Java JDK 11.0
 * 
 */
@SuppressWarnings("serial")
public class PanelCirugia extends OpcionActual {

	public PanelCirugia() {
		super();
	}

	@Override
	public void creaTitulo() {
		creaTitulo("Cita para Cirugía", 320);
	}

	@Override
	public void creaCuestionario() {
		cuestionarioPorDefecto();
	}

	@Override
	public String getMotivacion() {
		return "Cirugia";
	}
}
