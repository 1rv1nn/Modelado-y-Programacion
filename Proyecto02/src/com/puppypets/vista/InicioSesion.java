package com.puppypets.vista;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 * Clase que implementa el frame de inicio de sesión.
 * 
 * @author Cruz González Irvin Javier
 * @author Ugalde Flores Jimena
 * @author Ugalde Ubaldo Fernando
 * @version Oracle JDK 17.0 LTS
 *
 */
@SuppressWarnings("serial")
public class InicioSesion extends JFrame {
	private JPanel contentPane;
	private JPanel panelLogo;
	private JPanel panelInicioSesion;
	private JTextField txtUsername;
	private JPasswordField passwordField;
	private Button btnLogIn;
	private Button btnRegister;
	private Border emptyBorder = BorderFactory.createEmptyBorder();

	/**
	 * Método constructor de la clase.
	 */
	public InicioSesion() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\PP.png"));
		setTitle("Puppy Pets");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 468);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		creaPanelLogo();
		creaPanelInicioSesion();
	}

	/**
	 * Método getter de txt
	 * @return El JTextField de username
	 */
	public JTextField getTxtUsername() {
		return txtUsername;
	}

	/**
	 * Método getter de la password
	 * @return JPasswordField de la contraseña
	 */
	public JPasswordField getPasswordField() {
		return passwordField;
	}

	/**
	 * Método getter del botón login
	 * @return Botón login
	 */
	public Button getBtnLogIn() {
		return btnLogIn;
	}

	/**
	 * Método getter del botón registrar
	 * @return Botón registrar.
	 */
	public Button getBtnRegister() {
		return btnRegister;
	}
	
	/**
	 * Método que crea el panel de inicio de sesión.
	 */
	private void creaPanelInicioSesion() {
		panelInicioSesion = new JPanel();
		panelInicioSesion.setBorder(null);
		panelInicioSesion.setForeground(new Color(255, 255, 255));
		contentPane.add(panelInicioSesion);
		panelInicioSesion.setBackground(new Color(36, 47, 65));
		panelInicioSesion.setLayout(null);
		agregaUsuario();
		agregaPassword();
		agregarBotonIniciarSesion();
		agregarBotonRegistrar();
	}

	/**
	 * Método que crea el panel del logo.
	 */
	private void creaPanelLogo() {
		panelLogo = new JPanel();
		contentPane.add(panelLogo);
		panelLogo.setBackground(new Color(170, 239, 234));
		panelLogo.setLayout(null);
		creaLogo();
	}

	/**
	 * Método que crea todos los atributos que lleva el panel logo.
	 */
	private void creaLogo() {
		JLabel imgLogo = new JLabel("");
		imgLogo.setIcon(new ImageIcon(
				"D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\PuppyPets grande.png"));
		imgLogo.setBounds(45, 110, 274, 256);
		panelLogo.add(imgLogo);

		JEditorPane separador = new JEditorPane();
		separador.setEnabled(false);
		separador.setEditable(false);
		separador.setBackground(new Color(229, 244, 254));
		separador.setBounds(45, 377, 274, 3);
		panelLogo.add(separador);

		JEditorPane separador1 = new JEditorPane();
		separador1.setEnabled(false);
		separador1.setEditable(false);
		separador1.setBackground(new Color(229, 244, 254));
		separador1.setBounds(92, 405, 155, 3);
		panelLogo.add(separador1);

		JLabel lblMarca = new JLabel("Puppy Pets ©");
		lblMarca.setBounds(45, 38, 274, 44);
		panelLogo.add(lblMarca);
		lblMarca.setFont(new Font("Montserrat Medium", Font.BOLD, 36));
		lblMarca.setForeground(SystemColor.text);

		JLabel lblEslogan = new JLabel("¡Cuidando de tu mejor amigo!");
		lblEslogan.setFont(new Font("Cantarell", Font.BOLD, 12));
		lblEslogan.setForeground(new Color(250, 108, 113));
		lblEslogan.setBounds(83, 385, 196, 19);
		panelLogo.add(lblEslogan);
	}

	/**
	 * Método que agrega los campos para agregar un usuario.
	 */
	private void agregaUsuario() {
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(new Color(229, 244, 254));
		lblUsuario.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblUsuario.setBounds(51, 98, 77, 14);
		panelInicioSesion.add(lblUsuario);

		txtUsername = new JTextField();
		txtUsername.setBorder(emptyBorder);
		txtUsername.setCaretColor(Color.LIGHT_GRAY);
		txtUsername.setForeground(Color.LIGHT_GRAY);
		txtUsername.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtUsername.setBackground(new Color(36, 47, 65));
		txtUsername.setBounds(51, 123, 259, 20);
		panelInicioSesion.add(txtUsername);
		txtUsername.setColumns(10);

		JEditorPane separador2 = new JEditorPane();
		separador2.setEnabled(false);
		separador2.setEditable(false);
		separador2.setBackground(new Color(229, 244, 254));
		separador2.setBounds(51, 154, 259, 2);
		panelInicioSesion.add(separador2);
	}

	/**
	 * Método que agreaga los campos para agregar la contraseña
	 */
	private void agregaPassword() {
		JLabel lblPassword = new JLabel("Contraseña:");
		lblPassword.setForeground(new Color(229, 244, 254));
		lblPassword.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblPassword.setBounds(51, 180, 89, 14);
		panelInicioSesion.add(lblPassword);

		JEditorPane separador3 = new JEditorPane();
		separador3.setEnabled(false);
		separador3.setEditable(false);
		separador3.setBackground(new Color(229, 244, 254));
		separador3.setBounds(51, 236, 259, 2);
		panelInicioSesion.add(separador3);

		passwordField = new JPasswordField();
		passwordField.setBorder(emptyBorder);
		passwordField.setCaretColor(Color.LIGHT_GRAY);
		passwordField.setForeground(Color.LIGHT_GRAY);
		passwordField.setBackground(new Color(36, 47, 65));
		passwordField.setBounds(51, 205, 259, 20);
		panelInicioSesion.add(passwordField);
	}

	/**
	 * Método que añade el botón de iniciar sesión.
	 */
	private void agregarBotonIniciarSesion() {
		btnLogIn = new Button("Iniciar sesión");
		btnLogIn.setBackground(new Color(153, 211, 255));
		btnLogIn.setForeground(new Color(255, 255, 255));
		btnLogIn.setFont(new Font("Montserrat", Font.BOLD, 12));
		btnLogIn.setBounds(51, 259, 115, 37);
		panelInicioSesion.add(btnLogIn);
	}

	/**
	 * Método que añade el botón de registrarse.
	 */
	private void agregarBotonRegistrar() {
		btnRegister = new Button("Registrate");
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("Montserrat", Font.BOLD, 12));
		btnRegister.setBackground(new Color(36, 47, 65));
		btnRegister.setBounds(195, 259, 115, 37);
		panelInicioSesion.add(btnRegister);
	}
}
