package com.puppypets.vista.menu_clientes.strategy;

/**
 * Clase PanelCita que hereda de la clase OpcionActual.
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
public class PanelCita extends OpcionActual {

	public PanelCita() {
		super();
	}

	@Override
	public void creaTitulo() {
		creaTitulo("Cita Médica", 230);
	}

	@Override
	public void creaCuestionario() {
		cuestionarioPorDefecto();
	}

	@Override
	public String getMotivacion() {
		return "Cita Médica";
	}
}
