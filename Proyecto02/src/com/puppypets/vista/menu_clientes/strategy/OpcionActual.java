package com.puppypets.vista.menu_clientes.strategy;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * Clase abstracta que modela el comportamiento de datos iniciales para una
 * cita.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 * 
 */

@SuppressWarnings("serial")
public abstract class OpcionActual extends JPanel {

	protected JPanel marcoTitulo;
	protected JPanel panelCuestionario;
	protected JPanel panelGuardar;
	protected JPanel panelBanner;
	protected JTextField txtNombreMascota;
	protected JComboBox<String> cmbSexo;
	protected JComboBox<Integer> cmbEdad;
	protected JComboBox<Integer> cmbDia;
	protected JComboBox<String> cmbMes;
	protected JComboBox<Integer> cmbYear;
	protected JComboBox<String> cmbHora;
	protected JComboBox<String> cmbEspecie;
	private Border emptyBorder = BorderFactory.createEmptyBorder();
	private Button btnGuardar;
	private Button btnCancelar;

	/**
	 * Método constructor
	 */
	public OpcionActual() {
		setBounds(0, 0, 472, 631);
		setBackground(new Color(255, 255, 255));
		setLayout(null);

		marcoTitulo = new JPanel();
		marcoTitulo.setBackground(new Color(100, 226, 159));
		marcoTitulo.setBounds(0, 99, 472, 64);
		add(marcoTitulo);
		marcoTitulo.setLayout(null);

		panelCuestionario = new JPanel();
		panelCuestionario.setBackground(new Color(255, 255, 255));
		panelCuestionario.setBounds(centrar(getWidth(), 374), marcoTitulo.getHeight() + marcoTitulo.getY() + 10, 374,
				412);
		add(panelCuestionario);
		panelCuestionario.setLayout(null);

		panelGuardar = new JPanel();
		panelGuardar.setBackground(Color.WHITE);
		panelGuardar.setBounds(centrar(panelCuestionario.getWidth(), 354), 310, 354, 62);
		panelCuestionario.add(panelGuardar);
		panelGuardar.setLayout(null);

		panelBanner = new JPanel();
		panelBanner.setBackground(Color.WHITE);
		panelBanner.setBounds(0, 0, 472, 100);
		add(panelBanner);
		panelBanner.setLayout(null);

		JLabel lblBanner = new JLabel("");
		lblBanner.setIcon(new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\matt-nelson-aI3EBLvcyu4-unsplash (1) (1).jpg"));
		lblBanner.setBounds(0, 0, 472, 100);
		panelBanner.add(lblBanner);

		creaTitulo();
		creaCuestionario();
		colocaBotones();
	}

	/**
	 * Método que crea el título del panel.
	 */
	abstract void creaTitulo();

	/**
	 * Método que crea el cuestionario del panel.
	 */
	abstract void creaCuestionario();

	/**
	 * Método que da el motivo de la cita
	 */
	public abstract String getMotivacion();
	
	/**
	 * Método para calcular el centro entre dos puntos.
	 * 
	 * @param a Primer punto
	 * @param b Segundo punto
	 * @return Punto medio entre dos punto
	 */
	public static int centrar(int a, int b) {
		int puntoMedio = (a - b) / 2;
		return puntoMedio;
	}

	/**
	 * Método que calcula la distnacia si se quiere poner un objeto en medio de dos
	 * espacios en blancos.
	 * 
	 * @param x Distancia b
	 * @param y Distnacia a
	 * @param z Distancia del objeto
	 * @return puntoMedio
	 */
	public static int centrar(int x, int y, int z) {
		int puntoMedio = (z - x - y) / 3;
		return puntoMedio;
	}

	/**
	 * Método getter hora
	 * 
	 * @return Regresa la hora y fecha de la cita
	 */
	public LocalDateTime getHora() {
		return LocalDateTime.of(parseoCmb(cmbYear), cmbMes.getSelectedIndex() + 1, parseoCmb(cmbDia), getHora(cmbHora),
				getMinuto(cmbHora));
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
	 * Método getter del nobmre de la mascota.
	 * 
	 * @return JTextField de el nombre de la mascota.
	 */
	public JTextField getTxtNombreMascota() {
		return txtNombreMascota;
	}

	/**
	 * Método getter del sexo de la mascota.
	 * 
	 * @return JComboBox de el sexo de una mascota
	 */
	public JComboBox<String> getCmbSexo() {
		return cmbSexo;
	}

	/**
	 * Método getter de la edad de la mascota.
	 * 
	 * @return JComboBox la edad de una mascota
	 */
	public JComboBox<Integer> getCmbEdad() {
		return cmbEdad;
	}

	/**
	 * Método getter del día de la cita.
	 * 
	 * @return JComboBox del día de la cita.
	 */
	public JComboBox<Integer> getCmbDia() {
		return cmbDia;
	}

	/**
	 * Método getter del mes de la cita.
	 * 
	 * @return JComboBox del mes de la cita.
	 */
	public JComboBox<String> getCmbMes() {
		return cmbMes;
	}

	/**
	 * Método getter del año de la cita.
	 * 
	 * @return JComboBox del año de la cita.
	 */
	public JComboBox<Integer> getCmbYear() {
		return cmbYear;
	}

	/**
	 * Método getter del hora de la cita.
	 * 
	 * @return JComboBox del hora de la cita.
	 */
	public JComboBox<String> getCmbHora() {
		return cmbHora;
	}

	/**
	 * Método getter de la especie de la mascota.
	 * 
	 * @return JComboBox de la especie de la mascota.
	 */
	public JComboBox<String> getCmbEspecie() {
		return cmbEspecie;
	}

	/**
	 * Método que genera el título.
	 * 
	 * @param titulo Nombre del panel
	 * @param width  Ancho del lo que abarca el título
	 */
	protected void creaTitulo(String titulo, int width) {
		JLabel lblTitulo = new JLabel(titulo);
		marcoTitulo.add(lblTitulo);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Cantarell", Font.BOLD, 36));
		int x = centrar(marcoTitulo.getWidth(), width);
		int y = centrar(marcoTitulo.getHeight(), 40);
		lblTitulo.setBounds(x, y, width, 40);
	}

	/**
	 * Método que da un cuestionario por defecto.
	 */
	protected void cuestionarioPorDefecto() {
		ingresaNombre();
		ingresaEdadySexo();
		ingresaCita();
		ingresaEspecie();
	}

	/**
	 * Método que agrega los botones.
	 */
	protected void colocaBotones() {
		btnGuardar = new Button("Confirmar cita");
		btnGuardar.setBounds(centrar(105, 105, panelGuardar.getWidth()), centrar(panelGuardar.getHeight(), 35), 105,
				35);
		panelGuardar.add(btnGuardar);
		btnGuardar.setForeground(new Color(255, 255, 255));
		btnGuardar.setBackground(new Color(36, 47, 65));
		btnGuardar.setFont(new Font("Cantarell", Font.BOLD, 12));

		btnCancelar = new Button("Cancelar");
		btnCancelar.setBounds(2 * centrar(105, 105, panelGuardar.getWidth()) + 105,
				centrar(panelGuardar.getHeight(), 35), 105, 35);
		panelGuardar.add(btnCancelar);
		btnCancelar.setForeground(new Color(36, 47, 65));
		btnCancelar.setFont(new Font("Cantarell", Font.BOLD, 12));
		btnCancelar.setBackground(new Color(100, 226, 159));
	}

	/**
	 * Método que convierte un la selección de ComboBox en un entero.
	 * 
	 * @param i ComboBox que se busca convertir a entero.
	 * @return Número entero en el interior del ComboBox.
	 */
	private int parseoCmb(JComboBox<Integer> i) {
		return Integer.parseInt(i.getSelectedItem().toString());
	}

	/**
	 * Método que convierte un ComboBox de hora y minuto en una hora.
	 * 
	 * @param s ComboBox que se busca convertir.
	 * @return La hora.
	 */
	private int getHora(JComboBox<String> s) {
		return Integer.parseInt(s.getSelectedItem().toString().substring(0, 2));
	}

	/**
	 * Método que convierte un ComboBox de hora y minuto en una hora.
	 * 
	 * @param s ComboBox que se busca convertir.
	 * @return El minuto.
	 */
	private int getMinuto(JComboBox<String> s) {
		return Integer.parseInt(s.getSelectedItem().toString().substring(3));
	}

	/**
	 * Método que añade los campos para ingresar el nombre de la mascota.
	 */
	private void ingresaNombre() {
		JLabel lblNombreMascota = new JLabel("Nombre de la mascota");
		lblNombreMascota.setBounds(33, 11, 331, 21);
		panelCuestionario.add(lblNombreMascota);
		lblNombreMascota.setFont(new Font("Cantarell", Font.BOLD, 14));

		txtNombreMascota = new JTextField();
		txtNombreMascota.setBounds(37, 43, 327, 20);
		panelCuestionario.add(txtNombreMascota);
		txtNombreMascota.setFont(new Font("Montserrat Medium", Font.PLAIN, 12));
		txtNombreMascota.setBorder(emptyBorder);
		txtNombreMascota.setBackground(Color.WHITE);
		txtNombreMascota.setColumns(10);

		JEditorPane separador = new JEditorPane();
		separador.setBounds(33, 67, 331, 3);
		panelCuestionario.add(separador);
		separador.setEnabled(false);
		separador.setEditable(false);
		separador.setBackground(new Color(36, 47, 65));
	}

	/**
	 * Método que añade los campos para ingresar la edad y sexo de la mascota.
	 */
	private void ingresaEdadySexo() {
		JLabel lblSexoyEdad = new JLabel("Sexo y edad");
		lblSexoyEdad.setBounds(33, 86, 331, 21);
		panelCuestionario.add(lblSexoyEdad);
		lblSexoyEdad.setFont(new Font("Cantarell", Font.BOLD, 14));

		cmbSexo = new JComboBox<>();
		cmbSexo.setBounds(33, 118, 86, 22);
		cmbSexo.setBackground(Color.WHITE);
		panelCuestionario.add(cmbSexo);
		cmbSexo.setModel(new DefaultComboBoxModel<String>(new String[] { "Hembra", "Macho" }));

		cmbEdad = new JComboBox<>();
		cmbEdad.setBounds(154, 118, 55, 22);
		cmbEdad.setBackground(Color.WHITE);
		panelCuestionario.add(cmbEdad);
		cmbEdad.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
				14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 }));
	}

	/**
	 * Método que añade los campos para agreagar la fecha y hora de la cita.
	 */
	private void ingresaCita() {
		JLabel lblFechayHora = new JLabel("Fecha y hora de la cita");
		lblFechayHora.setBounds(33, 161, 331, 21);
		panelCuestionario.add(lblFechayHora);
		lblFechayHora.setFont(new Font("Cantarell", Font.BOLD, 14));

		cmbDia = new JComboBox<>();
		cmbDia.setBounds(81, 193, 41, 20);
		cmbDia.setBackground(Color.WHITE);
		panelCuestionario.add(cmbDia);
		cmbDia.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
				15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 }));
		cmbDia.setSelectedIndex(15);

		cmbYear = new JComboBox<>();
		cmbYear.setBounds(193, 193, 58, 20);
		cmbYear.setBackground(Color.WHITE);
		panelCuestionario.add(cmbYear);
		cmbYear.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 2022, 2023 }));

		cmbMes = new JComboBox<>();
		cmbMes.setBounds(129, 193, 54, 20);
		cmbMes.setBackground(Color.WHITE);
		panelCuestionario.add(cmbMes);
		cmbMes.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic" }));
		cmbMes.setSelectedIndex(10);

		cmbHora = new JComboBox<>();
		cmbHora.setBounds(302, 193, 62, 20);
		cmbHora.setBackground(Color.WHITE);
		panelCuestionario.add(cmbHora);
		cmbHora.setModel(new DefaultComboBoxModel<String>(new String[] { "10:00", "10:30", "11:00", "11:30", "12:00",
				"12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30" }));

		JLabel lblHora = new JLabel("Hora:");
		lblHora.setBounds(261, 193, 38, 20);
		panelCuestionario.add(lblHora);
		lblHora.setFont(new Font("Montserrat", Font.PLAIN, 12));

		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(33, 193, 46, 20);
		panelCuestionario.add(lblFecha);
		lblFecha.setFont(new Font("Montserrat", Font.PLAIN, 12));
	}

	/**
	 * Método que añade los campos para el registro de la especie de la mascota.
	 */
	private void ingresaEspecie() {
		JLabel lblEspecie = new JLabel("Especie");
		lblEspecie.setBounds(33, 224, 331, 21);
		panelCuestionario.add(lblEspecie);
		lblEspecie.setFont(new Font("Cantarell", Font.BOLD, 14));

		cmbEspecie = new JComboBox<>();
		cmbEspecie.setBounds(33, 253, 86, 22);
		panelCuestionario.add(cmbEspecie);
		cmbEspecie.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Perro", "Gato", "Pez", "Iguana", "Cobaya", "Ratón", "Hámster", "Pájaro" }));
		cmbEspecie.setBackground(Color.WHITE);
	}

}
