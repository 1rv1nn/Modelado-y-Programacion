package com.puppypets.vista.menu_vet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.puppypets.modelo.builder.Cita;
import com.puppypets.vista.MiniPanel;

import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class MenuVeterinario extends JFrame {

	public final Color VERDE_OSCURO = new Color(139, 182, 64);
	public final Color VERDE = new Color(162, 203, 74);
	public final Color VERDE_CLARO = new Color(179, 220, 83);
	private JPanel contentPane;
	private JTable tablaClientes;
	private OpcionesDelVeterinario panelOpciones;
	private JPanel panelTabla;
	private JPanel panelPrincipal;
	private JLabel lblTitulo;
	private JLabel lblNombre;
	private DefaultTableModel modelo;

	/**
	 * Create the frame.
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
		tablaClientes.setModel(modelo);
		creaModeloCitas();
	}
	
	private void creaTabla() {
		panelTabla = new JPanel();
		panelTabla.setBackground(new Color(36, 47, 65));
		panelTabla.setBounds(10, 136, 631, 329);
		panelPrincipal.add(panelTabla);
		panelTabla.setLayout(null);
		
		tablaClientes = new JTable();
		tablaClientes.setBounds(10, 11, 611, 307);
		tablaClientes.setEnabled(false);
		tablaClientes.setVisible(true);
		agregaScroll();
	}
	
	private void creaTitulo() {
		lblTitulo = new JLabel("Titulo");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Cantarell", Font.BOLD, 36));
		lblTitulo.setBounds(10, 59, 631, 52);
		panelPrincipal.add(lblTitulo);
	}
	
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
	
	public void cambiaTitulo(String titulo) {
		lblTitulo.setText(titulo);
	}
	
	public void cambiaDr(String nombre) {
		lblNombre.setText(nombre);
	}
	
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

	public JTable getTablaClientes() {
		return tablaClientes;
	}

	public OpcionesDelVeterinario getPanelOpciones() {
		return panelOpciones;
	}

	public void setPanelOpciones(OpcionesDelVeterinario panelOpciones) {
		this.panelOpciones = panelOpciones;
	}

	private void agregaScroll() {
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(10, 11, 611, 307);
		panelTabla.add(scroll);
		scroll.setViewportView(tablaClientes);
	}

	public void setPanelTabla(JPanel panelTabla) {
		this.panelTabla = panelTabla;
	}

	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}

	public void setPanelPrincipal(JPanel panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}
	
	public void llenaCampoCita(Cita c) {
		Object[] fila = new Object[5];
		fila[0] = c.getTiempo().toString();
		fila[1] = c.getMascota().getOwner().getId();
		fila[2] = c.getMascota().getEspecie();
		fila[3] = c.getMascota().getNombre();
		fila[4] = c.getMotivo();
		modelo.addRow(fila);
	}

	private void creaModeloCitas() {
		modelo.addColumn("Fecha de cita");
		modelo.addColumn("ID Cliente");
		modelo.addColumn("Especie");
		modelo.addColumn("Mascota");
		modelo.addColumn("Motivo de visita");
	}
	public void llenaCampoMascotas(Cita c) {
		Object[] fila = new Object[4];
		fila[0] = c.getMascota().getId();
		fila[1] = c.getMascota().getEspecie();
		fila[2] = c.getTiempo();
		fila[3] = c.getMascota().getEdad();
		modelo.addRow(fila);
	}
	
	public void cambioATablaMascota(MiniPanel mp) {
		restablecerTodos();
		modelo.setColumnCount(0);
		modelo.setRowCount(0);
		modelo.fireTableDataChanged();
		mp.setClicks(mp.getClicks() + 1);
		mp.setBackground(VERDE_CLARO);
		creaModeloMascotas();
	}
	
	public void cambioATablaCita(MiniPanel mp) {
		restablecerTodos();
		modelo.setColumnCount(0);
		modelo.setRowCount(0);
		modelo.fireTableDataChanged();
		mp.setClicks(mp.getClicks() + 1);
		mp.setBackground(VERDE_CLARO);
		creaModeloCitas();
	}
	
	private void restablecerTodos() {
		panelOpciones.getOpciones().stream().forEach(p -> p.setBackground(p.getDefaultColour()));
	}
	
	private void creaModeloMascotas() {
		modelo.addColumn("ID Mascota");
		modelo.addColumn("Especie");
		modelo.addColumn("Fecha de visita");
		modelo.addColumn("Edad");
	}
}
