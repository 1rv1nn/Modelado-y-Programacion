package com.puppypets.vista.menu_clientes.strategy;

import java.awt.Color;
import java.util.Optional;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase PanelSeleccionado.
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
public class PanelSeleccionado extends JPanel {
	
	private OpcionActual panelCita;
	private PanelPago panelPago;
	private JLabel lblImagen;
	
	/*Opciones de panel */
	public PanelSeleccionado() {
		setBackground(new Color(36, 47, 65));
		setBounds(266, 0, 472, 631);
		setLayout(null);
		agregaImagenSecundaria();
	}
	
	/**Opciones de panel */
	public void restableceDefaultPanel() {
		removeAll();
		repaint();
		revalidate();
		agregaImagenSecundaria();
	}
	
	/**
	 * cambioACita.
	 * @param nuevoPanelActual
	 * cambia una cita.
	 */
	public void cambioACita(OpcionActual nuevoPanelActual) {
		removeAll();
		repaint();
		revalidate();
		setPanelCita(nuevoPanelActual);
		add(panelCita);
		revalidate();
	}
	
	/**
	 * cambioAPago
	 * @param pago
	 * cambio de pago
	 */
	public void cambioAPago(PanelPago pago) {
		removeAll();
		repaint();
		revalidate();
		setPanelPago(pago);
		add(panelPago);
		panelPago.revalidate();
		revalidate();
	}
	
	/*Opciones de panel */
	private void agregaImagenSecundaria() {
		lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\__-drz-__-N_INAlQoO6Y-unsplash (1).jpg"));
		lblImagen.setBounds(0, 0, 472, 565);
		lblImagen.setVisible(true);
		add(lblImagen);
	}

	/**
	 * Devuelve el panelCita
	 * @param panelCita
	 */
	public void setPanelCita(OpcionActual panelCita) {
		this.panelCita = panelCita;
	}

	/**
	 * Muestra el panelPago
	 * @param panelPago
	 */
	public void setPanelPago(PanelPago panelPago) {
		this.panelPago = panelPago;
	}


	/**
	 * getPanelCita
	 * @return El panel cita
	 */
	public OpcionActual getPanelCita() {
		return panelCita;
	}
	
	/**
	 * getPanelCitaop
	 * @return El panel cita
	 */
	public Optional<OpcionActual> getPanelCitaOp() {
		return Optional.ofNullable(panelCita);
	}

	public Optional<PanelPago> getPanelPagoOp() {
		return Optional.ofNullable(panelPago);
	}
	

	/**
	 * getPanelPago
	 * @return El panle pago.
	 */
	public PanelPago getPanelPago() {
		return panelPago;
	}
	
	
	
}
