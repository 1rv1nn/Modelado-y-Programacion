package com.puppypets.controlador;

import java.awt.event.ActionEvent;
import java.util.Optional;

import javax.swing.JOptionPane;

import com.puppypets.modelo.Usuario;
import com.puppypets.modelo.Veterinario;
import com.puppypets.modelo.proxy.Cliente;
import com.puppypets.vista.InicioSesion;

public class CtrlLogIn implements CtrlFrames {
	private static CtrlLogIn controlador;
	private CtrlClientes cc;
	private CtrlVeterinarios cv;
	private InicioSesion frmInicio;

	private CtrlLogIn() {
		frmInicio = new InicioSesion();
		this.cc = CtrlClientes.getInstancia();
		this.cv = CtrlVeterinarios.getInstancia();
		frmInicio.getBtnLogIn().addActionListener(this);
		frmInicio.getBtnRegister().addActionListener(this);
	}

	public static CtrlLogIn getInstancia() {
		if (controlador == null) {
			controlador = new CtrlLogIn();
		}
		return controlador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object accion = e.getSource();
		if (accion.equals(frmInicio.getBtnLogIn())) {
			System.out.println("h");
			iniciaSesion().ifPresent(u -> escogePanel(u));
			limpiaCampos();
		} else if (accion.equals(frmInicio.getBtnRegister())) {
			ocultaFrame();
			CtrlRegistro.getInstancia().iniciaFrame();
		}
	}

	@Override
	public void iniciaFrame() {
		frmInicio.setVisible(true);
	}

	@Override
	public void ocultaFrame() {
		frmInicio.setVisible(false);
	}

	@Override
	public void limpiaCampos() {
		frmInicio.getTxtUsername().setText("");
		frmInicio.getPasswordField().setText("");
	}

	@Override
	public void eliminaFrame() {
		frmInicio.dispose();
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

	private Optional<Usuario> iniciaSesion() {
		String usuario = frmInicio.getTxtUsername().getText();
		StringBuilder password = new StringBuilder();
		password.append(frmInicio.getPasswordField().getPassword());
		if (cc.obtenerCliente(usuario).isEmpty() && cv.obtenerVeterinario(usuario).isEmpty()) {
			mandaError("No existe la cuenta que ingreso, registrese.");
			return Optional.empty();
		} else if (cc.obtenerCliente(usuario).map(c -> verificaPassword(c, password.toString())).orElse(false))
			return Optional.of(cc.obtenerCliente(usuario).get());
		else if (cv.obtenerVeterinario(usuario).map(v -> verificaPassword(v, password.toString())).orElse(false))
			return Optional.of(cv.obtenerVeterinario(usuario).get());
		return Optional.empty();
	}

	private boolean verificaPassword(Usuario u, String password) {
		if (u.getPassword().equals(password))
			return true;
		mandaError("La contraseña no es correcta");
		return false;
	}

	private void escogePanel(Usuario u) {
		if (u instanceof Cliente) {
			CtrlMenuCliente.getInstancia().setUsuarioActual((Cliente) u);
			CtrlMenuCliente.getInstancia().iniciaFrame();
		} else if (u instanceof Veterinario) {
			CtrlMenuVeterinario.getInstancia().setUsuarioActual((Veterinario) u);
			CtrlMenuVeterinario.getInstancia().iniciaFrame();
		}
		ocultaFrame();
	}
}
