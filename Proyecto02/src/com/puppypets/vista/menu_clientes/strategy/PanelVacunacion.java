package com.puppypets.vista.menu_clientes.strategy;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class PanelVacunacion extends OpcionActual {
	private JComboBox<String> cmbVacuna;

	public PanelVacunacion() {
		super();
	}

	@Override
	public void creaTitulo() {
		creaTitulo("Cita Vacunación", 320);
	}

	@Override
	public void creaCuestionario() {
		cuestionarioPorDefecto();
		seleccionaVacuna();
	}
	
	@Override
	public String getMotivacion() {
		StringBuilder motivo = new StringBuilder("Vacuna: ");
		motivo.append(cmbVacuna.getSelectedItem().toString());
		return motivo.toString();
	}
	
	private void seleccionaVacuna() {
		JLabel lblEstudio = new JLabel("Vacuna");
		lblEstudio.setFont(new Font("Cantarell", Font.BOLD, 14));
		lblEstudio.setBounds(202, 225, 108, 20);
		panelCuestionario.add(lblEstudio);
		
		cmbVacuna = new JComboBox<String>();
		cmbVacuna.setModel(new DefaultComboBoxModel<String>(new String[] {"Parvovirus ", "Moquillo", "Hepatitis ", "Rabia ", "Desparasitación", "Cuadruple", "Cachorros"}));
		cmbVacuna.setSelectedIndex(2);
		cmbVacuna.setFont(new Font("Montserrat", Font.PLAIN, 11));
		cmbVacuna.setBackground(Color.WHITE);
		cmbVacuna.setBounds(202, 250, 119, 22);
		panelCuestionario.add(cmbVacuna);
	}

}
