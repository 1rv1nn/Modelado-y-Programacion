package com.puppypets.vista.menu_clientes.strategy;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 * Clase que implementa el registro de una cita para estudios clínicos.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 * 
 */
@SuppressWarnings("serial")
public class PanelVacunacion extends OpcionActual {
	private JComboBox<String> cmbVacuna;

	/**
	 * Método constructor de la clase.
	 */
	public PanelVacunacion() {
		super();
	}

	@Override
	public void creaTitulo() {
		creaTitulo("Cita Vacunacion", 320);
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
	
	/**
	 * Método que añade los campos para escoger una vacuna para la mascota.
	 */
	private void seleccionaVacuna() {
		JLabel lblEstudio = new JLabel("Vacuna");
		lblEstudio.setFont(new Font("Cantarell", Font.BOLD, 14));
		lblEstudio.setBounds(202, 225, 108, 20);
		panelCuestionario.add(lblEstudio);
		
		cmbVacuna = new JComboBox<String>();
		cmbVacuna.setModel(new DefaultComboBoxModel<String>(new String[] {"Parvovirus ", "Moquillo", "Hepatitis ", "Rabia ", "Desparasitacion", "Cuadruple", "Cachorros"}));
		cmbVacuna.setSelectedIndex(2);
		cmbVacuna.setFont(new Font("Montserrat", Font.PLAIN, 11));
		cmbVacuna.setBackground(Color.WHITE);
		cmbVacuna.setBounds(202, 250, 119, 22);
		panelCuestionario.add(cmbVacuna);
	}

}
