package com.puppypets.vista.menu_clientes.strategy;

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
