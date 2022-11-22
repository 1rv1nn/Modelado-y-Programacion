package com.puppypets.vista.menu_clientes;

import java.awt.Color;
import java.util.Optional;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.puppypets.vista.MiniPanel;
import com.puppypets.vista.menu_clientes.builder.ConstructorOpcionesDelCliente;
import com.puppypets.vista.menu_clientes.builder.OpcionesDelCliente;
import com.puppypets.vista.menu_clientes.strategy.OpcionActual;
import com.puppypets.vista.menu_clientes.strategy.PanelPago;
import com.puppypets.vista.menu_clientes.strategy.PanelSeleccionado;

import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class MenuCliente extends JFrame {

	private JPanel contentPane;
	private PanelSeleccionado panelActual;
	private OpcionesDelCliente panelOpciones;
	private final Color VERDE = new Color(58, 202, 128);
	private final Color VERDE_OSCURO = new Color(47, 182, 114);

	public MenuCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 670);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(47, 182, 114));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panelActual = new PanelSeleccionado();
		add(panelActual);
		creaOpciones();
	}

	public OpcionesDelCliente getPanelOpciones() {
		return panelOpciones;
	}

	private Optional<OpcionesDelCliente> getOpciones() {
		return Optional.ofNullable(panelOpciones);
	}

	public void restablece() {
		getOpciones().ifPresentOrElse(this::restablecePanelOpciones, () -> panelActual.restableceDefaultPanel());
	}

	private void restablecePanelOpciones(OpcionesDelCliente panel) {
		panel.limpiar();
		panelActual.restableceDefaultPanel();
	}

	private void creaOpciones() {
		ImageIcon imgCita = new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\appointment (1).png");
		MiniPanel panelCita = new MiniPanel("Agendar una cita medica", imgCita, 110, VERDE);

		ImageIcon imgCirugia = new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\scalpel (2).png");
		MiniPanel panelCirugia = new MiniPanel("Agendar cirugía", imgCirugia, 170, VERDE);

		ImageIcon imgEstetica = new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\haircut (1).png");
		MiniPanel panelEstetica = new MiniPanel("Agendar estética", imgEstetica, 230, VERDE);

		ImageIcon imgVacunacion = new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\vaccinated (1).png");
		MiniPanel panelVacunacion = new MiniPanel("Agendar vacunación", imgVacunacion, 290, VERDE);

		ImageIcon imgEstudios = new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\medical-record (1).png");
		MiniPanel panelEstudios = new MiniPanel("Agendar estudios clínicos", imgEstudios, 350, VERDE);

		ImageIcon imgPago = new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\credit-card (1).png");
		MiniPanel panelPago = new MiniPanel("Pago de servicios", imgPago, 410, VERDE_OSCURO);

		ImageIcon imgLogOut = new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\logout (1).png");
		MiniPanel panelLogOut = new MiniPanel("Cerrar sesión", imgLogOut, 470, VERDE_OSCURO);

		ConstructorOpcionesDelCliente builder = new ConstructorOpcionesDelCliente();
		builder.setPanelCita(panelCita);
		builder.setPanelCirugia(panelCirugia);
		builder.setPanelEstetica(panelEstetica);
		builder.setPanelVacunacion(panelVacunacion);
		builder.setPanelEstudios(panelEstudios);
		builder.setPanelPago(panelPago);
		builder.setPanelLogOut(panelLogOut);
		panelEstudios.changeSizeFont(13);
		panelOpciones = new OpcionesDelCliente(builder);

		contentPane.add(panelOpciones);
	}

	public PanelSeleccionado getPanelActual() {
		return panelActual;
	}
	
	public void cambioPanel(PanelPago panelPago, MiniPanel mp) {
		getPanelOpciones().limpiar();
		mp.setClicks(mp.getClicks() + 1);
		mp.setBackground(new Color(66, 219, 140));
		getPanelActual().cambioAPago(panelPago);
	}
	
	public void cambioPanel(OpcionActual nuevoPanelActual, MiniPanel mp) {
		getPanelOpciones().limpiar();
		mp.setClicks(mp.getClicks() + 1);
		mp.setBackground(new Color(66, 219, 140));
		getPanelActual().cambioACita(nuevoPanelActual);
	}

}
