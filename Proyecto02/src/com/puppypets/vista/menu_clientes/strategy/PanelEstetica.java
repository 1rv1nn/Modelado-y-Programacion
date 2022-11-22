package com.puppypets.vista.menu_clientes.strategy;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 * Clase PanelEstetica que hereda de la clase OpcionActual.
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
public class PanelEstetica extends OpcionActual {
	private JComboBox<String> cmbTipoDeCorte;
	
	public PanelEstetica() {
		super();
	}

	@Override
	public void creaTitulo() {
		creaTitulo("Cita para estética", 340);
	}

	@Override
	public void creaCuestionario() {
		cuestionarioPorDefecto();
		escogeCorte();
		
	}

	@Override
	public String getMotivacion() {
		StringBuilder motivo = new StringBuilder("Corte: ");
		motivo.append(cmbTipoDeCorte.getSelectedItem().toString());
		return motivo.toString();
	}
	
	/**
	 * escogeCorte.
	 * 
	 * Panel donde se escoge un corte para la mascota
	 */
	private void escogeCorte() {
		JLabel lblTipoDeCorte = new JLabel("Tipo de corte");
		lblTipoDeCorte.setFont(new Font("Cantarell", Font.BOLD, 14));
		lblTipoDeCorte.setBounds(202, 225, 108, 20);
		panelCuestionario.add(lblTipoDeCorte);
		
		cmbTipoDeCorte = new JComboBox<String>();
		cmbTipoDeCorte.setModel(new DefaultComboBoxModel<>(new String[] {"Rapado", "Acorde a su raza"}));
		cmbTipoDeCorte.setFont(new Font("Montserrat Medium", Font.PLAIN, 12));
		cmbTipoDeCorte.setBackground(Color.WHITE);
		cmbTipoDeCorte.setBounds(202, 250, 126, 22);
		panelCuestionario.add(cmbTipoDeCorte);
	}

}
