package com.puppypets.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Button;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

/**
 * Clase que implementa el frame de registro
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 *
 */
@SuppressWarnings("serial")
public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtUsuario;
	private JPasswordField passwordField;
	private JPasswordField passwordConfirmacion;
	private Button btnGuardar;
	private Button btnCancelar;
	private JCheckBox chckbxTerminos;
	private JTextField txtCuenta;
	private JPanel panelLogo;
	private JPanel panelRegistro;
	private JPanel panelImagen;
	Border emptyBorder = BorderFactory.createEmptyBorder();

	/**
	 * Create the frame.
	 */
	public Registro() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\PP.png"));
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 795);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

		creaPanelLogo();
		creaPanelRegistro();
	}

	/**
	 * Método getter del nombre
	 * 
	 * @return JTextField del nombre del usuario.
	 */
	public JTextField getTxtNombre() {
		return txtNombre;
	}

	/**
	 * Método getter del teléfono
	 * 
	 * @return JTextField del teléfono del usuario.
	 */
	public JTextField getTxtTelefono() {
		return txtTelefono;
	}

	/**
	 * Método getter de la dirección
	 * 
	 * @return JTextField de la dirección del usuario.
	 */
	public JTextField getTxtDireccion() {
		return txtDireccion;
	}

	/**
	 * Método getter del nombre de usuario
	 * 
	 * @return JTextField del nombre de usuario del usuario.
	 */
	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	/**
	 * Método getter de la constraseña
	 * 
	 * @return JPasswordField de la contraseña del usuario.
	 */
	public JPasswordField getPasswordField() {
		return passwordField;
	}

	/**
	 * Método getter de la confirmación de contraseña.
	 * 
	 * @return JPasswordField de la confirmación de contraseña del usuario.
	 */
	public JPasswordField getPasswordConfirmacion() {
		return passwordConfirmacion;
	}

	/**
	 * Método getter del botón de guardar.
	 * 
	 * @return Butón de guardar.
	 */
	public Button getBtnGuardar() {
		return btnGuardar;
	}

	/**
	 * Método getter del botón de cancelar.
	 * 
	 * @return Botón de cancelar.
	 */
	public Button getBtnCancelar() {
		return btnCancelar;
	}

	/**
	 * Método getter de la checkbox de los términos y condiciones.
	 * 
	 * @return CheckBox de los términos y condiciones.
	 */
	public JCheckBox getChckbxTerminos() {
		return chckbxTerminos;
	}

	/**
	 * Método getter del número de cuenta bancario del usuario.
	 * 
	 * @return JTextField del número de cuenta bancario del usuario.
	 */
	public JTextField getTxtCuenta() {
		return txtCuenta;
	}

	/**
	 * Método que crea el panel logo donde se desplegará una imagén y un icono.
	 */
	private void creaPanelLogo() {
		panelLogo = new JPanel();
		panelLogo.setBackground(new Color(36, 47, 65));
		contentPane.add(panelLogo);
		panelLogo.setLayout(null);

		JLabel lblIcono = new JLabel("");
		lblIcono.setIcon(new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\register (1).png"));
		lblIcono.setBounds(65, 121, 264, 300);
		panelLogo.add(lblIcono);

		JLabel lblTitulo = new JLabel("Registro");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Montserrat Medium", Font.BOLD, 36));
		lblTitulo.setBounds(95, 52, 175, 58);
		panelLogo.add(lblTitulo);

		panelImagen = new JPanel();
		panelImagen.setBackground(new Color(64, 128, 128));
		panelImagen.setBounds(0, 432, 380, 214);
		panelLogo.add(panelImagen);
		panelImagen.setLayout(null);

		JLabel imgCompu = new JLabel("");
		imgCompu.setIcon(new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\christin-hume-Hcfwew744z4-unsplash.png"));
		imgCompu.setBounds(0, 0, 380, 214);
		panelImagen.add(imgCompu);
	}

	/**
	 * Método que crea el panel de registro donde ingresará los datos el usuario.
	 */
	private void creaPanelRegistro() {
		panelRegistro = new JPanel();
		panelRegistro.setBackground(new Color(250, 108, 113));
		contentPane.add(panelRegistro);
		panelRegistro.setLayout(null);

		agregaNombre();
		agregaTelefono();
		agregaDireccion();
		agregaUsuario();
		agregaPassword();
		agregaConfirmacion();
		agregaBotonGuardar();
		agregaBotonCancelar();
		agregaTerminos();
		agregaCuentaBancaria();
	}

	/**
	 * Método que añade los campos para introducir el nombre del nuevo cliente.
	 */
	private void agregaNombre() {
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(new Color(36, 47, 65));
		lblNombre.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblNombre.setBounds(48, 30, 83, 31);
		panelRegistro.add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setForeground(Color.WHITE);
		txtNombre.setCaretColor(Color.LIGHT_GRAY);
		txtNombre.setBorder(emptyBorder);
		txtNombre.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtNombre.setBackground(new Color(250, 108, 113));
		txtNombre.setBounds(48, 59, 259, 20);
		panelRegistro.add(txtNombre);
		txtNombre.setColumns(10);

		JEditorPane separador = new JEditorPane();
		separador.setEnabled(false);
		separador.setEditable(false);
		separador.setBackground(new Color(36, 47, 65));
		separador.setBounds(48, 90, 259, 2);
		panelRegistro.add(separador);
	}

	/**
	 * Método que añade los campos para introducir el teléfono del nuevo cliente
	 */
	private void agregaTelefono() {
		JLabel telefono = new JLabel("Teléfono");
		telefono.setForeground(new Color(36, 47, 65));
		telefono.setFont(new Font("Montserrat", Font.BOLD, 14));
		telefono.setBounds(48, 114, 83, 31);
		panelRegistro.add(telefono);

		txtTelefono = new JTextField();
		txtTelefono.setForeground(Color.WHITE);
		txtTelefono.setCaretColor(Color.LIGHT_GRAY);
		txtTelefono.setBorder(emptyBorder);
		txtTelefono.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtTelefono.setColumns(10);
		txtTelefono.setBackground(new Color(250, 108, 113));
		txtTelefono.setBounds(48, 143, 259, 20);
		panelRegistro.add(txtTelefono);

		JEditorPane separador1 = new JEditorPane();
		separador1.setEnabled(false);
		separador1.setEditable(false);
		separador1.setBackground(new Color(36, 47, 65));
		separador1.setBounds(48, 174, 259, 2);
		panelRegistro.add(separador1);
	}

	/**
	 * Método que añade los campos para introducir la dirección del nuevo usuario.
	 */
	private void agregaDireccion() {
		JLabel lblDireccion = new JLabel("Dirección");
		lblDireccion.setForeground(new Color(36, 47, 65));
		lblDireccion.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblDireccion.setBounds(48, 197, 83, 31);
		panelRegistro.add(lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.setForeground(Color.WHITE);
		txtDireccion.setCaretColor(Color.LIGHT_GRAY);
		txtDireccion.setBorder(emptyBorder);
		txtDireccion.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtDireccion.setColumns(10);
		txtDireccion.setBackground(new Color(250, 108, 113));
		txtDireccion.setBounds(48, 226, 259, 20);
		panelRegistro.add(txtDireccion);

		JEditorPane separador2 = new JEditorPane();
		separador2.setForeground(new Color(36, 47, 65));
		separador2.setEnabled(false);
		separador2.setEditable(false);
		separador2.setBackground(new Color(36, 47, 65));
		separador2.setBounds(48, 257, 259, 2);
		panelRegistro.add(separador2);
	}

	/**
	 * Método que agrega los campos para ingresar el usuario.
	 */
	private void agregaUsuario() {
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(new Color(36, 47, 65));
		lblUsuario.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblUsuario.setBounds(48, 360, 83, 31);
		panelRegistro.add(lblUsuario);

		txtUsuario = new JTextField();
		txtUsuario.setForeground(Color.WHITE);
		txtUsuario.setCaretColor(Color.LIGHT_GRAY);
		txtUsuario.setBorder(emptyBorder);
		txtUsuario.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtUsuario.setColumns(10);
		txtUsuario.setBackground(new Color(250, 108, 113));
		txtUsuario.setBounds(48, 389, 259, 20);
		panelRegistro.add(txtUsuario);

		JEditorPane separador3 = new JEditorPane();
		separador3.setEnabled(false);
		separador3.setEditable(false);
		separador3.setBackground(new Color(36, 47, 65));
		separador3.setBounds(48, 420, 259, 2);
		panelRegistro.add(separador3);
	}

	/**
	 * Método para agregar los campos de la creación constraseña.
	 */
	private void agregaPassword() {
		JLabel lblPassword = new JLabel("Contraseña");
		lblPassword.setForeground(new Color(36, 47, 65));
		lblPassword.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblPassword.setBounds(48, 446, 93, 31);
		panelRegistro.add(lblPassword);

		JEditorPane separador4 = new JEditorPane();
		separador4.setEnabled(false);
		separador4.setEditable(false);
		separador4.setBackground(new Color(36, 47, 65));
		separador4.setBounds(48, 506, 259, 2);
		panelRegistro.add(separador4);

		passwordField = new JPasswordField();
		passwordField.setForeground(Color.WHITE);
		passwordField.setCaretColor(Color.LIGHT_GRAY);
		passwordField.setBorder(emptyBorder);
		passwordField.setBackground(new Color(250, 108, 113));
		passwordField.setBounds(48, 476, 259, 20);
		panelRegistro.add(passwordField);
	}

	/**
	 * Método que agrega los campos para la confirmación de contraseña.
	 */
	private void agregaConfirmacion() {
		JLabel lblConfirmacion = new JLabel("Confirmación");
		lblConfirmacion.setForeground(new Color(36, 47, 65));
		lblConfirmacion.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblConfirmacion.setBounds(48, 529, 105, 31);
		panelRegistro.add(lblConfirmacion);

		JEditorPane separador5 = new JEditorPane();
		separador5.setEnabled(false);
		separador5.setEditable(false);
		separador5.setBackground(new Color(36, 47, 65));
		separador5.setBounds(48, 589, 259, 2);
		panelRegistro.add(separador5);

		passwordConfirmacion = new JPasswordField();
		passwordConfirmacion.setForeground(Color.WHITE);
		passwordConfirmacion.setCaretColor(Color.LIGHT_GRAY);
		passwordConfirmacion.setBorder(emptyBorder);
		passwordConfirmacion.setBackground(new Color(250, 108, 113));
		passwordConfirmacion.setBounds(48, 559, 259, 20);
		panelRegistro.add(passwordConfirmacion);
	}

	/**
	 * Método que agrega el botón guardar.
	 */
	private void agregaBotonGuardar() {
		btnGuardar = new Button("Guardar");
		btnGuardar.setBackground(new Color(36, 47, 65));
		btnGuardar.setForeground(new Color(255, 255, 255));
		btnGuardar.setFont(new Font("Montserrat", Font.BOLD, 12));
		btnGuardar.setBounds(70, 653, 83, 31);
		panelRegistro.add(btnGuardar);
	}

	/**
	 * Método que agrega el botón cancelar.
	 */
	private void agregaBotonCancelar() {
		btnCancelar = new Button("Cancelar");
		btnCancelar.setFont(new Font("Montserrat", Font.BOLD, 12));
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setBackground(new Color(250, 108, 113));
		btnCancelar.setBounds(212, 653, 83, 31);
		panelRegistro.add(btnCancelar);
	}

	/**
	 * Método que agrega los campos para aceptar los términos y condiciones.
	 */
	private void agregaTerminos() {
		chckbxTerminos = new JCheckBox("Acepto términos y condiciones");
		chckbxTerminos.setBackground(new Color(250, 108, 113));
		chckbxTerminos.setBounds(92, 610, 203, 31);
		panelRegistro.add(chckbxTerminos);
	}

	/**
	 * Método que agreaga los campos para ingresar la cuenta bancaria.
	 */
	private void agregaCuentaBancaria() {
		JLabel lblCuenta = new JLabel("Cuenta bancaria");
		lblCuenta.setForeground(new Color(36, 47, 65));
		lblCuenta.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblCuenta.setBounds(48, 281, 144, 31);
		panelRegistro.add(lblCuenta);

		txtCuenta = new JTextField();
		txtCuenta.setForeground(Color.WHITE);
		txtCuenta.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtCuenta.setColumns(10);
		txtCuenta.setCaretColor(Color.LIGHT_GRAY);
		txtCuenta.setBackground(new Color(250, 108, 113));
		txtCuenta.setBorder(emptyBorder);
		txtCuenta.setBounds(48, 310, 259, 20);
		panelRegistro.add(txtCuenta);

		JEditorPane separador6 = new JEditorPane();
		separador6.setForeground(new Color(36, 47, 65));
		separador6.setEnabled(false);
		separador6.setEditable(false);
		separador6.setBackground(new Color(36, 47, 65));
		separador6.setBounds(48, 341, 259, 2);
		panelRegistro.add(separador6);
	}
}
