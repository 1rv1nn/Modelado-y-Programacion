package com.puppypets.vista.menu_clientes.strategy;

import java.awt.Color;
import java.util.Optional;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.puppypets.vista.menu_clientes.PanelPago;

@SuppressWarnings("serial")
public class PanelSeleccionado extends JPanel {
	
	private OpcionActual panelCita;
	private PanelPago panelPago;
	private JLabel lblImagen;
	
	public PanelSeleccionado() {
		setBackground(new Color(36, 47, 65));
		setBounds(266, 0, 472, 631);
		setLayout(null);
		agregaImagenSecundaria();
	}
	
	public void restableceDefaultPanel() {
		removeAll();
		repaint();
		revalidate();
		agregaImagenSecundaria();
	}
	
	public void cambioACita(OpcionActual nuevoPanelActual) {
		removeAll();
		repaint();
		revalidate();
		setPanelCita(nuevoPanelActual);
		add(panelCita);
		revalidate();
	}
	
	public void cambioAPago(PanelPago pago) {
		removeAll();
		repaint();
		revalidate();
		setPanelPago(pago);
		add(panelPago);
		panelPago.revalidate();
		revalidate();
	}
	
	private void agregaImagenSecundaria() {
		lblImagen = new JLabel("");
		lblImagen.setIcon(new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\__-drz-__-N_INAlQoO6Y-unsplash (1).jpg"));
		lblImagen.setBounds(0, 0, 472, 565);
		lblImagen.setVisible(true);
		add(lblImagen);
	}

	public void setPanelCita(OpcionActual panelCita) {
		this.panelCita = panelCita;
	}

	public void setPanelPago(PanelPago panelPago) {
		this.panelPago = panelPago;
	}

	public OpcionActual getPanelCita() {
		return panelCita;
	}
	
	public Optional<OpcionActual> getPanelCitaOp() {
		return Optional.ofNullable(panelCita);
	}

	public Optional<PanelPago> getPanelPagoOp() {
		return Optional.ofNullable(panelPago);
	}
	

	public PanelPago getPanelPago() {
		return panelPago;
	}
	
	
	
}
