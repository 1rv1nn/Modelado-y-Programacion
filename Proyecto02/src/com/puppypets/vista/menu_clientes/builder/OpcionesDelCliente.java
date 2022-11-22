package com.puppypets.vista.menu_clientes.builder;

import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.puppypets.vista.MiniPanel;

@SuppressWarnings("serial")
public class OpcionesDelCliente extends JPanel {
	private MiniPanel panelCita;
	private MiniPanel panelCirugia;
	private MiniPanel panelEstetica;
	private MiniPanel panelVacunacion;
	private MiniPanel panelEstudios;
	private MiniPanel panelPago;
	private MiniPanel panelLogOut;
	private List<MiniPanel> opciones;
	public final Color VERDE = new Color(58, 202, 128);
	public final Color VERDE_OSCURO = new Color(47, 182, 114);

	public OpcionesDelCliente(ConstructorOpcionesDelCliente cpo) {
		this.panelCita = cpo.panelCita;
		this.panelCirugia = cpo.panelCirugia;
		this.panelEstetica = cpo.panelEstetica;
		this.panelVacunacion = cpo.panelVacunacion;
		this.panelEstudios = cpo.panelEstudios;
		this.panelPago = cpo.panelPago;
		this.panelLogOut = cpo.panelLogOut;
		opciones = Arrays.asList(panelCita, panelCirugia, panelEstetica, panelVacunacion, panelEstudios, panelPago,
				panelLogOut);

		setBackground(new Color(47, 182, 114));
		setBounds(0, 0, 266, 631);
		setLayout(null);
		agregaMarca();
		agregaPaneles();
	}

	private void agregaPaneles() {
		add(panelCita);
		add(panelCirugia);
		add(panelEstetica);
		add(panelVacunacion);
		add(panelEstudios);
		add(panelPago);
		add(panelLogOut);
	}

	private void agregaMarca() {
		JLabel lblMarca = new JLabel("Puppy Pets ©");
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setIcon(new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\PP.png"));
		lblMarca.setFont(new Font("Cantarell", Font.BOLD, 22));
		lblMarca.setBounds(10, 24, 246, 60);
		add(lblMarca);
	}

	public void limpiar() {
		panelCita.setBackground(VERDE);
		panelCirugia.setBackground(VERDE);
		panelEstetica.setBackground(VERDE);
		panelVacunacion.setBackground(VERDE);
		panelEstudios.setBackground(VERDE);
		panelPago.setBackground(VERDE_OSCURO);
		panelLogOut.setBackground(VERDE_OSCURO);
	}

	public MiniPanel getPanelCita() {
		return panelCita;
	}

	public MiniPanel getPanelCirugia() {
		return panelCirugia;
	}

	public MiniPanel getPanelEstetica() {
		return panelEstetica;
	}

	public MiniPanel getPanelVacunacion() {
		return panelVacunacion;
	}

	public MiniPanel getPanelEstudios() {
		return panelEstudios;
	}

	public MiniPanel getPanelPago() {
		return panelPago;
	}

	public MiniPanel getPanelLogOut() {
		return panelLogOut;
	}

	public List<MiniPanel> getMiniPaneles() {
		return opciones;
	}
}
