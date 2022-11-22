package com.puppypets.vista.menu_clientes;

import java.awt.Color;
import java.util.Optional;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.puppypets.vista.menu_clientes.strategy.OpcionActual;

/**
 * Clase que implementa el panel que fue seleccionado en las opciones del menu
 * del cliente.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 * 
 */
@SuppressWarnings("serial")
public class PanelSeleccionado extends JPanel {

	private OpcionActual panelCita;
	private PanelPago panelPago;
	private JLabel lblImagen;

	/**
	 * Método constructor de la clase.
	 */
	public PanelSeleccionado() {
		setBackground(new Color(36, 47, 65));
		setBounds(266, 0, 472, 631);
		setLayout(null);
		agregaImagenSecundaria();
	}

	/**
	 * Método getter del panelCita.
	 * 
	 * @return Cita actual.
	 */
	public OpcionActual getPanelCita() {
		return panelCita;
	}

	/**
	 * Método setter del panelCita.
	 * 
	 * @param panelCita Cita que se selecciona.
	 */
	public void setPanelCita(OpcionActual panelCita) {
		this.panelCita = panelCita;
	}

	/**
	 * Método getter del panelPago.
	 * 
	 * @return Panel Pago.
	 */
	public PanelPago getPanelPago() {
		return panelPago;
	}

	/**
	 * Método setter del panelPago.
	 * 
	 * @param panelPago Panel Pago seleccionado.
	 */
	public void setPanelPago(PanelPago panelPago) {
		this.panelPago = panelPago;
	}

	/**
	 * Método getter del panelCita.
	 * 
	 * @return Optional de Cita actual.
	 */
	public Optional<OpcionActual> getPanelCitaOp() {
		return Optional.ofNullable(panelCita);
	}

	/**
	 * Método getter del panelPago.
	 * 
	 * @return Optional de Panel Pago.
	 */
	public Optional<PanelPago> getPanelPagoOp() {
		return Optional.ofNullable(panelPago);
	}

	/**
	 * Restablece el panel seleccionado a su forma original.
	 */
	public void restableceDefaultPanel() {
		removeAll();
		repaint();
		revalidate();
		agregaImagenSecundaria();
	}

	/**
	 * Método que cambia el panel por defecto a uno donde se registre una cita.
	 * 
	 * @param nuevoPanelActual Panel de cita seleccionado.
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
	 * Método que cambia el panel por defecto a uno donde se paga las citas.
	 * 
	 * @param pago Panel de pago.
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

	/**
	 * Método que agrega la imagen secundaria del panel.
	 */
	private void agregaImagenSecundaria() {
		lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\lobo.jpg"));
		lblImagen.setBounds(0, 0, 472, 565);
		lblImagen.setVisible(true);
		add(lblImagen);
	}

}
