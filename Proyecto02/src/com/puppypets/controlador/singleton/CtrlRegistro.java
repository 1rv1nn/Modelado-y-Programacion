package com.puppypets.controlador.singleton;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import com.puppypets.controlador.CtrlFrames;
import com.puppypets.modelo.proxy.Cliente;
import com.puppypets.vista.Registro;

public class CtrlRegistro implements CtrlFrames {

	private static CtrlRegistro controlador;
	private Registro frmRegistro;

	private CtrlRegistro() {
		frmRegistro = new Registro();
		frmRegistro.getBtnCancelar().addActionListener(this);
		frmRegistro.getBtnGuardar().addActionListener(this);
	}

	public static CtrlRegistro getInstancia() {
		if (controlador == null)
			controlador = new CtrlRegistro();
		return controlador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object accion = e.getSource();
		if (accion.equals(frmRegistro.getBtnGuardar())) {
			registro();
		} else if (accion.equals(frmRegistro.getBtnCancelar())) {
			ocultaFrame();
			CtrlLogIn.getInstancia().iniciaFrame();
		}
	}

	@Override
	public void iniciaFrame() {
		frmRegistro.setVisible(true);
	}

	@Override
	public void ocultaFrame() {
		frmRegistro.setVisible(false);
	}

	@Override
	public void limpiaCampos() {
		frmRegistro.getTxtNombre().setText("");
		frmRegistro.getTxtTelefono().setText("");
		frmRegistro.getTxtDireccion().setText("");
		frmRegistro.getTxtCuenta().setText("");
		frmRegistro.getTxtUsuario().setText("");
		frmRegistro.getPasswordConfirmacion().setText("");
		frmRegistro.getPasswordField().setText("");
		frmRegistro.getChckbxTerminos().setSelected(false);
	}

	@Override
	public void eliminaFrame() {
		frmRegistro.dispose();
	}

	@Override
	public void mandaError(String error) {
		JOptionPane.showMessageDialog(null, error, "ERROR | Al iniciar sesión", JOptionPane.ERROR_MESSAGE);
		limpiaCampos();
	}

	@Override
	public void mandaMensaje(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
	}

	private void registro() {
		String nombre = frmRegistro.getTxtNombre().getText();
		String usuario = frmRegistro.getTxtUsuario().getText();
		String telefono = frmRegistro.getTxtTelefono().getText();
		String cuenta = frmRegistro.getTxtCuenta().getText();
		String direccion = frmRegistro.getTxtDireccion().getText();
		String password = new String(frmRegistro.getPasswordField().getPassword());
		String passwordConfirm = new String(frmRegistro.getPasswordConfirmacion().getPassword());

		Cliente clienteNuevo = new Cliente(usuario, password, nombre, telefono, direccion, cuenta);
		try {
			lanzaErrorDatoInvalido(CtrlClientes.getInstancia().validaDatosCliente(clienteNuevo));
			lanzaErrorTerminos();
			lanzaErrorCamposVacios(nombre, direccion, usuario);
			lanzaErrorPassword(password, passwordConfirm);
			registraNuevoUsuario(clienteNuevo);
		} catch (Exception e) {
		}
	}

	private void registraNuevoUsuario(Cliente clienteNuevo) {
		CtrlClientes.getInstancia().agregaCliente(clienteNuevo);
		mandaMensaje("Se ha registrado el usuario correctamente.", "Registro completado");
		limpiaCampos();
		ocultaFrame();
		CtrlLogIn.getInstancia().iniciaFrame();
	}

	private void lanzaErrorDatoInvalido(String validacion) {
		if (validacion.contains("TEL")) {
			mandaError("Ingreso un télefono invalido.");
			limpiaCampos();
			throw new IllegalArgumentException();
		} else if (validacion.contains("NUM")) {
			mandaError("Ingreso un número de cuenta invalido.");
			limpiaCampos();
			throw new IllegalArgumentException();
		} else if (validacion.contains("USUARIO")) {
			mandaError("El usuario ya existe, intente con otro.");
			limpiaCampos();
			throw new IllegalArgumentException();
		}
	}

	private void lanzaErrorTerminos() {
		if (!frmRegistro.getChckbxTerminos().isSelected()) {
			mandaError("No ha aceptado los terminos de condición");
			limpiaCampos();
			throw new IllegalArgumentException();
		}
	}

	private void lanzaErrorCamposVacios(String nombre, String direccion, String usuario) {
		if (nombre.equals("") || direccion.equals("") || usuario.equals("")) {
			mandaError("No ha contestado toda la informacion");
			limpiaCampos();
			throw new IllegalArgumentException();
		}
	}

	private void lanzaErrorPassword(String password, String confirmacion) {
		if (!password.equals(confirmacion)) {
			mandaError("Las contraseñas no coinciden");
			limpiaCampos();
			throw new IllegalArgumentException();
		}
	}

}
