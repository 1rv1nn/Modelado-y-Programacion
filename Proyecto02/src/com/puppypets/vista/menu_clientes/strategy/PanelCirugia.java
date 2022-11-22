package com.puppypets.vista.menu_clientes.strategy;

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
