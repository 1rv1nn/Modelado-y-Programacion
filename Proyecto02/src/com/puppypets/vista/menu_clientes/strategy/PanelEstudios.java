package com.puppypets.vista.menu_clientes.strategy;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

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
public class PanelEstudios extends OpcionActual {
	private JComboBox<String> cmbEstudio;
	private JCheckBox chckbxExpress;

	/**
	 * Método constructor.
	 */
	public PanelEstudios() {
		super();
		panelGuardar.setLocation(7, 325);
		daInformacionEntrega();
	}

	@Override
	public void creaTitulo() {
		creaTitulo("Cita para estudios", 350);
	}

	@Override
	public void creaCuestionario() {
		cuestionarioPorDefecto();
		seleccionaEstudio();
		seleccionaRapidez();
	}

	@Override
	public String getMotivacion() {
		StringBuilder motivo = new StringBuilder();
		if (chckbxExpress.isSelected())
			motivo.append("[E] ");
		motivo.append("Estudio: ");
		motivo.append(cmbEstudio.getSelectedItem().toString());
		return motivo.toString();
	}

	/**
	 * Método que añade los campos para elegir el un tipo de estudio.
	 */
	private void seleccionaEstudio() {
		JLabel lblEstudio = new JLabel("Estudio");
		lblEstudio.setFont(new Font("Cantarell", Font.BOLD, 14));
		lblEstudio.setBounds(202, 225, 108, 20);
		panelCuestionario.add(lblEstudio);

		cmbEstudio = new JComboBox<String>();
		cmbEstudio.setModel(new DefaultComboBoxModel<String>(new String[] { "Hemograma", "Analisis sanguineo",
				"Prueba de moquillo", "Prueba de parvovirus", "Prueba de Leucemia", "Urianalisis", "Chequeos general",
				"Biopsias", "Histopatologicos", "Citologias" }));
		cmbEstudio.setSelectedIndex(4);
		cmbEstudio.setFont(new Font("Montserrat", Font.PLAIN, 11));
		cmbEstudio.setBackground(Color.WHITE);
		cmbEstudio.setBounds(202, 250, 140, 22);
		panelCuestionario.add(cmbEstudio);
	}

	/**
	 * Método que añade los campos para elegir el tiempo de entrega del estudio.
	 */
	private void seleccionaRapidez() {
		chckbxExpress = new JCheckBox("Servicio express");
		chckbxExpress.setToolTipText("Entregas en 8hrs");
		chckbxExpress.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxExpress.setBackground(Color.WHITE);
		chckbxExpress.setFont(new Font("Montserrat Medium", Font.PLAIN, 12));
		chckbxExpress.setBounds(30, 295, 312, 23);
		panelCuestionario.add(chckbxExpress);
	}

	/**
	 * Método que proporciona información sobre los diferentes tiempos de envío.
	 */
	private void daInformacionEntrega() {
		JLabel lblInfoE = new JLabel("El servicio express se entrega en 8hrs despues del analisis.");
		lblInfoE.setFont(new Font("Montserrat Light", Font.PLAIN, 10));
		lblInfoE.setBounds(81, 584, 305, 25);
		add(lblInfoE);

		JLabel lblInfoN = new JLabel("Por otro lado, el servicio regular, tarda 3 dias habiles en ser entregado.");
		lblInfoN.setFont(new Font("Montserrat Light", Font.PLAIN, 10));
		lblInfoN.setBounds(59, 606, 364, 25);
		add(lblInfoN);
	}
}
