package com.puppypets.vista.menu_vet.builder;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

import javax.swing.JPanel;

import com.puppypets.vista.MiniPanel;

/**
 * Método que implementa las opciones del menú del veterinario.
 * 
 * @author 106956120
 *
 */
@SuppressWarnings("serial")
public class OpcionesDelVeterinario extends JPanel {

	private MiniPanel citasAgendadas;
	private MiniPanel mascotasAgendadas;
	private MiniPanel clientesPago;
	private MiniPanel panelLogOut;
	private List<MiniPanel> opciones;
	public final Color VERDE_OSCURO = new Color(139, 182, 64);

	/**
	 * Método constructor.
	 * 
	 * @param builder Constructor de las opciones.
	 */
	public OpcionesDelVeterinario(ConstructorOpcionesDelVeterinario builder) {
		this.citasAgendadas = builder.citasAgendadas;
		this.mascotasAgendadas = builder.mascotasAgendadas;
		this.clientesPago = builder.clientesPago;
		this.panelLogOut = builder.panelLogOut;
		opciones = Arrays.asList(citasAgendadas, mascotasAgendadas, clientesPago, panelLogOut);

		setBackground(VERDE_OSCURO);
		setBounds(0, 0, 266, 476);
		setLayout(null);
		agregaPaneles();
	}

	/**
	 * Método getter de las citas agendadas.
	 * 
	 * @return Citas agendadas.
	 */
	public MiniPanel getCitasAgendadas() {
		return citasAgendadas;
	}

	/**
	 * Método getter de las mascotas atendidas.
	 * 
	 * @return Mascotas atendidas.
	 */
	public MiniPanel getMascotasAgendadas() {
		return mascotasAgendadas;
	}

	/**
	 * Método getter de las citas pagadas.
	 * 
	 * @return Citas pagadas.
	 */
	public MiniPanel getClientesPago() {
		return clientesPago;
	}

	/**
	 * Método getter del panel de cerrar sesión.
	 * 
	 * @return Minipanel de cerrar sesión
	 */
	public MiniPanel getPanelLogOut() {
		return panelLogOut;
	}

	/**
	 * Método getter de las opciones.
	 * 
	 * @return Opciones.
	 */
	public List<MiniPanel> getOpciones() {
		return opciones;
	}

	/**
	 * Método para agregar los paneles (opciones) al panel.
	 */
	private void agregaPaneles() {
		add(citasAgendadas);
		add(mascotasAgendadas);
		add(clientesPago);
		add(panelLogOut);
	}
}