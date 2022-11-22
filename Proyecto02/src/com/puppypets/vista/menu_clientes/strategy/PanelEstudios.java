package com.puppypets.vista.menu_clientes.strategy;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

/**
 * Clase PanelEstudios que hereda de la clase OpcionActual.
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
public class PanelEstudios extends OpcionActual {
	private JComboBox<String> cmbEstudio;
	private JCheckBox chckbxExpress;
	
	/**Constructor */
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
		if(chckbxExpress.isSelected())
			motivo.append("[E] ");
		motivo.append("Estudio: ");
		motivo.append(cmbEstudio.getSelectedItem().toString());
		return motivo.toString();
	}
	
	/**
	 * seleccionaEstudio.
	 * 
	 * Panel para elegir el un tipo de estudio.
	 */
	private void seleccionaEstudio() {
		JLabel lblEstudio = new JLabel("Estudio");
		lblEstudio.setFont(new Font("Cantarell", Font.BOLD, 14));
		lblEstudio.setBounds(202, 225, 108, 20);
		panelCuestionario.add(lblEstudio);
		
		cmbEstudio = new JComboBox<String>();
		cmbEstudio.setModel(new DefaultComboBoxModel<String>(new String[] {"Hemograma", "Ánalisis sanguíneo", "Prueba de moquillo", "Prueba de parvovirus", "Prueba de Leucemia", "Urianalisis", "Chequeos general", "Biopsias", "Histopatológicos", "Citologías"}));
		cmbEstudio.setSelectedIndex(4);
		cmbEstudio.setFont(new Font("Montserrat", Font.PLAIN, 11));
		cmbEstudio.setBackground(Color.WHITE);
		cmbEstudio.setBounds(202, 250, 140, 22);
		panelCuestionario.add(cmbEstudio);
	}
	

	/**
	 * seleccionaRapidez.
	 * 
	 * Elege el tiempo en llevarse a cabo el estudio
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
	 * darInformacionEntrega.
	 * 
	 * Proporciona la información del servicio elegido.
	 */
	private void daInformacionEntrega() {
		JLabel lblInfoE = new JLabel("El servicio express se entrega en 8hrs después del ánalisis.");
		lblInfoE.setFont(new Font("Montserrat Light", Font.PLAIN, 10));
		lblInfoE.setBounds(81, 584, 305, 25);
		add(lblInfoE);
		
		JLabel lblInfoN = new JLabel("Por otro lado, el servicio regular, tarda 3 días hábiles en ser entregado.");
		lblInfoN.setFont(new Font("Montserrat Light", Font.PLAIN, 10));
		lblInfoN.setBounds(59, 606, 364, 25);
		add(lblInfoN);
	}
}
