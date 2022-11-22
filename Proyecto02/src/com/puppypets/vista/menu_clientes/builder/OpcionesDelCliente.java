package com.puppypets.vista.menu_clientes.builder;

import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.puppypets.vista.MiniPanel;

/**
 * Clase que implementa las opciones del cliente.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 *
 */
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

	/**
	 * Método constructor
	 * 
	 * @param builder Constructor de las opciones.
	 */
	public OpcionesDelCliente(ConstructorOpcionesDelCliente builder) {
		this.panelCita = builder.panelCita;
		this.panelCirugia = builder.panelCirugia;
		this.panelEstetica = builder.panelEstetica;
		this.panelVacunacion = builder.panelVacunacion;
		this.panelEstudios = builder.panelEstudios;
		this.panelPago = builder.panelPago;
		this.panelLogOut = builder.panelLogOut;
		opciones = Arrays.asList(panelCita, panelCirugia, panelEstetica, panelVacunacion, panelEstudios, panelPago,
				panelLogOut);

		setBackground(new Color(47, 182, 114));
		setBounds(0, 0, 266, 631);
		setLayout(null);
		agregaMarca();
		agregaPaneles();
	}

	/**
	 * Método getter panel cita.
	 * 
	 * @return Panel cita.
	 */
	public MiniPanel getPanelCita() {
		return panelCita;
	}

	/**
	 * Método getter panel cirugía.
	 * 
	 * @return Panel cirugía.
	 */
	public MiniPanel getPanelCirugia() {
		return panelCirugia;
	}

	/**
	 * Método getter panel estética.
	 * 
	 * @return Panel estética.
	 */
	public MiniPanel getPanelEstetica() {
		return panelEstetica;
	}

	/**
	 * Método getter panel vacunación.
	 * 
	 * @return Panel vacunación.
	 */
	public MiniPanel getPanelVacunacion() {
		return panelVacunacion;
	}

	/**
	 * Método getter panel estudios.
	 * 
	 * @return Panel estudios.
	 */
	public MiniPanel getPanelEstudios() {
		return panelEstudios;
	}

	/**
	 * Método getter panel pago.
	 * 
	 * @return Panel pago.
	 */
	public MiniPanel getPanelPago() {
		return panelPago;
	}

	/**
	 * Método getter panel logout.
	 * 
	 * @return Panel de cerrar sesión.
	 */
	public MiniPanel getPanelLogOut() {
		return panelLogOut;
	}

	/**
	 * Método getter mini paneles.
	 * 
	 * @return Todas las opciones.
	 */
	public List<MiniPanel> getMiniPaneles() {
		return opciones;
	}

	/**
	 * Método que limpia los paneles (los devuelve a su color original).
	 */
	public void limpiar() {
		panelCita.setBackground(VERDE);
		panelCirugia.setBackground(VERDE);
		panelEstetica.setBackground(VERDE);
		panelVacunacion.setBackground(VERDE);
		panelEstudios.setBackground(VERDE);
		panelPago.setBackground(VERDE_OSCURO);
		panelLogOut.setBackground(VERDE_OSCURO);
	}

	/**
	 * Método que agreag los paneles (opciones) que tendrá el panel.
	 */
	private void agregaPaneles() {
		add(panelCita);
		add(panelCirugia);
		add(panelEstetica);
		add(panelVacunacion);
		add(panelEstudios);
		add(panelPago);
		add(panelLogOut);
	}

	/**
	 * Método que agreaga el nombre de la marca al panel.
	 */
	private void agregaMarca() {
		JLabel lblMarca = new JLabel("Puppy Pets ©");
		lblMarca.setForeground(Color.WHITE);
		lblMarca.setIcon(new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\PP.png"));
		lblMarca.setFont(new Font("Cantarell", Font.BOLD, 22));
		lblMarca.setBounds(10, 24, 246, 60);
		add(lblMarca);
	}
}
