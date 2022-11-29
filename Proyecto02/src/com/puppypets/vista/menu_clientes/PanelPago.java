package com.puppypets.vista.menu_clientes;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.puppypets.modelo.builder.Cita;
import com.puppypets.vista.menu_clientes.strategy.OpcionActual;

/**
 * Clase que implementa el panel de pago.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 * 
 */
@SuppressWarnings("serial")
public class PanelPago extends JPanel {
	private JTable table;
	private JPanel marcoTitulo;
	private JPanel panelTabla;
	private JPanel panelGuardar;
	private JPanel panelBanner;
	private Button btnGuardar;
	private Button btnCancelar;
	private DefaultTableModel modelo;

	/**
	 * Método constructor.
	 */
	public PanelPago() {
		setBounds(0, 0, 472, 631);
		setBackground(new Color(255, 255, 255));
		setLayout(null);

		marcoTitulo = new JPanel();
		marcoTitulo.setBackground(new Color(100, 226, 159));
		marcoTitulo.setBounds(0, 99, 472, 64);
		add(marcoTitulo);
		marcoTitulo.setLayout(null);

		panelTabla = new JPanel();
		panelTabla.setBackground(new Color(255, 255, 255));
		panelTabla.setBounds(OpcionActual.centrar(getWidth(), 374), marcoTitulo.getHeight() + marcoTitulo.getY() + 10,
				374, 412);
		add(panelTabla);
		panelTabla.setLayout(null);

		panelGuardar = new JPanel();
		panelGuardar.setBackground(Color.WHITE);
		panelGuardar.setBounds(OpcionActual.centrar(panelTabla.getWidth(), 354), 310, 354, 62);
		panelTabla.add(panelGuardar);
		panelGuardar.setLayout(null);

		panelBanner = new JPanel();
		panelBanner.setBackground(Color.WHITE);
		panelBanner.setBounds(0, 0, 472, 100);
		add(panelBanner);
		panelBanner.setLayout(null);

		JLabel lblBanner = new JLabel("");
		lblBanner.setIcon(new ImageIcon("banner.jpg"));
		lblBanner.setBounds(0, 0, 472, 100);
		panelBanner.add(lblBanner);
		creaTitulo("Pago");
		creaTabla();
		agregaScroll();
		colocaBotonPagar();
		colocaBotonPagarEnTienda();
		creaModelo();
	}

	/**
	 * Método getter del botón guardar.
	 * 
	 * @return Botón guardar.
	 */
	public Button getBtnGuardar() {
		return btnGuardar;
	}

	/**
	 * Método getter del botón cancelar.
	 * 
	 * @return Botón cancelar.
	 */
	public Button getBtnCancelar() {
		return btnCancelar;
	}

	/**
	 * Método que rellena una fila de la tabla.
	 * 
	 * @param c Cita que se agrega a la tabla
	 */
	public void llenaCampo(Cita c) {
		Object[] fila = new Object[4];
		fila[0] = c.getTiempo().toString();
		fila[1] = c.getMascota().getNombre();
		fila[2] = c.getMotivo();
		fila[3] = c.getCosto();
		modelo.addRow(fila);
	}

	/**
	 * Método que agrega scroll al panel si los datos en la tabla son demasiados.
	 */
	private void agregaScroll() {
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(10, 11, 354, 288);
		panelTabla.add(scroll);
		scroll.setViewportView(table);
	}

	/**
	 * Método que coloca el botón de pagar.
	 */
	private void colocaBotonPagar() {
		btnGuardar = new Button("Pagar");
		btnGuardar.setBounds(OpcionActual.centrar(105, 105, panelGuardar.getWidth()),
				OpcionActual.centrar(panelGuardar.getHeight(), 35), 105, 35);
		panelGuardar.add(btnGuardar);
		btnGuardar.setForeground(new Color(255, 255, 255));
		btnGuardar.setBackground(new Color(36, 47, 65));
		btnGuardar.setFont(new Font("Cantarell", Font.BOLD, 12));
	}

	/**
	 * Método que coloca el botón de pagar en tienda.
	 */
	private void colocaBotonPagarEnTienda() {
		btnCancelar = new Button("Pagar en tienda");
		btnCancelar.setBounds(2 * OpcionActual.centrar(105, 105, panelGuardar.getWidth()) + 105,
				OpcionActual.centrar(panelGuardar.getHeight(), 35), 105, 35);
		panelGuardar.add(btnCancelar);
		btnCancelar.setForeground(new Color(36, 47, 65));
		btnCancelar.setFont(new Font("Cantarell", Font.BOLD, 12));
		btnCancelar.setBackground(new Color(100, 226, 159));
	}

	/**
	 * Método que crea titulo del panel
	 */
	private void creaTitulo(String titulo) {
		JLabel lblTitulo = new JLabel(titulo);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		marcoTitulo.add(lblTitulo);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Cantarell", Font.BOLD, 36));
		lblTitulo.setBounds(10, 11, 452, 42);
	}

	private void creaTabla() {
		table = new JTable();
		table.setEnabled(false);
		table.setBackground(Color.LIGHT_GRAY);
		table.setFont(new Font("Cantarell", Font.PLAIN, 12));
		table.setBounds(10, 11, 354, 288);
		table.setVisible(true);
	}

	/**
	 * Método que crea el modelo de la tabla
	 */
	private void creaModelo() {
		modelo = new DefaultTableModel();
		table.setModel(modelo);
		modelo.addColumn("Fecha");
		modelo.addColumn("Mascota");
		modelo.addColumn("Motivo de visita");
		modelo.addColumn("Precio");
	}
}
