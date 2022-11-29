package com.puppypets.vista.menu_clientes.strategy;

/**
 * Clase que implementa el registro de una cita general.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 * 
 */
@SuppressWarnings("serial")
public class PanelCita extends OpcionActual {

	/**
	 * Método constructor de la clase.
	 */
	public PanelCita() {
		super();
	}

	@Override
	public void creaTitulo() {
		creaTitulo("Cita Medica", 230);
	}

	@Override
	public void creaCuestionario() {
		cuestionarioPorDefecto();
	}

	@Override
	public String getMotivacion() {
		return "Cita Medica";
	}
}
