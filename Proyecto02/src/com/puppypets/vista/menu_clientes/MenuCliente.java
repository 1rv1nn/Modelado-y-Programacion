package com.puppypets.vista.menu_clientes;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.Optional;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.puppypets.vista.MiniPanel;
import com.puppypets.vista.menu_clientes.builder.ConstructorOpcionesDelCliente;
import com.puppypets.vista.menu_clientes.builder.OpcionesDelCliente;
import com.puppypets.vista.menu_clientes.strategy.OpcionActual;

import javax.swing.ImageIcon;

/**
 * Clase que implementa el menu del cliente.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 *
 */
@SuppressWarnings("serial")
public class MenuCliente extends JFrame {

	private JPanel contentPane;
	private PanelSeleccionado panelActual;
	private OpcionesDelCliente panelOpciones;
	private final Color VERDE = new Color(58, 202, 128);
	private final Color VERDE_OSCURO = new Color(47, 182, 114);

	/**
	 * Método constructor del cliente.
	 */
	public MenuCliente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("PP.png"));
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

	/**
	 * Método que devuelve el panel seleccionado.
	 * 
	 * @return PanelActual después de elegirlo en las opciones (cita o pago).
	 */
	public PanelSeleccionado getPanelActual() {
		return panelActual;
	}

	/**
	 * Método getter del panel de opciones.
	 * 
	 * @return Panel de opciones.
	 */
	public OpcionesDelCliente getPanelOpciones() {
		return panelOpciones;
	}

	/**
	 * Método que cambia los paneles.
	 * 
	 * @param panelPago Panel que quiere ser colocado.
	 * @param mp        Minipanel que fue seleccionado.
	 */
	public void cambioPanel(PanelPago panelPago, MiniPanel mp) {
		getPanelOpciones().limpiar();
		mp.setClicks(mp.getClicks() + 1);
		mp.setBackground(new Color(66, 219, 140));
		getPanelActual().cambioAPago(panelPago);
	}

	/**
	 * Método que cambia los paneles.
	 * 
	 * @param nuevoPanelActual Panel de cita que quiere ser colocado..
	 * @param mp               Minipanel que fue seleccionado.
	 */
	public void cambioPanel(OpcionActual nuevoPanelActual, MiniPanel mp) {
		getPanelOpciones().limpiar();
		mp.setClicks(mp.getClicks() + 1);
		mp.setBackground(new Color(66, 219, 140));
		getPanelActual().cambioACita(nuevoPanelActual);
	}

	/**
	 * Método que restablece el frame a su estado original.
	 */
	public void restablece() {
		getOpciones().ifPresentOrElse(this::restablecePanelOpciones, () -> panelActual.restableceDefaultPanel());
	}

	/**
	 * Método que restablece un un panel para quitar los campos.
	 * 
	 * @param panel Panel de opción que se quiere restablecer.
	 */
	private void restablecePanelOpciones(OpcionesDelCliente panel) {
		panel.limpiar();
		panelActual.restableceDefaultPanel();
	}

	/**
	 * Método que crea las opciones del panel de opciones.
	 */
	private void creaOpciones() {
		ImageIcon imgCita = new ImageIcon("cita.png");
		MiniPanel panelCita = new MiniPanel("Agendar una cita medica", imgCita, 110, VERDE);

		ImageIcon imgCirugia = new ImageIcon("cirugia.png");
		MiniPanel panelCirugia = new MiniPanel("Agendar cirugia", imgCirugia, 170, VERDE);

		ImageIcon imgEstetica = new ImageIcon("corte.png");
		MiniPanel panelEstetica = new MiniPanel("Agendar estetica", imgEstetica, 230, VERDE);

		ImageIcon imgVacunacion = new ImageIcon("vacuna.png");
		MiniPanel panelVacunacion = new MiniPanel("Agendar vacunacion", imgVacunacion, 290, VERDE);

		ImageIcon imgEstudios = new ImageIcon("analisis.png");
		MiniPanel panelEstudios = new MiniPanel("Agendar estudios clinicos", imgEstudios, 350, VERDE);

		ImageIcon imgPago = new ImageIcon("tarjeta.png");
		MiniPanel panelPago = new MiniPanel("Pago de servicios", imgPago, 410, VERDE_OSCURO);

		ImageIcon imgLogOut = new ImageIcon("logout.png");
		MiniPanel panelLogOut = new MiniPanel("Cerrar sesion", imgLogOut, 470, VERDE_OSCURO);

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

	/**
	 * Método que devuelve el panel de opciones.
	 * 
	 * @return Optional del panel de opciones.
	 */
	private Optional<OpcionesDelCliente> getOpciones() {
		return Optional.ofNullable(panelOpciones);
	}

}
