package com.puppypets.vista.menu_vet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.puppypets.modelo.builder.Cita;
import com.puppypets.vista.MiniPanel;
import com.puppypets.vista.menu_vet.builder.ConstructorOpcionesDelVeterinario;
import com.puppypets.vista.menu_vet.builder.OpcionesDelVeterinario;

import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

/**
 * Clase que implementa el menu del veterinario.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 *
 */
@SuppressWarnings("serial")
public class MenuVeterinario extends JFrame {

	public final Color VERDE_OSCURO = new Color(139, 182, 64);
	public final Color VERDE = new Color(162, 203, 74);
	public final Color VERDE_CLARO = new Color(179, 220, 83);
	private JPanel contentPane;
	private JTable tabla;
	private OpcionesDelVeterinario panelOpciones;
	private JPanel panelTabla;
	private JPanel panelPrincipal;
	private JLabel lblTitulo;
	private JLabel lblNombre;
	private DefaultTableModel modelo;

	/**
	 * Método constructor del menú del veterinario.
	 */
	public MenuVeterinario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(36, 47, 65));
		panelPrincipal.setBounds(266, 0, 651, 476);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		creaOpciones();
		creaTabla();
		creaBienvenida();
		creaTitulo();
		creaOpciones();
		cambiaTitulo("Próximas citas");
		modelo = new DefaultTableModel();
		tabla.setModel(modelo);
		creaModeloCitas();
	}

	/**
	 * Método getter de la tabla.
	 * 
	 * @return Tabla
	 */
	public JTable getTablaClientes() {
		return tabla;
	}

	/**
	 * Método getter de las opciones del menú.
	 * 
	 * @return Panel de opciones del menú.
	 */
	public OpcionesDelVeterinario getPanelOpciones() {
		return panelOpciones;
	}
	

	/**
	 * Método que cambia el título dependiendo lo que se escoja.
	 * 
	 * @param titulo Título de la tabla.
	 */
	public void cambiaTitulo(String titulo) {
		lblTitulo.setText(titulo);
	}

	/**
	 * Método que cambia el nombre del dr. dependiendo el veterinario que ingrese.
	 * 
	 * @param nombre Nombre del dr.
	 */
	public void cambiaDr(String nombre) {
		lblNombre.setText(nombre);
	}

	/**
	 * Método que añade una cita a la tabla para visualizar las citas.
	 * 
	 * @param c Cita de la cual se va a modelar.
	 */
	public void llenaCampoCita(Cita c) {
		Object[] fila = new Object[5];
		fila[0] = c.getTiempo().toString();
		fila[1] = c.getMascota().getOwner().getId();
		fila[2] = c.getMascota().getEspecie();
		fila[3] = c.getMascota().getNombre();
		fila[4] = c.getMotivo();
		modelo.addRow(fila);
	}

	/**
	 * Método que añade una cita a la tabla para visualizar a las mascotas.
	 * 
	 * @param c Cita de la cual se va a modelar.
	 */
	public void llenaCampoMascotas(Cita c) {
		Object[] fila = new Object[4];
		fila[0] = c.getMascota().getId();
		fila[1] = c.getMascota().getEspecie();
		fila[2] = c.getTiempo();
		fila[3] = c.getMascota().getEdad();
		System.out.println(fila);
		modelo.addRow(fila);
	}

	/**
	 * Método que cambia a tablas de mascota.
	 * 
	 * @param mp Minipanel seleccionado.
	 */
	public void cambioATablaMascota(MiniPanel mp) {
		limpiaOpciones();
		modelo.setColumnCount(0);
		modelo.setRowCount(0);
		modelo.fireTableDataChanged();
		mp.setClicks(mp.getClicks() + 1);
		mp.setBackground(VERDE_CLARO);
		creaModeloMascotas();
	}

	/**
	 * Método que cambia a tablas de citas.
	 * 
	 * @param mp Minipanel seleccionado.
	 */
	public void cambioATablaCita(MiniPanel mp) {
		limpiaOpciones();
		modelo.setColumnCount(0);
		modelo.setRowCount(0);
		modelo.fireTableDataChanged();
		mp.setClicks(mp.getClicks() + 1);
		mp.setBackground(VERDE_CLARO);
		creaModeloCitas();
	}
	
	public void restablece() {
		limpiaOpciones();
		panelOpciones.getCitasAgendadas().setBackground(VERDE_CLARO);
		panelOpciones.getCitasAgendadas().setClicks(1);
		modelo.setColumnCount(0);
		modelo.setRowCount(0);
		modelo.fireTableDataChanged();
		creaModeloCitas();
	}
	
	/**
	 * Método que restablece los paneles de las opciones
	 */
	private void limpiaOpciones() {
		panelOpciones.getOpciones().stream().forEach(p -> p.setBackground(p.getDefaultColour()));
		panelOpciones.getOpciones().stream().forEach(p -> p.setClicks(0));
		cambiaTitulo("Próximas citas"); 
	}

	/**
	 * Método que crea la tabla.
	 */
	private void creaTabla() {
		panelTabla = new JPanel();
		panelTabla.setBackground(new Color(36, 47, 65));
		panelTabla.setBounds(10, 136, 631, 329);
		panelPrincipal.add(panelTabla);
		panelTabla.setLayout(null);

		tabla = new JTable();
		tabla.setBounds(10, 11, 611, 307);
		tabla.setEnabled(false);
		tabla.setVisible(true);
		agregaScroll();
	}

	/**
	 * Método que crea el título de la opción.
	 */
	private void creaTitulo() {
		lblTitulo = new JLabel("Titulo");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Cantarell", Font.BOLD, 36));
		lblTitulo.setBounds(10, 59, 631, 52);
		panelPrincipal.add(lblTitulo);
	}

	/**
	 * Método que crea la bienvenida al doctor.
	 */
	private void creaBienvenida() {
		JLabel lblBienvenida = new JLabel("Bienvenido");
		lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenida.setForeground(Color.WHITE);
		lblBienvenida.setFont(new Font("Cantarell", Font.BOLD, 22));
		lblBienvenida.setBounds(10, 51, 246, 33);
		panelOpciones.add(lblBienvenida);

		lblNombre = new JLabel("");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Cantarell", Font.BOLD | Font.ITALIC, 20));
		lblNombre.setBounds(10, 83, 246, 33);
		panelOpciones.add(lblNombre);
	}

	/**
	 * Método que crea el panel de opciones.
	 */
	private void creaOpciones() {
		ImageIcon imgCita = new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\appointment (1).png");
		MiniPanel panelCita = new MiniPanel("Consulta próximas citas", imgCita, 170, VERDE);

		ImageIcon imgMascota = new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\mascota (1).png");
		MiniPanel panelMascota = new MiniPanel("Consulta mascotas", imgMascota, 220, VERDE);

		ImageIcon imgPago = new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\credit-card (1).png");
		MiniPanel panelPago = new MiniPanel("Consulta citas pagadas", imgPago, 280, VERDE_OSCURO);

		ImageIcon imgLogOut = new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\logout (1).png");
		MiniPanel panelLogOut = new MiniPanel("Cerrar sesión", imgLogOut, 340, VERDE_OSCURO);

		panelCita.setBackground(VERDE_CLARO);
		panelCita.setClicks(1);
		ConstructorOpcionesDelVeterinario builder = new ConstructorOpcionesDelVeterinario();
		builder.setCitasAgendadas(panelCita);
		builder.setMascotasAgendadas(panelMascota);
		builder.setClientesPago(panelPago);
		builder.setPanelLogOut(panelLogOut);
		panelOpciones = new OpcionesDelVeterinario(builder);
		contentPane.add(panelOpciones);
	}
	

	/**
	 * Método para agregar scroll por si la tabla tiene demasiados datos.
	 */
	private void agregaScroll() {
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(10, 11, 611, 307);
		panelTabla.add(scroll);
		scroll.setViewportView(tabla);
	}

	/**
	 * Método que crea el modelo de tabla de acuerdo para visualizar solo citas.
	 */
	private void creaModeloCitas() {
		modelo.addColumn("Fecha de cita");
		modelo.addColumn("ID Cliente");
		modelo.addColumn("Especie");
		modelo.addColumn("Mascota");
		modelo.addColumn("Motivo de visita");
	}

	/**
	 * Método que crea el modelo de tabla de acuerdo para visualizar solo citas.
	 */
	private void creaModeloMascotas() {
		modelo.addColumn("ID Mascota");
		modelo.addColumn("Especie");
		modelo.addColumn("Fecha de visita");
		modelo.addColumn("Edad");
	}
}