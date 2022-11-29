package com.puppypets.vista.menu_clientes.strategy;

/**
 * Clase que implementa el registro de una cita para cirugia.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 * 
 */
@SuppressWarnings("serial")
public class PanelCirugia extends OpcionActual {

	/**
	 * Método constructor de la clase.
	 */
	public PanelCirugia() {
		super();
	}

	@Override
	public void creaTitulo() {
		creaTitulo("Cita para Cirugia", 330);
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
