package com.puppypets.vista.menu_vet;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

import javax.swing.JPanel;

import com.puppypets.vista.MiniPanel;

@SuppressWarnings("serial")
public class OpcionesDelVeterinario extends JPanel {

	private MiniPanel citasAgendadas;
	private MiniPanel mascotasAgendadas;
	private MiniPanel clientesPago;
	private MiniPanel panelLogOut;
	private List<MiniPanel> opciones;
	public final Color VERDE_OSCURO = new Color(139, 182, 64);
	public final Color VIOLETA = new Color(194, 0, 91);
	public final Color VIOLETA_CLARO = new Color(202, 0, 117); 
	public final Color VIO = new Color(210, 54, 142);
	
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
	
	private void agregaPaneles() {
		add(citasAgendadas);
		add(mascotasAgendadas);
		add(clientesPago);
		add(panelLogOut);
	}
	
	public MiniPanel getCitasAgendadas() {
		return citasAgendadas;
	}


	public MiniPanel getMascotasAgendadas() {
		return mascotasAgendadas;
	}

	
	public MiniPanel getClientesPago() {
		return clientesPago;
	}

	
	public MiniPanel getPanelLogOut() {
		return panelLogOut;
	}


	public List<MiniPanel> getOpciones() {
		return opciones;
	}
	
}
