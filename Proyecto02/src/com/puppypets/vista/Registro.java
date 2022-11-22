package com.puppypets.vista;

import java.awt.Color;
import java.awt.Font;
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

	/**
	 * Create the frame.
	 */
	public Registro() {
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 795);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(36, 47, 65));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblIcono = new JLabel("");
		lblIcono.setIcon(new ImageIcon("D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\register (1).png"));
		lblIcono.setBounds(65, 121, 264, 300);
		panel.add(lblIcono);
		
		JLabel lblTitulo = new JLabel("Registro");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Montserrat Medium", Font.BOLD, 36));
		lblTitulo.setBounds(95, 52, 175, 58);
		panel.add(lblTitulo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(64, 128, 128));
		panel_2.setBounds(0, 432, 380, 214);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel imgCompu = new JLabel("");
		imgCompu.setIcon(new ImageIcon("D:\\106956120\\Documents\\Programming\\Git\\Modelado-y-Programacion\\Proyecto02\\christin-hume-Hcfwew744z4-unsplash.png"));
		imgCompu.setBounds(0, 0, 380, 214);
		panel_2.add(imgCompu);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 108, 113));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(new Color(36, 47, 65));
		lblNombre.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblNombre.setBounds(48, 30, 83, 31);
		panel_1.add(lblNombre);
		
		Border emptyBorder = BorderFactory.createEmptyBorder();
		
		txtNombre = new JTextField();
		txtNombre.setForeground(Color.WHITE);
		txtNombre.setCaretColor(Color.LIGHT_GRAY);
		txtNombre.setBorder(emptyBorder);
		txtNombre.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtNombre.setBackground(new Color(250, 108, 113));
		txtNombre.setBounds(48, 59, 259, 20);
		panel_1.add(txtNombre);
		txtNombre.setColumns(10);
		
		JEditorPane separador = new JEditorPane();
		separador.setEnabled(false);
		separador.setEditable(false);
		separador.setBackground(new Color(36, 47, 65));
		separador.setBounds(48, 90, 259, 2);
		panel_1.add(separador);
		
		JLabel telefono = new JLabel("Teléfono");
		telefono.setForeground(new Color(36, 47, 65));
		telefono.setFont(new Font("Montserrat", Font.BOLD, 14));
		telefono.setBounds(48, 114, 83, 31);
		panel_1.add(telefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setForeground(Color.WHITE);
		txtTelefono.setCaretColor(Color.LIGHT_GRAY);
		txtTelefono.setBorder(emptyBorder);
		txtTelefono.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtTelefono.setColumns(10);
		txtTelefono.setBackground(new Color(250, 108, 113));
		txtTelefono.setBounds(48, 143, 259, 20);
		panel_1.add(txtTelefono);
		
		JEditorPane separador1 = new JEditorPane();
		separador1.setEnabled(false);
		separador1.setEditable(false);
		separador1.setBackground(new Color(36, 47, 65));
		separador1.setBounds(48, 174, 259, 2);
		panel_1.add(separador1);
		
		JLabel lblDireccion = new JLabel("Dirección");
		lblDireccion.setForeground(new Color(36, 47, 65));
		lblDireccion.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblDireccion.setBounds(48, 197, 83, 31);
		panel_1.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setForeground(Color.WHITE);
		txtDireccion.setCaretColor(Color.LIGHT_GRAY);
		txtDireccion.setBorder(emptyBorder);
		txtDireccion.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtDireccion.setColumns(10);
		txtDireccion.setBackground(new Color(250, 108, 113));
		txtDireccion.setBounds(48, 226, 259, 20);
		panel_1.add(txtDireccion);
		
		JEditorPane separador2 = new JEditorPane();
		separador2.setForeground(new Color(36, 47, 65));
		separador2.setEnabled(false);
		separador2.setEditable(false);
		separador2.setBackground(new Color(36, 47, 65));
		separador2.setBounds(48, 257, 259, 2);
		panel_1.add(separador2);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(new Color(36, 47, 65));
		lblUsuario.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblUsuario.setBounds(48, 360, 83, 31);
		panel_1.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setForeground(Color.WHITE);
		txtUsuario.setCaretColor(Color.LIGHT_GRAY);
		txtUsuario.setBorder(emptyBorder);
		txtUsuario.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtUsuario.setColumns(10);
		txtUsuario.setBackground(new Color(250, 108, 113));
		txtUsuario.setBounds(48, 389, 259, 20);
		panel_1.add(txtUsuario);
		
		JEditorPane separador3 = new JEditorPane();
		separador3.setEnabled(false);
		separador3.setEditable(false);
		separador3.setBackground(new Color(36, 47, 65));
		separador3.setBounds(48, 420, 259, 2);
		panel_1.add(separador3);
		
		JLabel lblPassword = new JLabel("Contraseña");
		lblPassword.setForeground(new Color(36, 47, 65));
		lblPassword.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblPassword.setBounds(48, 446, 93, 31);
		panel_1.add(lblPassword);
		
		JEditorPane separador4 = new JEditorPane();
		separador4.setEnabled(false);
		separador4.setEditable(false);
		separador4.setBackground(new Color(36, 47, 65));
		separador4.setBounds(48, 506, 259, 2);
		panel_1.add(separador4);
		
		JLabel lblConfirmacion = new JLabel("Confirmación");
		lblConfirmacion.setForeground(new Color(36, 47, 65));
		lblConfirmacion.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblConfirmacion.setBounds(48, 529, 105, 31);
		panel_1.add(lblConfirmacion);
		
		JEditorPane separador5 = new JEditorPane();
		separador5.setEnabled(false);
		separador5.setEditable(false);
		separador5.setBackground(new Color(36, 47, 65));
		separador5.setBounds(48, 589, 259, 2);
		panel_1.add(separador5);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(Color.WHITE);
		passwordField.setCaretColor(Color.LIGHT_GRAY);
		passwordField.setBorder(emptyBorder);
		passwordField.setBackground(new Color(250, 108, 113));
		passwordField.setBounds(48, 476, 259, 20);
		panel_1.add(passwordField);
		
		passwordConfirmacion = new JPasswordField();
		passwordConfirmacion.setForeground(Color.WHITE);
		passwordConfirmacion.setCaretColor(Color.LIGHT_GRAY);
		passwordConfirmacion.setBorder(emptyBorder);
		passwordConfirmacion.setBackground(new Color(250, 108, 113));
		passwordConfirmacion.setBounds(48, 559, 259, 20);
		panel_1.add(passwordConfirmacion);
		
		btnGuardar = new Button("Guardar");
		btnGuardar.setBackground(new Color(36, 47, 65));
		btnGuardar.setForeground(new Color(255, 255, 255));
		btnGuardar.setFont(new Font("Montserrat", Font.BOLD, 12));
		btnGuardar.setBounds(70, 653, 83, 31);
		panel_1.add(btnGuardar);
		
		btnCancelar = new Button("Cancelar");
		btnCancelar.setFont(new Font("Montserrat", Font.BOLD, 12));
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setBackground(new Color(250, 108, 113));
		btnCancelar.setBounds(212, 653, 83, 31);
		panel_1.add(btnCancelar);
		
		chckbxTerminos = new JCheckBox("Acepto términos y condiciones");
		chckbxTerminos.setBackground(new Color(250, 108, 113));
		chckbxTerminos.setBounds(92, 610, 203, 31);
		panel_1.add(chckbxTerminos);
		
		JLabel lblCuenta = new JLabel("Cuenta bancaria");
		lblCuenta.setForeground(new Color(36, 47, 65));
		lblCuenta.setFont(new Font("Montserrat", Font.BOLD, 14));
		lblCuenta.setBounds(48, 281, 144, 31);
		panel_1.add(lblCuenta);
		
		txtCuenta = new JTextField();
		txtCuenta.setForeground(Color.WHITE);
		txtCuenta.setFont(new Font("Montserrat", Font.PLAIN, 14));
		txtCuenta.setColumns(10);
		txtCuenta.setCaretColor(Color.LIGHT_GRAY);
		txtCuenta.setBackground(new Color(250, 108, 113));
		txtCuenta.setBorder(emptyBorder);
		txtCuenta.setBounds(48, 310, 259, 20);
		panel_1.add(txtCuenta);
		
		JEditorPane separador6 = new JEditorPane();
		separador6.setForeground(new Color(36, 47, 65));
		separador6.setEnabled(false);
		separador6.setEditable(false);
		separador6.setBackground(new Color(36, 47, 65));
		separador6.setBounds(48, 341, 259, 2);
		panel_1.add(separador6);
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JTextField getTxtTelefono() {
		return txtTelefono;
	}

	public JTextField getTxtDireccion() {
		return txtDireccion;
	}

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public JPasswordField getPasswordConfirmacion() {
		return passwordConfirmacion;
	}

	public Button getBtnGuardar() {
		return btnGuardar;
	}

	public Button getBtnCancelar() {
		return btnCancelar;
	}

	public JCheckBox getChckbxTerminos() {
		return chckbxTerminos;
	}

	public JTextField getTxtCuenta() {
		return txtCuenta;
	}
	
}
